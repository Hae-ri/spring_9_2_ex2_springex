package com.javatest.ex;

public class Student {

	private String name;
	private int age;
	private String gradeNum;
	private String classNum;
	
	public void getStudentInfo() { // �ٽɱ��
		System.out.println("�̸� :" + getName());
		System.out.println("���� :" + getAge());
		System.out.println("�г� :" + getGradeNum());
		System.out.println("�� :" + getGradeNum());
		
		// ������ ���� �߻����� afterthrowadvice Ȯ��
		// int i = 10/0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
}
