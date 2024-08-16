package BT;

import java.util.Scanner;

public class Student {
	private String Name;
    private String Class;
    private double Score;
    private Faculty y;
    
    public Student(){
    	y = new Faculty();
    }
    
    public Student( String Name, String Class, double Score, Faculty faculty) {
    	 this.Name = Name;
         this.Class = Class;
         this.Score = Score;
         this.y = faculty;
    }
    public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
	    this.Name = Name;
	}

	public String getClass() {
		return Class;
	}

	public void setClass(String Class) {
	    this.Class = Class;
	}
	
	public double getScore() {
		return Score;
	}
	
	public void setScore(double Score) {
		this.Score = Score;
	}
	
	public Faculty getFaculty() {
		return y;
	}
	
	public void setFaculty(Faculty faculty) {
		this.y = faculty;
	}
	
	public void nhap() {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Nhập tên sinh vien: ");
        Name = sc.nextLine();
        System.out.print("Nhập tên lớp: ");
        Class = sc.nextLine();
        System.out.print("Nhập điểm: ");
        Score = sc.nextDouble();
        y.nhap();
	}

    public void xuat() {
        
        System.out.println("Tên hoc sinh: " + Name);
        System.out.println("ten lop: " + Class);
        System.out.println(" điểm: " + Score);
        y.xuat();
    }
}
