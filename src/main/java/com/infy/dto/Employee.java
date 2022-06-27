package com.infy.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
public class Employee {
		@Id
		@Column(name="eid")
		int empId;
		@Column(name="ename",length=20)
		String empName;
		@Column(name="esal")
		int empSal;
		@OneToOne(cascade=CascadeType.ALL)
		Office officeid;
		
		public Employee() {
			super();
		}
		public Employee(int empId, String empName, int empSal) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSal = empSal;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getEmpSal() {
			return empSal;
		}
		public void setEmpSal(int empSal) {
			this.empSal = empSal;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
		}
		public Office getOfficeid() {
			return officeid;
		}
		public void setOfficeid(Office officeid) {
			this.officeid = officeid;
		}
		
		
		
		

	}


