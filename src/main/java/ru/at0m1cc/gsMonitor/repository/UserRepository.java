package ru.at0m1cc.gsMonitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.at0m1cc.gsMonitor.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    public User findByName(String name);
}