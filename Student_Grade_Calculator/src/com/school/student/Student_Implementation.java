package com.school.student;

import java.util.HashSet;
import java.util.Scanner;

import com.school.studentDetails.Mark;
import com.school.studentDetails.StudentDetails;

interface Student{
	void addStudentDetails();
	void averageMarks();
	void viewDetails();
	void assignGrade();
	void displayStudentDetails();
}

public class Student_Implementation  implements Student {
	
	HashSet<StudentDetails> student=new HashSet<StudentDetails>();	
	Scanner scanner=new Scanner(System.in);


	public void addStudentDetails() {
	    
		System.out.println("Enter a Student_ID");
		String id=scanner.next();
		
		System.out.println("Enter a Name");
	    String name=scanner.next();
	  //  student.add(new StudentDetails(id,name,StudentDetails.getSchoolName(), null));
	    System.out.println("Student Details Inserted");
	    //Mark mark=addMarks();

	    System.out.println("Enter a Marks");
	  
	    
		//Scanner mark = new Scanner(input).useDelimiter("^[1]?[0-9]?[0-9]$");
	    System.out.println("Enter a Tamil Mark");
	    float tamil=oneToHundred();;
	    
	    System.out.println("Enter a English Mark");
	    float english=oneToHundred();;
	    
	    System.out.println("Enter a computer Science Mark");
	    float cs=oneToHundred();;
	    
	    System.out.println("Enter a Maths");
	    float maths=oneToHundred();;
	    
	    System.out.println("Enter a Physics Marks");
	    float physics=oneToHundred();;
	    
	    System.out.println("Enter a Chemistry Marks");
	    float chemistry=oneToHundred();;
		
	   student.add(new StudentDetails(id,name,StudentDetails.getSchoolName(),(new Mark(tamil,english,cs,maths,physics,chemistry))));
	    
	     /*student.forEach((n->System.out.println(n)));*/
	     
	     System.out.println("Student Marks inserted");
	   

	    System.out.println("Total No of student record "+student.size());
	}

	
	public void averageMarks() {
		// TODO Auto-generated method stub
		float total_marks;
		
		for(StudentDetails sd:student)
		
	    {
		  
		 
		 total_marks=sd.getMark().getTamil()+sd.getMark().getEnglish()+
		            sd.getMark().getComputerScience()+sd.getMark().getMaths()+
		            sd.getMark().getPhysics()+sd.getMark().getChemistry();
				   
		   sd.setTotalMarks(total_marks);
		   
		   sd.setAverageMarks(sd.getTotalMarks()/6);
		   System.out.println("ID :"+sd.getStudentId()+" Name:"+sd.getStudentName()+ 
				   "\nTotal mark    = "+sd.getTotalMarks()+
		           "\nAverage Mark  = "+sd.getAverageMarks());
		   System.out.println();
		   
		}
		
		
	}
	
public void assignGrade() {
	
	for(StudentDetails sd:student) {
		//if(id.equals(sd.getStudentId())){
			if(sd.getAverageMarks()>=91 && sd.getAverageMarks()<=100){
				sd.setGrade("O");
				System.out.println("Student ID:"+sd.getStudentId()+" got "+sd.getGrade()+" Grade");
				
			}
			else if(sd.getAverageMarks()>=81 && sd.getAverageMarks()<=90) {
				sd.setGrade("A+");
				System.out.println("Student ID:"+sd.getStudentId()+" got "+sd.getGrade()+" Grade");
			}
			else if(sd.getAverageMarks()>=71 && sd.getAverageMarks()<=80) {
				sd.setGrade("A");
				System.out.println("Student ID:"+sd.getStudentId()+" got "+sd.getGrade()+" Grade");
			}
			else if(sd.getAverageMarks()>=61 && sd.getAverageMarks()<=70) {
				sd.setGrade("B+");
				System.out.println("Student ID:"+sd.getStudentId()+" got "+sd.getGrade()+" Grade");
			}
			else if(sd.getAverageMarks()>=51 && sd.getAverageMarks()<=60) {
				sd.setGrade("B");
				System.out.println("Student ID:"+sd.getStudentId()+" got "+sd.getGrade()+" Grade");
			}
			else  {
				sd.setGrade("RA");
				System.out.println("Student ID:"+sd.getStudentId()+" ReAppear: "+sd.getGrade());
			}		
			
		}
	}

	public void viewDetails() {
		System.out.println("Enter a Student ID");
		String id=scanner.next();
		//int i=0;
		for(StudentDetails sd:student) {
		
			if(id.equals(sd.getStudentId())) {
				
				    System.out.println("Student ID    : "+ sd.getStudentId());
			        System.out.println("Student Name  : "+ sd.getStudentName());
			        System.out.println("School Name   : "+ StudentDetails.getSchoolName());
			        System.out.println("Marks         : "+ sd.getMark());
			        System.out.println("Total Marks   : "+sd.getTotalMarks());
			        System.out.println("Average Marks : "+sd.getAverageMarks());
			        System.out.println("Grade         : "+sd.getGrade());
			        System.out.println();
			      //  i++;       
			}
			
		}
		
	}

	
	public void displayStudentDetails() {
		for(StudentDetails sd:student) {
			System.out.println(sd);
		}
		
	}
	
	public float oneToHundred() {
		float n=scanner.nextFloat();
		while(n<0 || n>100) {
	
			System.out.println("You entered invalid mark");
			n=scanner.nextFloat();
		}
		//System.out.println("Valid Mark");
		return n;
		
	}
}


/*
System.out.println("Enter a Marks");


		//Scanner mark = new Scanner(input).useDelimiter("^[1]?[0-9]?[0-9]$");
	    System.out.println("Enter a Tamil Mark");
	    float tamil=scanner.nextFloat();
	    
	    System.out.println("Enter a English Mark");
	    float english=scanner.nextFloat();
	    
	    System.out.println("Enter a computer Science Mark");
	    float cs=scanner.nextFloat();
	    
	    System.out.println("Enter a Maths");
	    float maths=scanner.nextFloat();
	    
	    System.out.println("Enter a Physics Marks");
	    float physics=scanner.nextFloat();
	    
	    System.out.println("Enter a Chemistry Marks");
	    float chemistry=scanner.nextFloat();
		
	   student.add(new StudentDetails(id,name,StudentDetails.getSchoolName(),(new Mark(tamil,english,cs,maths,physics,chemistry))));
	    
	     /*student.forEach((n->System.out.println(n)));
	     
	     System.out.println("Student Marks inserted");
	   

	    System.out.println("Total No of student record "+student.size());
	}*/


