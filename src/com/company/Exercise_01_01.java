package com.company;
import java.util.*;

public class Exercise_01_01 {
    public static void main(String[] args){
        System.out.println("Percentage Calculator");
        Scanner harry = new Scanner(System.in);
        System.out.println("Enter the full mark of each subject : ");
        int mark = harry.nextInt();
        mark = mark*6;

        System.out.println("Enter the marks you got in each subject: ");
        System.out.println("Science : ");
        float Sci = harry.nextFloat();
        System.out.println("Mathematics : ");
        float Math = harry.nextFloat();
        System.out.println("English : ");
        float Eng = harry.nextFloat();
        System.out.println("Hindi : ");
        float Hindi = harry.nextFloat();
        System.out.println("SST : ");
        float SST = harry.nextFloat();
        System.out.println("Odia : ");
        float Odia = harry.nextFloat();
        float percentage = (Sci+Math+Eng+Hindi+SST+Odia)/mark;
        percentage = percentage*100;
        System.out.print("Your Percentage in CBSE Boards is  ");
        System.out.print(percentage);
        System.out.println("%");
        System.out.println("Press 1 to exit");
        int Bye = harry.nextInt();
        System.out.println(Bye);
        harry.close();
    }
}
