package SortAlphabetically.java;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        //nhap vao so luong chuoi
        System.out.print("Nhap vao so luong chuoi ma ban muon: ");
        count = scan.nextInt();
        
        
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        
        //nguoi dung nhap va xep vao array
        System.out.println("Nhap gia tri tung chuoi: ");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        //Hien thi sau khi sap xep theo thu tu bang chu cai
        System.out.print("Cac chuoi xep theo bang chu cai: ");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}
