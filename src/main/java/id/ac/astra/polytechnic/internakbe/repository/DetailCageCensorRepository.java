package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.model.DetailCageCensor;
import id.ac.astra.polytechnic.internakbe.model.DetailCageCensorPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DetailCageCensorRepository extends JpaRepository<DetailCageCensor, DetailCageCensorPK> {
}
