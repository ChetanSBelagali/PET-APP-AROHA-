package com.aroha.pet.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class CPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@CreatedDate
	@Column(insertable = true, updatable = false)
	private String createdAt;
	
	private long createdBy;

	@Lob
	private String cstr;

	@Lob
	private String resultstr;

	@Lob
	private String exceptionstr;

	private String scenario;

	private int questionId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCstr() {
		return cstr;
	}

	public void setCstr(String cstr) {
		this.cstr = cstr;
	}

	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public String getExceptionstr() {
		return exceptionstr;
	}

	public void setExceptionstr(String exceptionstr) {
		this.exceptionstr = exceptionstr;
	}

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "CPojo [id=" + id + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", cstr=" + cstr
				+ ", resultstr=" + resultstr + ", exceptionstr=" + exceptionstr + ", scenario=" + scenario
				+ ", questionId=" + questionId + ", getId()=" + getId() + ", getCreatedAt()=" + getCreatedAt()
				+ ", getCstr()=" + getCstr() + ", getResultstr()=" + getResultstr() + ", getExceptionstr()="
				+ getExceptionstr() + ", getScenario()=" + getScenario() + ", getQuestionId()=" + getQuestionId()
				+ ", getCreatedBy()=" + getCreatedBy() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
}


