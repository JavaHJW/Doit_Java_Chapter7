package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject1> subjectList; //arraylist �����ϱ�
	
	public Student(int studentID, String studentName) { //������
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject1>(); //arraylist �����ϱ�
	}
	
	public void addSubject(String name, int score) {	//�л��� �����ϴ� ������ subjectList �迭�� �ϳ��� �߰��ϴ� �޼���
		Subject1 subject1 = new Subject1(); //subject �����ϱ�
		subject1.setName(name);			// ���� �̸� �߰��ϱ�
		subject1.setScorePoint(score);	// ���� �߰��ϱ�
		subjectList.add(subject1);		// �迭�� �����ϱ�
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject1 s : subjectList) {
			total += s.getScorePoint(); //���� ���ϱ�
			System.out.println("�л� " + studentName + "�� " + s.getName() + " ���� ������ " + s.getScorePoint() + "�Դϴ�.");
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + " �Դϴ�.");
	}
}
