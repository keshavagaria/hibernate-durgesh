package com.hcl.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Question3 {
	
	@Id
	private int questionId;
	
	private String question;

	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
	@JoinTable(joinColumns = @JoinColumn(name = "THE_QUESTION_ID"),
						inverseJoinColumns = @JoinColumn(name = "THE_ANSWER_ID")
	)
	List<Answer3> answers=new ArrayList<Answer3>();

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

	public List<Answer3> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer3> answers) {
		this.answers = answers;
	}



	
	
}
