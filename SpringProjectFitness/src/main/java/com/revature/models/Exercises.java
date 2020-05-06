package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "exercises")
public class Exercises {
	
	@Id //denotes that this column is the primary key for this table.
	@GeneratedValue(generator = "exercise_id_seq", strategy = GenerationType.AUTO) //specifies that this ID is auto generated by some sort of sequence
	@SequenceGenerator(name="exercise_id_seq", allocationSize = 1) //Generates the sequence you want to use
	@Column
	int exerciseNumber;
	
	@Column
	String bodyarea;
	
	@Column
	String exercise;
	
	@Column
	int calories;
	
	public Exercises() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exercises(int exerciseNumber, String bodyarea, String exercise, int calories) {
		super();
		this.exerciseNumber = exerciseNumber;
		this.bodyarea = bodyarea;
		this.exercise = exercise;
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Exercises [exerciseNumber=" + exerciseNumber + ", bodyarea=" + bodyarea + ", exercise=" + exercise
				+ ", calories=" + calories + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyarea == null) ? 0 : bodyarea.hashCode());
		result = prime * result + calories;
		result = prime * result + ((exercise == null) ? 0 : exercise.hashCode());
		result = prime * result + exerciseNumber;
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
		Exercises other = (Exercises) obj;
		if (bodyarea == null) {
			if (other.bodyarea != null)
				return false;
		} else if (!bodyarea.equals(other.bodyarea))
			return false;
		if (calories != other.calories)
			return false;
		if (exercise == null) {
			if (other.exercise != null)
				return false;
		} else if (!exercise.equals(other.exercise))
			return false;
		if (exerciseNumber != other.exerciseNumber)
			return false;
		return true;
	}

	public int getExerciseNumber() {
		return exerciseNumber;
	}

	public void setExerciseNumber(int exerciseNumber) {
		this.exerciseNumber = exerciseNumber;
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

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}

