package com.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.entity.JobPortal;
import com.jobportal.repo.JobPortalRepository;

@Service
public class JobPortalServiceImpl implements JobPortalService{

	@Autowired
	JobPortalRepository jobPortalRepository;
	@Override
	public List<JobPortal> findAll() {
		return jobPortalRepository.findAll();
	}
	@Override
	public JobPortal save(JobPortal newJob) {
		return jobPortalRepository.save(newJob);
	}
	@Override
	public List<JobPortal> findByExperience(int experience) {
		return jobPortalRepository.findByExperience(experience);
	}
	@Override
	public List<JobPortal> findByDesignationCode(String designation) {
		return jobPortalRepository.findByDesignationCode(designation);
	}
	
}
