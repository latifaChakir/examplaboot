package com.example.examplaboot.service.project;

import com.example.examplaboot.bean.project.Project;
import com.example.examplaboot.dao.project.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;


    public Project findByLibelle(String libelle) {
        return projectDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return projectDao.deleteByLibelle(libelle);
    }

    public List<Project> findAll() {
        return projectDao.findAll();
    }

    public int save(Project project) {
        if (findByLibelle(project.getLibelle()) != null) {
            return -1;
        } else {
            projectDao.save(project);
            return 1;
        }
    }

}