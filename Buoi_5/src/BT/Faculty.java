package BT;

import java.util.Scanner;

public class Faculty {
	private String Name;
    private String Date;
    private School x;
    
    public Faculty() {
    	x = new School();
    }

    public Faculty(String Name, String Date, School school) {
        this.Name = Name;
        this.Date = Date;
        this.x = school;
    }
    public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
	    this.Name = Name;
	}

	public String getDate() {
	    return Date;
	}

	public void setDate(String Date) {
	    this.Date = Date;
	}
	public School getSchool() {
		return x;
	}
	
	public void setSchool(School school) {
		this.x = school;
	}
	
	 public void nhap() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập tên khoa: ");
	        Name = sc.nextLine();
	        System.out.print("Nhập ngày vao khoa: ");
	        Date = sc.nextLine();
	       x.nhap();
	    
	    }

	 public void xuat() {
	        System.out.println("Tên khoa: " + Name);
	        System.out.println("Ngày vao khoa: " + Date);
	        x.xuat();
	    }
	}


