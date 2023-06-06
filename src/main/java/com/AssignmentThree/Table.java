package com.AssignmentThree;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =0;
        int mul = 1;
        while(i<=10){
            mul = n*i;
            System.out.println(+n+"*"+i+"="+mul);
            i++;
        }
    }

}
