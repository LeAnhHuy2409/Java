package BT;

import java.util.Scanner;

public class Bai_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i<T; i++) {
			String chuoi = sc.nextLine();
			int dem = 0;
			boolean khoangtrong = false;
			for(char C : chuoi.toCharArray()) {
				if(C == ' ') {
					if(!khoangtrong) {
						dem++;
						khoangtrong = true;
					}
				}
				else {
					khoangtrong = false;
				}
			}
			System.out.println(khoangtrong);
			
		}
	}

}
