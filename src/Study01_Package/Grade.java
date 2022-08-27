package Study01_Package;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public double average()
	{
		return (this.math+this.science+this.english)/3;
	}
}
