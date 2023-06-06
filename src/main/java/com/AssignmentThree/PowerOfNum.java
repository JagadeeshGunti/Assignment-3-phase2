package com.AssignmentThree;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int i =1;
        int mul = 1;
        while(i<=B){
            mul = mul*A;
            i++;
        }
        System.out.println(mul);
    }
}
