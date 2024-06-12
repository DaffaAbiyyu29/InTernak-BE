package id.ac.astra.polytechnic.internakbe.service.impl;

import id.ac.astra.polytechnic.internakbe.dao.UserDao;
import id.ac.astra.polytechnic.internakbe.model.User;
import id.ac.astra.polytechnic.internakbe.repository.UserRepository;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.UserService;
import id.ac.astra.polytechnic.internakbe.vo.UserVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserDao userDao, UserRepository userRepository) {
        this.userDao = userDao;
        this.userRepository = userRepository;
    }

    public DtoResponse getAllUsers() {
        return this.userDao.getAllUsers() != null ? new DtoResponse(200, this.userDao.getAllUsers()) : new DtoResponse(200, (Object)null, "No data available");
    }

    public DtoResponse getUserActive() {
        return this.userDao.getUserActive() != null ? new DtoResponse(200, this.userDao.getUserActive()) : new DtoResponse(200, (Object)null, "No data available");
    }

    public DtoResponse getUserById(Integer userId) {
        List<UserVo> users = Collections.singletonList(this.userDao.getUserById(userId));
        if (users != null && !users.isEmpty()) {
            return new DtoResponse(200, users, "successfully get user.");
        } else {
            return new DtoResponse(200, null, "No data available.");
        }
    }

//    public DtoResponse saveUser(User user) {
//        try {
//            boolean userExists = this.userDao.findByUsernameOrEmail(user.getUsr_username(), user.getUsr_email());
//            if (userExists) {
//                return new DtoResponse(500, user, "Failed to create User, Username or Email was used");
//            } else {
//                String encryptedPassword = encodePasswordMD5(user.getUsr_password());
//                user.setUsr_password(encryptedPassword);
//                this.userRepository.save(user);
//                return new DtoResponse(200, user, "User created successfully");
//            }
//        } catch (Exception e) {
//            return new DtoResponse(500, user, "Failed to create User due to an internal error");
//        }
//    }


    public DtoResponse saveUser(User user) {
        try {
            this.userRepository.save(user);
            return new DtoResponse(200, user, "User created successfully");
        } catch (Exception var3) {
            return new DtoResponse(500, user, "Failed to create Uaser");
        }
    }

    private String encodePasswordMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }


    public DtoResponse updateUser(User user) {
        try {
            String encryptedPassword = encodePasswordMD5(user.getUsr_password());
            user.setUsr_password(encryptedPassword);
            User updateUser = (User)this.userRepository.save(user);
            return updateUser != null ? new DtoResponse(200, updateUser, "User updated successfully") : new DtoResponse(404, (Object)null, "User not found");
        } catch (Exception var4) {
            return new DtoResponse(500, user, "Failed to update User");
        }
    }

    public DtoResponse deleteUser(User user) {
        User userData = (User)this.userRepository.findById(user.getUsr_id()).orElseThrow();
        if (userData != null) {
            try {
                this.userRepository.delete(user);
                return new DtoResponse(200, userData, "User deleted sucessfully");
            } catch (Exception var4) {
                return new DtoResponse(500, userData, "Failed to update User");
            }
        } else {
            return new DtoResponse(404, (Object)null, "User not found");
        }
    }
}
