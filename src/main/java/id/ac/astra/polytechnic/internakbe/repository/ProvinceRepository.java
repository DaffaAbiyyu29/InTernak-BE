package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
}
