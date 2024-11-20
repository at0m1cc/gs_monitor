package ru.at0m1cc.gsMonitor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.at0m1cc.gsMonitor.repository.GrandSmetaRepository;

@Service
public class GrandSmetaService {
    @Autowired
    private GrandSmetaRepository grandSmetaRepository;
    
    public String getLastVersion(){
        return grandSmetaRepository.findMaxId().getSoftVersion();
    }
}
