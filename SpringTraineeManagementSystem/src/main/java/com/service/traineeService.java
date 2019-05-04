package com.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

import com.model.Trainee;

public interface traineeService {
	
	public Trainee register(@RequestBody Trainee trainee);

	public int login(Trainee trainee);
	int deleteTrainee(int id);
	int updateTrainee(Trainee trainee);
	Trainee getById(int id);
	ArrayList<Trainee> getAll();

}
