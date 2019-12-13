package com.capgemini.jpawithhibernate.manyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

@Entity
@Table(name="EmployeeExperience")
public class EmployeeExperience {
	@Id
	@Column
	private int expId;
	@Column
	private String cName;
	@Column
	private int noOfYear;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeeInfo emp;
	
	/**
	 * @return the expId
	 */
	public int getExpId() {
		return expId;
	}
	/**
	 * @return the emp
	 */
	public EmployeeInfo getEmp() {
		return emp;
	}
	/**
	 * @param emp the emp to set
	 */
	public void setEmp(EmployeeInfo emp) {
		this.emp = emp;
	}
	/**
	 * @param expId the expId to set
	 */
	public void setExpId(int expId) {
		this.expId = expId;
	}
	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return the noOfYear
	 */
	public int getNoOfYear() {
		return noOfYear;
	}
	/**
	 * @param noOfYear the noOfYear to set
	 */
	public void setNoOfYear(int noOfYear) {
		this.noOfYear = noOfYear;
	}
	

}
