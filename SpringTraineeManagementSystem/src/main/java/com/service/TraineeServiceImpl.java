package com.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.traineeDao;
import com.model.Trainee;

@Component("trainee1")
@Service
@Transactional
public class TraineeServiceImpl implements traineeService {

	@Autowired
	traineeDao tdao;

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		return tdao.deleteTrainee(id);
	}

	@Override
	public int updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return tdao.updateTrainee(trainee);
	}

	@Override
	public Trainee getById(int id) {
		// TODO Auto-generated method stub
		return tdao.getById(id);
	}

	@Override
	public ArrayList<Trainee> getAll() {
		// TODO Auto-generated method stub
		return tdao.getAll();
	}

	@Override
	public Trainee register(Trainee trainee) {
		// TODO Auto-generated method stub
		return tdao.register(trainee);
	}

	@Override
	public int login(Trainee trainee) {
		// TODO Auto-generated method stub
		return tdao.login(trainee);
	}

}
