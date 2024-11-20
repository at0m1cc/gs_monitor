package ru.at0m1cc.gsMonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.at0m1cc.gsMonitor.entity.GrandSmeta;

@Repository
public interface GrandSmetaRepository extends JpaRepository<GrandSmeta, Long>{
    
}
