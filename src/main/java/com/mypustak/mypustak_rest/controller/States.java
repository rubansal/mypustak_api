package com.mypustak.mypustak_rest.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //lets it know that there is some mapping
@Table(name="states")
public class States {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "state_id", nullable = false, unique = true)
	private int stateId;
	
	@Column(name = "state_name", nullable = false, unique=true)
	private String stateName;

	public States() {
		
	}

	public States(String stateName) {
		
		this.stateName = stateName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
}
