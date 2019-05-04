package com.dao;

import java.util.ArrayList;

import com.model.Trainee;

public interface traineeDao {


	int deleteTrainee(int id);

	int updateTrainee(Trainee trainee);

	Trainee getById(int id);

	ArrayList<Trainee> getAll();

	Trainee register(Trainee trainee);

	int login(Trainee trainee);

}
