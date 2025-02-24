//32) Write a program to Find the number of days in a month.
//Input:- 4
//Output:- 30

import java.util.*;
public class DaysInMonth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>12){
            System.out.print("Invalid...Please Enter the 1 to 12...");
        }else if(n==1 || n==3 || n==5|| n==7||n==8||n==10||n==12){
            System.out.print(31);
        }else if(n==2){
            System.out.print("28 in non-leap year and 29 in leap-year");
        }else{
            System.out.print(30);
        }
    }
}


