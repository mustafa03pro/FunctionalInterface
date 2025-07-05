package com.mustafa.july03;


import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String str = sc.nextLine();

       
        int num = sc.nextInt();

        
        Consumer<String> c1 = s -> {
            String upperStr = s.toUpperCase();
            System.out.println("After converting string to uppercase: " + upperStr);
        };

        
        Consumer<Integer> c2 = n -> {
            int squared = n * n;
            System.out.println("After squaring the integer: " + squared);
        };

       System.out.println("Original string: "+str);
       System.out.println("Original integer: "+num);

        c1.accept(str);
        c2.accept(num);
    }
}
