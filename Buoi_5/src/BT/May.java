package BT;

import java.util.Scanner;

public class May {
	private String maMay, tenMay, tinhTrang;
	
	public May() {
	
	}
	public May(String maMay, String tenMay, String tinhTrang) {
		this.maMay = maMay;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
	}
	public String getmaMay() {
		return maMay;
	}
	
	 public void setmaMay(String maMay) {
	    this.maMay = maMay;
	}
	
	 public String gettenMay() {
			return tenMay;
		}
		
	public void settenMay(String tenMay) {
		    this.tenMay = tenMay;
		}
	public String gettinhTrang() {
		return tinhTrang;
	}
	
	 public void settinhTrang(String tinhTrang) {
	    this.tinhTrang = tinhTrang;
	}
	 
	 void Nhap() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap ma may: ");
	        maMay = sc.nextLine();
	        System.out.print("Nhap ten may: ");
	        tenMay = sc.nextLine();
	        System.out.print("Nhap tinh trang: ");
	        tinhTrang = sc.nextLine();
	    }

	 void Xuat() {
	        System.out.println("Ma may: " + maMay);
	        System.out.println("Ten may: " + tenMay);
	        System.out.println("Tinh trang: " + tinhTrang);
	    }
		
}
