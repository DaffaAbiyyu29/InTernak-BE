package id.ac.astra.polytechnic.internakbe.repository;

import id.ac.astra.polytechnic.internakbe.model.tsRealtimeCensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface tsRealtimeCensorRepository extends JpaRepository<tsRealtimeCensor,Integer> {
    @Procedure(procedureName = "getLatestData")
    public tsRealtimeCensor getLatestData();
}
