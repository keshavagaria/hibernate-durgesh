package com.hcl.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer3 {
	
	@Id
	private int id;
	
	private String answer;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer3 [id=" + id + ", answer=" + answer + "]";
	}

	

	


	
	
}
