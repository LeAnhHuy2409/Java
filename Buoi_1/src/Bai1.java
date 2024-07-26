import java.util.Iterator;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print(" ");
        double r = scanner.nextDouble();

        
        if (r <= 0 || r >= 1000)
        {
            System.out.println("Bán kính không hợp lệ!");
            return;
        }

        
        double pi = 3.14;
        double chuvi = 2 * pi * r;
        double dientich= pi * r * r;

        
        System.out.printf("%3f", chuvi);
        System.out.printf(" %.3f", dientich);
		
	}
}