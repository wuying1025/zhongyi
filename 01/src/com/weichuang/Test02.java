package com.weichuang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(10);
        }
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == input){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("赢了");
        }else{
            System.out.println("输了");
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(input);
    }

}
