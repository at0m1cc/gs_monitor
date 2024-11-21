package ru.at0m1cc.gsMonitor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ru.at0m1cc.gsMonitor.entity.Key;

@Repository
public interface KeyRepository extends JpaRepository<Key, Long>{
    @Query(value = "SELECT * FROM grand_smeta_key WHERE id_user > 0;", nativeQuery = true)
    public List<Key> findAllNotNullIdUser();
}
