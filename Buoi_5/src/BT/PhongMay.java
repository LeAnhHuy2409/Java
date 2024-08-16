package BT;

import java.util.Scanner;

public class PhongMay {
	  private String maPhong, tenPhong;
	  private double dienTich;
	  private QuanLy x;
	  private May y;
	  
	  public PhongMay(){
		  x = new QuanLy();
		  y = new May();  
	  }
	  
	  public PhongMay(String maPhong, String tenPhong, double dienTich) {
		  this.maPhong = maPhong;
		  this.tenPhong = tenPhong;
		  this.dienTich = dienTich;
	  }
	  public String getMaPhong() {
		return maPhong;
	}
	  public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	  public String getTenPhong() {
		return tenPhong;
	}
	  public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	  public double getDienTich() {
		return dienTich;
	}
	  public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	  public QuanLy getX() {
		return x;
	}
	  public void setX(QuanLy x) {
		this.x = x;
	}
	  public May getY() {
		return y;
	}
	  public void setY(May y) {
		this.y = y;
	}
	  
	  void Nhap() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap ma phong: ");
	        maPhong = sc.nextLine();
	        System.out.print("Nhap ten phong: ");
	        tenPhong = sc.nextLine();
	        System.out.print("Nhap dien tich: ");
	        dienTich = sc.nextDouble();
	       
	        x.Nhap();
	  }
	  void Xuat() {
	        System.out.println("Thong tin phong may:");
	        System.out.println("Ma phong: " + maPhong);
	        System.out.println("Ten phong: " + tenPhong);
	        System.out.println("Dien tich: " + dienTich);
	        
	        x.Xuat();
	  }
}
