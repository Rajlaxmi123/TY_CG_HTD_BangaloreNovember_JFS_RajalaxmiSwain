package com.capgemini.jpawithhibernate.manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

@Entity
@Table(name="TrainingInfo")
public class TrainingInfo {
	@Id
	@Column
private int tid;
	@Column
private String tName;

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="training_employee",joinColumns = @JoinColumn(name="tid"),inverseJoinColumns = @JoinColumn(name="eid"))
	private List<EmployeeInfo> eList;//we have to create list because each and every training info consists of lists of employee
	//many-to-many


	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}


	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}


	/**
	 * @return the tName
	 */
	public String gettName() {
		return tName;
	}


	/**
	 * @param tName the tName to set
	 */
	public void settName(String tName) {
		this.tName = tName;
	}


	/**
	 * @return the eList
	 */
	public List<EmployeeInfo> geteList() {
		return eList;
	}


	/**
	 * @param eList the eList to set
	 */
	public void seteList(List<EmployeeInfo> eList) {
		this.eList = eList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
