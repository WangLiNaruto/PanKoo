package com.naruto.springcloud.bean;

import java.io.Serializable;

public class Dept implements Serializable {

    private int id;
    private String deptName;
    private String dbSource;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDbSource() {
		return dbSource;
	}
	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", dbSource=" + dbSource + "]";
	}
    
    
    
}
