package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TraineeDetails")
public class Trainee {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	private int traineeId;
	private String traineeName;
	private String traineeLocation;
	private String traineeDomain;
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public Trainee() {
		
	}
	public Trainee(int traineeId, String traineeName, String traineeLocation, String traineeDomain) {
		
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeLocation = traineeLocation;
		this.traineeDomain = traineeDomain;
	}
	
}
