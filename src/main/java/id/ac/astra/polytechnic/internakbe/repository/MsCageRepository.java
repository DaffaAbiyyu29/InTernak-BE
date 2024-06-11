package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.model.MsCage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsCageRepository extends JpaRepository<MsCage, Integer> {
}
