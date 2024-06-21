package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.model.User;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;

public interface UserService {
    DtoResponse registerUser(User user);
    DtoResponse getUserByEmailAndPassword(String email, String password);
    DtoResponse getAllUsers();

    DtoResponse getUserActive();

    DtoResponse saveUser(User user);

    DtoResponse updateUser(User user);

    DtoResponse deleteUser(User user);
    DtoResponse getUserById(Integer userId);


}

