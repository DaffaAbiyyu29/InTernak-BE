package id.ac.astra.polytechnic.internakbe.dao;

import id.ac.astra.polytechnic.internakbe.model.User;
import id.ac.astra.polytechnic.internakbe.vo.UserVo;

import java.util.List;

public interface UserDao {

    List<UserVo> getAllUsers();

    List<UserVo> getUserActive();
    UserVo getUserById(Integer userId);

    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int usr_id);


}