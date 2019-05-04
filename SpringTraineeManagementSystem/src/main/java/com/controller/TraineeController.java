package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.model.Trainee;
import com.service.traineeService;

@RestController
public class TraineeController {

	int id;
	@Autowired
	traineeService tService;
	
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@PostMapping("/register")
	public ResponseEntity insertData(@RequestBody Trainee trainee) {
		tService.register(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody Trainee trainee) {
		tService.updateTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int id) {
		tService.deleteTrainee(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	@GetMapping("/getById")
	public ResponseEntity getById(@RequestBody int id) {
		Trainee trainee=tService.getById(id);
		return new ResponseEntity("success",HttpStatus.OK);
		}
	
	@GetMapping("/getAll")
	public ArrayList<Trainee> getAll(){
		ArrayList<Trainee> trainees = tService.getAll();
		return trainees;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void login(@RequestBody Trainee trainee) {
		id=tService.login(trainee);
		}
	}

