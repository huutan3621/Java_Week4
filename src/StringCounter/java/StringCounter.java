package StringCounter.java;

import java.util.Scanner;

public class StringCounter {
	public static void main(String[] args) {
		String chuoi;
		int stringcounter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chuoi: ");
		chuoi=sc.nextLine();
		
		//dem so luong chu cai
		//long totalCharacters = chuoi.chars().filter(ch -> ch != ' ').count();
        //System.out.println("Co tong cong " + totalCharacters + " chu cai trong chuoi");
        
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isLetter(chuoi.charAt(i)))
            stringcounter++;
         }
         System.out.println("So luong chu cai trong chuoi: "+stringcounter);
        
		//dem so luong tu
		if (chuoi == null || chuoi.isEmpty()) {
		      stringcounter = 0;
		    }

		    String[] words = chuoi.split("\\s+");
		    stringcounter = words.length;
		System.out.println("So luong tu trong chuoi la: "+ stringcounter);
		
		//xoa so luong dau cach du thua
		String after = chuoi.trim().replaceAll(" +", " ");
		System.out.println("Chuoi sau khi xoa khoang trang thua: " + after);
		
		//in dam dau dong
		 String arr[] = chuoi.split("\\.");
		 System.out.println("Chuoi sau khi duoc chuan hoa: ");
		    for (int i = 0; i < arr.length; i++) {
		   System.out.print(Character.toUpperCase(arr[i].trim().
		   charAt(0)) + arr[i].trim().substring(1) + ". ");
		    }

	}
}
