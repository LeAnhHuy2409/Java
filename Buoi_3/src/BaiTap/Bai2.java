package BaiTap;

import java.util.Scanner;
import java.math.BigInteger;

public class Bai2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" ");
        String chuoi = sc.nextLine();

        if(laChuoiDoixung(chuoi)) {
            
            chuoi = chuoi.toUpperCase();
        } else {
         
            chuoi = chuoi.toLowerCase();
        }

        System.out.println(chuoi);
    }

 
    public static boolean laChuoiDoixung(String chuoi) {
        int left = 0;
        int right = chuoi.length() - 1;

        while (left < right) {
            if (chuoi.charAt(left) != chuoi.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
