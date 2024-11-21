package ru.at0m1cc.gsMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.at0m1cc.gsMonitor.entity.Key;
import ru.at0m1cc.gsMonitor.repository.KeyRepository;

@Service
public class KeyService {
    @Autowired
    private KeyRepository keyRepository;

    public List<Key> getKeyAndUser(){
        return keyRepository.findAllNotNullIdUser();
    }
}
