package VowelChecker.java;

import java.util.Scanner;

public class Vowel {
	public static void main(String[ ] arg)
    {
        boolean isVowel=false;;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ky tu can kiem tra: ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if(isVowel == true) {
            System.out.println(ch+" Là nguyên âm");
        }
        else {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" la phu am");
            else
                System.out.println("Khong nam trong bang chu cai!");
        }
    }
}
