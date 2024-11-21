package ru.at0m1cc.gsMonitor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ru.at0m1cc.gsMonitor.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query(value = "SELECT users.name, users.group_user, users.hostname, users.id_grand_smeta_soft, users.date_update, users.note, grand_smeta_key.number_for_key FROM users FULL JOIN grand_smeta_key ON users.id = grand_smeta_key.id_user;", nativeQuery = true)
    public List<?> getUserAndKeyInfo();
}