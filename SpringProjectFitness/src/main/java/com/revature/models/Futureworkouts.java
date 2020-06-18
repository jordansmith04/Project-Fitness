package com.revature.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name = "futureworkouts")
public class Futureworkouts {
	
	@Id
	@GeneratedValue(generator = "futureworkouts_workoutnumber_seq", strategy = GenerationType.AUTO) //specifies that this ID is auto generated by some sort of sequence
	@SequenceGenerator(name="futureworkouts_workoutnumber_seq", allocationSize = 1) //Generates the sequence you want to use
	@Column
	int workoutnumber;
	
	@Column 
	String username;
	
	@Column
	String exercise;
	
	@Column
	int reps;
	
	
	
	public Futureworkouts() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Futureworkouts(int workoutnumber, String username, String exercise, int reps) {
		super();
		this.workoutnumber = workoutnumber;
		this.username = username;
		this.exercise = exercise;
		this.reps = reps;
	}



	@Override
	public String toString() {
		return "Futureworkouts [workoutnumber=" + workoutnumber + ", username=" + username + ", exercise=" + exercise
				+ ", reps=" + reps + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
		result = prime * result + reps;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + workoutnumber;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futureworkouts other = (Futureworkouts) obj;
		if (exercise == null) {
			if (other.exercise != null)
				return false;
		} else if (!exercise.equals(other.exercise))
			return false;
		if (reps != other.reps)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (workoutnumber != other.workoutnumber)
			return false;
		return true;
	}



	public int getWorkoutnumber() {
		return workoutnumber;
	}



	public void setWorkoutnumber(int workoutnumber) {
		this.workoutnumber = workoutnumber;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getExercise() {
		return exercise;
	}



	public void setExercise(String exercise) {
		this.exercise = exercise;
	}



	public int getReps() {
		return reps;
	}



	public void setReps(int reps) {
		this.reps = reps;
	}
	
	
	
}