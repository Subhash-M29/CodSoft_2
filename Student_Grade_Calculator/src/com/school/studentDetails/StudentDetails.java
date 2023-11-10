package com.school.studentDetails;

public class StudentDetails {

		private String studentId, studentName;
		private static String schoolName="xyz";
		private  float totalMarks, averageMarks;
		
		private String grade;
		
		Mark mark;
		
		
		public StudentDetails(String studentId, String name, String schoolName,Mark mark) {
		this.studentId=studentId;	
		this.studentName=name;
		StudentDetails.schoolName=schoolName;
		this.mark=mark;
		
		}
		
		public String getStudentId() {
			return studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public static String getSchoolName() {
			return schoolName;
		}
		public static void setSchoolName(String schoolName) {
			StudentDetails.schoolName = schoolName;
		}
		public Mark getMark() {
			return mark;
		}
		public void setMark(Mark mark) {
			this.mark = mark;
		}
		@Override
		public String toString() {
			return "StudentDetails [StudentId=" + studentId + ", StudentName=" + studentName +",SchoolName=" + schoolName+",\n Mark="+mark+","
					+ "\nTotal_marks="+totalMarks+",Average_marks="+averageMarks+",Grade="+grade+"]";
		}
		public void setTotalMarks(float totalMarks) {
			// TODO Auto-generated method stub
			this.totalMarks=totalMarks;
		}
		public float getTotalMarks() {
			return totalMarks;
		}
		
		public void setAverageMarks(float averageMarks) {
			this.averageMarks=averageMarks;
		}
		public float getAverageMarks() {
			return averageMarks;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		
		
		
	}

