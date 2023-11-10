package com.school;
import java.util.Scanner;

import com.school.student.Student_Implementation;

public class Student_Grade_Calculator {
	
		    public static void main(String[] args) {
		    	
		    	Student_Implementation sd=new Student_Implementation();
		    	
		    	System.out.println("   \tStudent Grade Calculator     \t");
		    	
		    	System.out.println("Choices are");
		    	System.out.println("1.Add student Details");
		    	
		    	System.out.println("2.Average Marks");
		    	System.out.println("3.Assign Grade");
		    	System.out.println("4.View Single Student");
		    	System.out.println("5.View Student Details");
		    	int n=1;
		    	while(n==1) {
		 
		               {
		            	Scanner scanner = new Scanner(System.in);
						System.out.println();
						System.out.println("Enter your choice");
						int choice=scanner.nextInt();
						switch(choice) 
						{
						case 1:System.out.println("Add student\n");
							   sd.addStudentDetails();
							  
						       break;
						
						
						case 2:System.out.println("View Average mark of Each Student\n");
						       sd.averageMarks();
						      
						       break;
						         
						case 3:System.out.println("Assign Grade\n");
					            sd.assignGrade();
					            break;
						case 4:System.out.println("View Single Students");
					      sd.viewDetails();
					       break;
						
					    case 5:System.out.println("View Student\n");
						      sd.displayStudentDetails();
						       break;
				
						default:
						       break;
						}
						System.out.println("Press 0 for Exit \n 1 for to continue");
						n=scanner.nextInt();
					
				}
		        
		    }
		   }
		}





