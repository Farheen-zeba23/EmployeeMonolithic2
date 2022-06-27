package com.infy.dto;


public class EmployeeDTO {
	
		
		int empId;
	    String empName;
	    int empSal;
		Office officeid;
		public EmployeeDTO() {
			super();
		}
		public EmployeeDTO(int empId, String empName, int empSal, Office officeid) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSal = empSal;
			this.officeid = officeid;
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
		public Office getOfficeid() {
			return officeid;
		}
		public void setOfficeid(Office officeid) {
			this.officeid = officeid;
		}
		@Override
		public String toString() {
			return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", officeid="
					+ officeid + "]";
		}
}
