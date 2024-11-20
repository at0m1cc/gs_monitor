package ru.at0m1cc.gsMonitor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "group_user")
    private String groupUser;
    @Column(name = "hostname")
    private String hostname;
    @OneToOne
    @JoinColumn(name = "id_grand_smeta_soft")
    private GrandSmeta grandSmeta;
    @Column(name = "date_update")
    private LocalDate dateUpdate;
    @OneToOne
    @JoinColumn(name = "id_grand_smeta_key")
    private Key key;
    @Column(name = "note")
    private String note;
}
