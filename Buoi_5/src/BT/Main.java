package BT;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Nhập số lượng sinh viên: ");
       
		 int n = sc.nextInt();
		 Student[] students = new Student[n];
	        for (int i = 0; i < n; i++) {
	            students[i] = new Student();
	            students[i].nhap();
	        }

	        for (Student student : students) {
	            student.xuat();
	        }
		
	}

}
  