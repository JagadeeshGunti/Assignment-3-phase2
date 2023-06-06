package com.AssignmentThree;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int mul = 1;
        while (i <= 10) {
            mul = N * i;
            System.out.println(+N+"*"+i+"="+mul);
            i++;
        }
    }

}
