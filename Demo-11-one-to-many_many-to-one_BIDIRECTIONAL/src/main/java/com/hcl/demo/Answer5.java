package com.hcl.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer5 {
	
	@Id
	private int id;
	
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "THE_QUESTION_ID")
	private Question5 question5;

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

	public Question5 getQuestion5() {
		return question5;
	}

	public void setQuestion5(Question5 question5) {
		this.question5 = question5;
	}

	@Override
	public String toString() {
		return "Answer5 [id=" + id + ", answer=" + answer + ", question5=" + question5 + "]";
	}




	
	
}
