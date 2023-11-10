package com.school.studentDetails;

public class Mark {


//import java.util.ArrayList;


private float tamil,english,maths,physics,computerScience,chemistry;

private float average_marks;
private float totalMarks;

public Mark(float tamil, float english, float maths, float physics, float computerScience, float chemistry) {
	super();
	this.tamil = tamil;
	this.english = english;
	this.maths = maths;
	this.physics = physics;
	this.computerScience = computerScience;
	this.chemistry = chemistry;
	;;;
}

public float getAverage_marks() {
	return average_marks;
}

public void setAverage_marks(float average_marks) {
	this.average_marks = average_marks;
}

public float getTotalMarks() {
	return totalMarks;
}

public void setTotalMarks(float totalMarks) {
	this.totalMarks = totalMarks;
}


public float getTamil() {
	return tamil;
}

public void setTamil(float tamil) {
	this.tamil = tamil;
}

public float getEnglish() {
	return english;
}

public void setEnglish(float english) {
	this.english = english;
}

public float getMaths() {
	return maths;
}

public void setMaths(float maths) {
	this.maths = maths;
}

public float getPhysics() {
	return physics;
}

public void setPhysics(float physics) {
	this.physics = physics;
}

public float getComputerScience() {
	return computerScience;
}

public void setComputerScience(float computerScience) {
	this.computerScience = computerScience;
}

public float getChemistry() {
	return chemistry;
}

public void setChemistry(float chemistry) {
	this.chemistry = chemistry;
}


@Override
public String toString() {
	return "Mark [Tamil=" + tamil + ", English=" + english + ", Maths=" + maths + ", Physics=" + physics
			+ ", ComputerScience=" + computerScience + ", Chemistry=" + chemistry + "]";
}


}
