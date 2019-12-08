package com.cap.map.hashmap;

public class Student {

	int StudId;
	String StudName;
	public Student(int studId, String studName) {
		super();
		StudId = studId;
		StudName = studName;
	}
	@Override
	public String toString() {
		return "Student [StudId=" + StudId + ", StudName=" + StudName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StudId;
		result = prime * result + ((StudName == null) ? 0 : StudName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StudId != other.StudId)
			return false;
		if (StudName == null) {
			if (other.StudName != null)
				return false;
		} else if (!StudName.equals(other.StudName))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
