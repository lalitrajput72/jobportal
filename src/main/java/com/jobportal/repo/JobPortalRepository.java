package com.jobportal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.entity.JobPortal;


@Repository
public interface JobPortalRepository extends JpaRepository<JobPortal, Integer>{
	
	@SuppressWarnings("unchecked")
	JobPortal save(JobPortal newJob);
	List<JobPortal> findByExperience(int experience);
	List<JobPortal> findByDesignationCode(String designation);
	
}

