package com.choda;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
//        Box3 box3 = new Box3(24.0f,14.0f,13);
//        Box5 box5 = new Box5(39.5f,27.5f,23);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the object's length:");
        float length = scanner.nextFloat();
        System.out.print("Please enter the object's width:");
        float width = scanner.nextFloat();
        System.out.print("Please enter the object's heigth:");
        int height = scanner.nextInt();

        if (box3.validate(length,width,height)){
            System.out.println("Box3");
        }else if(box5.validate(length,width,height)){
            System.out.println("Box5");
        }else{
            System.out.println("no applicable box");
        }

    }
}
