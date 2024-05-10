package com.example.examplaboot.bean.project;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String libelle;
    private String description;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private double cout;
    @ManyToOne
    private EtatProject etatProject;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public EtatProject getEtatProject() {
        return etatProject;
    }

    public void setEtatProject(EtatProject etatProject) {
        this.etatProject = etatProject;
    }
}