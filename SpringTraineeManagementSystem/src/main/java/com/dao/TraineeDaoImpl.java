package com.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.Trainee;

@Component("dao")
@Repository
@ComponentScan("com")
public class TraineeDaoImpl implements traineeDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public int updateTrainee(Trainee trainee) {
		entityManager.merge(trainee);
		return 0;
	}

	@Override
	public ArrayList<Trainee> getAll() {
		Query query = (Query) entityManager.createQuery("from Trainee ");
		ArrayList<Trainee> list = (ArrayList<Trainee>) query.list();
		return list;
	}

	@Override
	public int deleteTrainee(int id) {
		Trainee trainee=new Trainee();
		trainee.setTraineeId(id);
		entityManager.remove(getById(id));
		return 0;
	}

	@Override
	public Trainee getById(int id) {
		Trainee trainee=entityManager.find(Trainee.class,id);
		return null;
	}

	@Override
	public Trainee register(Trainee trainee) {
		entityManager.persist(trainee);
		return trainee;
	}

	@Override
	public int login(Trainee trainee) {
		int id=0;
		Trainee tr=entityManager.find(Trainee.class,trainee.getTraineeId());
		return id;
	}

}
