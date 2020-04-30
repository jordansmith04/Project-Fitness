package com.revature.models;

public class Workouts {

	int workoutNumber;
	String bodyarea;
	String exercise;
	int reps;
	public Workouts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Workouts(int workoutNumber, String bodyarea, String exercise, int reps) {
		super();
		this.workoutNumber = workoutNumber;
		this.bodyarea = bodyarea;
		this.exercise = exercise;
		this.reps = reps;
	}
	@Override
	public String toString() {
		return "Workouts [workoutNumber=" + workoutNumber + ", bodyarea=" + bodyarea + ", exercise=" + exercise
				+ ", reps=" + reps + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyarea == null) ? 0 : bodyarea.hashCode());
		result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
		result = prime * result + reps;
		result = prime * result + workoutNumber;
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
		Workouts other = (Workouts) obj;
		if (bodyarea == null) {
			if (other.bodyarea != null)
				return false;
		} else if (!bodyarea.equals(other.bodyarea))
			return false;
		if (exercise == null) {
			if (other.exercise != null)
				return false;
		} else if (!exercise.equals(other.exercise))
			return false;
		if (reps != other.reps)
			return false;
		if (workoutNumber != other.workoutNumber)
			return false;
		return true;
	}
	public int getWorkoutNumber() {
		return workoutNumber;
	}
	public void setWorkoutNumber(int workoutNumber) {
		this.workoutNumber = workoutNumber;
	}
	public String getBodyarea() {
		return bodyarea;
	}
	public void setBodyarea(String bodyarea) {
		this.bodyarea = bodyarea;
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
