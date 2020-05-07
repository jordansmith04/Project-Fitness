package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "userinfo")
public class Userinfo {
	
	@Id //denotes that this column is the primary key for this table.
	@Column
	String username;
	
	@Column
	String pass; 
	
	@Column
	int ages;
	
	@Column
	int heights;
	
	@Column
	int weight;

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Userinfo(String username, String pass, int ages, int heights, int weight) {
		super();
		this.username = username;
		this.pass = pass;
		this.ages = ages;
		this.heights = heights;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Userinfo [username=" + username + ", pass=" + pass + ", ages=" + ages + ", heights=" + heights
				+ ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ages;
		result = prime * result + heights;
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + weight;
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
		Userinfo other = (Userinfo) obj;
		if (ages != other.ages)
			return false;
		if (heights != other.heights)
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getAges() {
		return ages;
	}

	public void setAges(int ages) {
		this.ages = ages;
	}

	public int getHeights() {
		return heights;
	}

	public void setHeights(int heights) {
		this.heights = heights;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	

	
}
