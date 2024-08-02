package BaiTap;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    while (true) {
       
        int a = (int) (Math.random() * 11);
        int b = (int) (Math.random() * 11);
        int c = (int) (Math.random() * 21);

       
        boolean isCorrect = Math.random() < 0.5;
        if (!isCorrect) {
            c += 1; 
        }

      
        System.out.print(a + " + " + b + " = " + c + " (Y/N): ");
        String answer = sc.nextLine();

        
        if (answer.equalsIgnoreCase("Y") == isCorrect) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
}
	


