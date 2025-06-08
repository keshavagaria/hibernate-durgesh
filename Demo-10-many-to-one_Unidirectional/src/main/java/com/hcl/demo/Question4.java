package com.hcl.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Question4 {
	
	@Id
	private int questionId;
	
	private String question;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
}
