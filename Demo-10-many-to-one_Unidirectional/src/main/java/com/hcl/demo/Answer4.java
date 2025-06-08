package com.hcl.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer4 {
	
	@Id
	private int id;
	
	private String answer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "THE_QUESTION_ID")
	private Question4 question4;

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

	public Question4 getQuestion4() {
		return question4;
	}

	public void setQuestion4(Question4 question4) {
		this.question4 = question4;
	}




	
	
}
