package BT;

import java.util.Scanner;

public class School {
	private String Name;
	private String Date;
	
	public School() {
		
	}
	
	public School(String Name, String Date) {
		this.Name = Name;
		this.Date = Date;
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
	 public void nhap() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập tên trường: ");
	        Name = sc.nextLine();
	        System.out.print("Nhập ngày thành lập: ");
	        Date = sc.nextLine();
	       
	    
	    }

	  public void xuat() {
	        System.out.println("Tên trường: " + Name);
	        System.out.println("Ngày thành lập: " + Date);
	        
	    }
}
