package com.jobportal.service;

import java.util.List;

import com.jobportal.entity.JobPortal;

public interface JobPortalService {

	List<JobPortal> findAll();
	JobPortal save(JobPortal newJob);
	List<JobPortal> findByExperience(int experience);
	List<JobPortal> findByDesignationCode(String designation);
}
