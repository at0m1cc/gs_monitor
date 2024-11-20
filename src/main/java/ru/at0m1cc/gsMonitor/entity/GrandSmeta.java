package ru.at0m1cc.gsMonitor.entity;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "grand_smeta_soft")
public class GrandSmeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "soft_version")
    private String softVersion;
    @Column(name = "date_resolution")
    private LocalDate dateResolution;
    @Column(name = "note")
    private String note;
}
