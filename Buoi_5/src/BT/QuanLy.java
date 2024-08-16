package BT;

import java.util.Scanner;

public class QuanLy {
	private String maQL, hoTen;
	
	public QuanLy() {
		
	}
	
	public QuanLy(String maQL, String hoTen) {
		this.maQL = maQL;
		this.hoTen = hoTen;
	}
	
	public String getmaQL() {
		return maQL;
	}
	
	public void setmaQL(String maQL) {
	    this.maQL = maQL;
	}
	 
	public String gethoTen() {
			return hoTen;
	}
		
	public void sethoTen(String hoTen) {
		    this.hoTen = hoTen;
	}
	
	void Nhap() {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma quan ly: ");
        maQL = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
    }

    void Xuat() {
        System.out.println("Ma quan ly: " + maQL);
        System.out.println("Ho ten: " + hoTen);
    }

}
