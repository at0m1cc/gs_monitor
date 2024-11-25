package ru.at0m1cc.gsMonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ru.at0m1cc.gsMonitor.entity.GrandSmeta;



@Repository
public interface GrandSmetaRepository extends JpaRepository<GrandSmeta, Long>{
    @Query(value = "SELECT * FROM grand_smeta_soft ORDER BY id DESC LIMIT 1", nativeQuery = true)
    public GrandSmeta findMaxId();

    public GrandSmeta findBySoftVersion(String softVersion);
}
