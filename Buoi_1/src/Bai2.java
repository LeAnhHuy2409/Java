import java.util.Iterator;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ");
		int n = sc.nextInt();
		if (n <= 0 || n > Math.pow(10, 4)) {
	            System.out.println("n không hợp lệ!");
	            return;
	     }

		int[] arr = new int[n];
		System.out.print("Mảng A: ");
	    for (int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	    if (Math.abs(arr[i]) > Math.pow(10, 8)) {
	    System.out.println("Giá trị phần tử mảng không hợp lệ!");
	    return;
	            }
	        }
	    for (int i = 0; i < n; i++) {
	    if (i % 2 != 0) {
	    int leftDiff = (i > 0) ? (arr[i-1]): 0;
        int rightDiff = (i < n - 1) ? (arr[i+1]) : 0;
        arr[i] += Math.abs(rightDiff - leftDiff);
                
	        }
	       	        }  
	    System.out.print("Mảng sau khi biến đổi: ");
	    for (int i = 0; i < n; i++) {
	    System.out.print(arr[i] + " ");
	        }

	        
				        
		        }
		  
		    }

	 

  
        

      


