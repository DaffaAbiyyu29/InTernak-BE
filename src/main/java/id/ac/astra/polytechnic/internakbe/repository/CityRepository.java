package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {

    List<City> findByPrvId(Integer prv_id);
}
