package StringCompare.java;

import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
	    String chuoi1, chuoi2;
	    int result;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhap vao chuoi thu nhat: ");
	    chuoi1 = scanner.nextLine();
	    System.out.println("Nhap vao chuoi thu hai: ");
	    chuoi2 = scanner.nextLine();
	         
	    System.out.println("Ket qua so sanh su dung ham compareTo(): ");
	    // so sánh 2 chuỗi sử dụng hàm compareTo()
	    // compareTo(): so sánh có phân biệt chữ hoa chữ thường
	    // nếu biến result < 0 thì chuỗi 1 < chuỗi 2
	    // nếu biến result > 0 thì chuỗi 1 > chuỗi 2
	    // nếu biến result == 0 thì chuỗi 1 = chuỗi 2
	    result = chuoi1.compareTo(chuoi2);
	    if (result < 0) {
	        System.out.println("-1");
	    } else if (result > 0) {
	        System.out.println("1");
	    } else {
	        System.out.println("0");
	    }
	         
	    System.out.println("Kt qua so sanh su dung ham compareToIgnoreCase(): ");
	    // so sánh 2 chuỗi sử dụng hàm compareToIgnoreCase()
	    // compareToIgnoreCase(): so sánh không phân biệt chữ hoa chữ thường
	    // nếu biến result < 0 thì chuỗi 1 < chuỗi 2
	    // nếu biến result > 0 thì chuỗi 1 > chuỗi 2
	    // nếu biến result == 0 thì chuỗi 1 = chuỗi 2
	    result = chuoi1.compareToIgnoreCase(chuoi2);
	    if (result < 0) {
	        System.out.println("-1");
	    } else if (result > 0) {
	        System.out.println("1");
	    } else {
	        System.out.println("0");
	    }
	}
}
