package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the length of the password: ");
        int length = input.nextInt();

        System.out.println("Add UPPERCASE? 1-YES, 0-NO");
        int useUpper = input.nextInt();
        String UpperCase = "";
        if (useUpper == 1){
            System.out.println("Enter specific UPPERCASE letters: ");
            UpperCase = input.nextLine();
        }

        System.out.println("Add lowercase? 1-yes, 0-no");
        int useLower = input.nextInt();
        String LowerCase = "";
        if(useLower == 1){
            System.out.println("Enter specific lowercase letters: ");
            LowerCase = input.nextLine();
        }

        System.out.println("Add numbers? 1-YES, 0-NO");
        int num = input.nextInt();
        String numBer = "";
        if (num == 1){
            System.out.println("Enter specific numbers: ");
            numBer = input.nextLine();
        }

        System.out.println("Add symbols? 1-YES, 0-NO");
        int sym = input.nextInt();
        String symBol = "";
        if (sym == 1){
            System.out.println("Enter specific symbols: ");
            symBol = input.nextLine();
        }

        input.close ();
    }

}