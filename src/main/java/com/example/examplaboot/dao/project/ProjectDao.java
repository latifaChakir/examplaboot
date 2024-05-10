package com.example.examplaboot.dao.project;

import com.example.examplaboot.bean.project.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao extends JpaRepository<Project,Long> {
    Project findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
    List<Project> findAll();
}