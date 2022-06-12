package com.example;

import java.util.Scanner;



public class Try {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try{
            System.out.println("A");
        }catch(Exception e){
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
        System.out.println("test");
    }
}