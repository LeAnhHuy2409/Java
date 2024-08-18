package BT;
import java.util.Scanner;

import java.util.Iterator;


public class Bai12 {
	public static void main(String[] args) {
		
	
        Student[] students = new Student[5];
       students[0] = new Student("Huy",2005,"ThanhHoa",7,8,9,4);
       students[1] = new Student("Huy",2004,"ThanhHoa",7,8,9,4);
       students[2] = new Student("duy",2003,"ThanhHoa",7,5,9,9);
       students[3] = new Student("Huyen",2006,"ThanhHoa",7,9,9,4);
       students[4] = new Student("Hung",2007,"ThanhHoa",8,8,9,4);
        System.out.printf("%-15s %-15s %-20s %-15s %-12s %-12s %-12s\n",
                "Tên", "NamSinh", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Số tiết nghỉ");
        for (int i =0; i< students.length;i++) {
            Student student = students[i];
            System.out.printf("%-15s %-15d %-20s %-15.2f %-12.2f %-12.2f %-10d\n",
                    student.getten(), student.getnamSinh(), student.getdiaChi(),
                    student.getdiemTX1(), student.getdiemTX2(), student.getdiemKTHP(),
                    student.getdiemGPA(), student.getsoTietNghi());
        }
   
    }
   
	}



