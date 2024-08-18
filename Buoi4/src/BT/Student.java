 package BT;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.Scanner;

public class Student {
	private String ten;
	private long namSinh;
	private String diaChi;
	private double diemTX1, diemTX2, diemKTHP;
	private int soTietNghi;
	private int tuoi;
	private double diemGPA;
	public Student() {
		
	}
	   public Student(String ten, int namSinh, String diaChi, double diemTX1, double diemTX2, double diemKTHP, int soTietNghi) {
	        this.ten = ten;
	        this.namSinh = namSinh;
	        this.diaChi = diaChi;
	        this.diemTX1 = diemTX1;
	        this.diemTX2 = diemTX2;
	        this.diemKTHP = diemKTHP;
	        this.soTietNghi = soTietNghi;
	    }
	   public String getten() {
	        return ten;
	    }

	    public long getnamSinh() {
	        return namSinh;
	    }

	    public String getdiaChi() {
	        return diaChi;
	    }

	    public double getdiemTX1() {
	        return diemTX1;
	    }

	    public double getdiemTX2() {
	        return diemTX2;
	    }

	    public double getdiemKTHP() {
	        return diemKTHP;
	    }

	    public int getsoTietNghi() {
	        return soTietNghi;
	    }

	   
	    public long gettuoi(int namHienTai) {
	        return namHienTai - namSinh;
	    }

	
	    public double getdiemGPA() {
	        return (diemTX1 * 0.2) + (diemTX2 * 0.3) + (diemKTHP * 0.5);
	    }
	

	

	}

