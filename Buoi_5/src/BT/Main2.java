package BT;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		PhongMay phongmay = new PhongMay();
		phongmay.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng may: ");
		int n = sc.nextInt();
		May[] may = new May[n];
		 for (int i = 0; i < n; i++) {
	            may[i] = new May();
	            may[i].Nhap();
	        }
		phongmay.Xuat();
		
	    for (May mays : may) {
	            mays.Xuat();
	      }
	        
	     
	}

}
