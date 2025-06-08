package com.hcl.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Answer2 {
	
	@Id
	private int id;
	
	private String answer;
	
	//@OneToOne
	@OneToOne(mappedBy = "answer2")
	@JoinColumn(name = "THE_QUESTION_ID")     //this will be ignored now
	private Question2 question2;

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

	public Question2 getQuestion2() {
		return question2;
	}

	public void setQuestion2(Question2 question2) {
		this.question2 = question2;
	}


	
	
}
