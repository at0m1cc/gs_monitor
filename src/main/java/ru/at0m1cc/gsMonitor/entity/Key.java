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
@Table(name = "grand_smeta_key")
public class Key {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "number_for_key")
    private String numberForKey;
    @Column(name = "organization")
    private String organization;
    @Column(name = "certification_sertificate")
    private String certificationSertificate;
    @Column(name = "note")
    private String note;
    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
    @Column(name = "date_of_issue")
    private LocalDate dateOfIssue;
    @Column(name = "path_statement")
    private String pathStatement;
    @Column(name = "id_for_key_d")
    private String idForKeyD;
    @Column(name = "id_for_key_h")
    private String idForKeyH;
}
