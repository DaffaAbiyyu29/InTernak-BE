package id.ac.astra.polytechnic.internakbe.rest;

import id.ac.astra.polytechnic.internakbe.model.User;
import id.ac.astra.polytechnic.internakbe.response.DtoResponse;
import id.ac.astra.polytechnic.internakbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/users"})
@CrossOrigin
public class UserRest {
    @Autowired
    private UserService userService;

    public UserRest(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getUserByEmailAndPassword")
    public DtoResponse getSkemas(@RequestParam("usr_email") String email, @RequestParam("usr_password") String password){
        return userService.getUserByEmailAndPassword(email, password);
    }

//    @PostMapping("/registerUser")
//    public DtoResponse registerUser(@RequestBody User user){
//        return userService.registerUser(user);
//    }
//
//    @PostMapping("/resetPasswordByEmail")
//    public DtoResponse resetPasswordByEmail(@RequestParam("email") String email){
//        return userService.resetPasswordByEmail(email);
//    }
//
//    @PostMapping("/resetPassword")
//    public DtoResponse resetPasswordById(@RequestParam("oldpassword") String oldPassword, @RequestParam("newpassword") String newPassword){
//        return userService.resetPasswordByTempPassword(oldPassword, newPassword);
//    }

    @GetMapping({"/getUsers"})
    public DtoResponse getUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/getUserById/{userId}")
    public DtoResponse getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping({"/getUserActive"})
    public DtoResponse getUserActive() {
        return this.userService.getUserActive();
    }

    @PostMapping({"/saveUser"})
    public DtoResponse createUser(@RequestBody User user) {
        return this.userService.saveUser(user);
    }

    @PostMapping({"/updateUser"})
    public DtoResponse updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }

    @PostMapping({"/deleteUser"})
    public DtoResponse deleteUser(@RequestBody User user) {
        return this.userService.deleteUser(user);
    }
}