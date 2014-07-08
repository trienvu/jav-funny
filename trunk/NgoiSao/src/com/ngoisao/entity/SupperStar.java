package com.ngoisao.entity;

public class SupperStar {
	
	private int id;
	private String fullName;
	private String nameClean;
	private String desc;
	private String path;
	
	public SupperStar(){ 
	}
	
	public SupperStar(int id, String fullName, String nameClean, String desc,
			String path) { 
		this.id = id;
		this.fullName = fullName;
		this.nameClean = nameClean;
		this.desc = desc;
		this.path = path;
	}
	  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNameClean() {
		return nameClean;
	}

	public void setNameClean(String nameClean) {
		this.nameClean = nameClean;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "SupperStar [id=" + id + ", fullName=" + fullName
				+ ", nameClean=" + nameClean + ", desc=" + desc + ", path="
				+ path + "]";
	} 
	 
}
