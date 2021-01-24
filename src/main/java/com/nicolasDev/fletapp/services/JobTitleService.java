package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.JobTitle;
import com.nicolasDev.fletapp.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    // Get
    public List<JobTitle> getJobTitles(){
        return jobTitleRepository.findAll();
    }

    // get By id
    public Optional<JobTitle> findById(Integer id){
        return jobTitleRepository.findById(id);
    }

    // save
    public void saveJobTitle(JobTitle jobTitle){
        jobTitleRepository.save(jobTitle);
    }

    // Update
    public void updateJobTitle(JobTitle jobTitle){
        jobTitleRepository.save(jobTitle);
    }

    // Delete
    public void deleteJobTitle(Integer id){
        jobTitleRepository.deleteById(id);
    }










}
