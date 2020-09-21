package com.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.entity.JobPortal;
import com.jobportal.service.JobPortalService;

@RestController
@RequestMapping("/jobportal")
public class JobPortalController {

	@Autowired
	JobPortalService jobPortalService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<JobPortal>> findAllJobs(){
		return new ResponseEntity<List<JobPortal>>(jobPortalService.findAll(),new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/findByExperience/{experience}")
	public ResponseEntity<List<JobPortal>> findJobByExperience(@PathVariable("experience") int experience){
		return new ResponseEntity<List<JobPortal>>(jobPortalService.findByExperience(experience),new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/findByDesignation/{designation}")
	public ResponseEntity<List<JobPortal>> findByDesignation(@PathVariable("designation") String designation){
		return new ResponseEntity<List<JobPortal>>(jobPortalService.findByDesignationCode(designation),new HttpHeaders(),HttpStatus.OK);
	}
	
	@PostMapping("/createJob")
	public ResponseEntity<JobPortal> createJob(@RequestBody JobPortal newJob){
		return new ResponseEntity<JobPortal>(jobPortalService.save(newJob),new HttpHeaders(),HttpStatus.OK);
	}
}
