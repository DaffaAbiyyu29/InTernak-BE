package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.constant.UserConstant;
import id.ac.astra.polytechnic.internakbe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Procedure(procedureName = "GetUserById")
    List<Object[]> getUserById(int userId);

    @Query(
            value = "SELECT * FROM ms_user WHERE usr_status = ?1",
            nativeQuery = true
    )
    List<User> findByStatus(int status);

    @Query(value = UserConstant.qGetLogin, nativeQuery = true)
    User findUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    @Query(value = UserConstant.qGetEmailUser, nativeQuery = true)
    String getExistingEmail(@Param("email") String email);

    @Query(value = UserConstant.qGetUserByEmail, nativeQuery = true)
    User findUserByEmail(@Param("email") String email);

    @Query(value = UserConstant.qGetUserByPassword, nativeQuery = true)
    User findUserByPassword(@Param("password") String password);

    //boolean existsByUsr_usernameOrUsr_email(String username, String email);

}
