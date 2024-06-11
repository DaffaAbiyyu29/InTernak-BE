package id.ac.astra.polytechnic.internakbe.service;

import id.ac.astra.polytechnic.internakbe.model.User;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;

public interface UserService {
    DtoResponse getAllUsers();

    DtoResponse getUserActive();

    DtoResponse saveUser(User user);

    DtoResponse updateUser(User user);

    DtoResponse deleteUser(User user);
    DtoResponse getUserById(Integer userId);


}

