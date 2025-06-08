package com.hcl.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question5 {
	
	@Id
	private int questionId;
	
	private String question;

	@OneToMany(mappedBy = "question5",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JoinTable(joinColumns = @JoinColumn(name = "THE_QUESTION_ID"),
//						inverseJoinColumns = @JoinColumn(name = "THE_ANSWER_ID")
//	)
	List<Answer5> answers=new ArrayList<Answer5>();

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

	public List<Answer5> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer5> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question5 [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}



	
	
}
