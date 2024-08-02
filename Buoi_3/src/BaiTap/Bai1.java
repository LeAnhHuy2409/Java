package BaiTap;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai1 {
	 public static final String SQUARE = "Square";
	 public static final String TRIANGLE = "Triangle";
	 public static final String CIRCLE = "Circle";

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print(" ");
	        String type = sc.nextLine();

	        if (type.equals(SQUARE))
	        {
	            System.out.print(" ");
	            int a = sc.nextInt();
	            double dienTich = Math.pow(a, 2);
	            System.out.println(" " + dienTich);
	        } 
	        else if (type.equals(TRIANGLE))
	        {
	            System.out.print("");
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int c = sc.nextInt();

	            if (a + b > c && a + c > b && b + c > a)
	            {
	                double p = (a + b + c) / 2;
	                double dientich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	                System.out.printf(" %.2f\n", dientich);
	            } 
	            else 
	            {
	                System.out.println("-1");
	            }
	        }
	        else if (type.equals(CIRCLE)) 
	        {
	            System.out.print(" ");
	            int r = sc.nextInt();
	            double dienTich = Math.PI * Math.pow(r, 2);
	            System.out.printf(" %.2f\n", dienTich);
	        }
	        else 
	        {
	            System.out.println("Hình dạng không hợp lệ!");
	        }
	    }
	
	}
 

