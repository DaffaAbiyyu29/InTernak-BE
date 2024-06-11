package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
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

    //boolean existsByUsr_usernameOrUsr_email(String username, String email);

}
