package ru.at0m1cc.gsMonitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.at0m1cc.gsMonitor.entity.GrandSmeta;
import ru.at0m1cc.gsMonitor.repository.GrandSmetaRepository;

@Service
public class GrandSmetaService {
    @Autowired
    private GrandSmetaRepository grandSmetaRepository;
    
    public String getLastVersion(){
        return grandSmetaRepository.findMaxId().getSoftVersion();
    }

    public List<GrandSmeta> getAllGrandSmeta(){
        return grandSmetaRepository.findAll();
    }

    public GrandSmeta getGrandSmetaByVersion(String softVersion){
        return grandSmetaRepository.findBySoftVersion(softVersion);
    }
}
