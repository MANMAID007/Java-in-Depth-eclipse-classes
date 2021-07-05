package javaInDepthAdvanced;

public class Stuff extends User {
	private long stuffId;
	private int yearsOfExperience;
	private String description;
	private double salary;
	
	public long getStuffId() {
		return stuffId;
	}

	public void setStuffId(long stuffId) {
		this.stuffId = stuffId;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
