package com.weichuang;

public class Test01 {
    public static void main(String[] args) {
        boolean b = false;
        byte b1 = 1;
        short s = 2;
        long l = 4L;
        int i = 3;
        float f = 5F;
        double d = 6.0D;
        char c = 'A';
        String str = "sss";
//        + - * / %  & && || ! ++ --
//        int String
        if(0 > 1 && i++ > 2){
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println(111);

        int[] a1 = new int[5];
        int[] a2 = new int[]{1,2,3,4,5};
        int[] a3 = {1,2,3,4,5};

        for (int j = 0; j < a2.length ; j++) {
            System.out.println(a2[j]);
            System.out.println(j);
        }
        for (int x:a3) {
            System.out.println(x);
        }

    }
}
