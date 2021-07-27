package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject1> subjectList; //arraylist 선언하기
	
	public Student(int studentID, String studentName) { //생성자
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject1>(); //arraylist 생성하기
	}
	
	public void addSubject(String name, int score) {	//학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
		Subject1 subject1 = new Subject1(); //subject 생성하기
		subject1.setName(name);			// 과목 이름 추가하기
		subject1.setScorePoint(score);	// 점수 추가하기
		subjectList.add(subject1);		// 배열에 저장하기
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject1 s : subjectList) {
			total += s.getScorePoint(); //총점 더하기
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
}
