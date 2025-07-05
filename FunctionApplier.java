package com.mustafa.july03;


import java.util.Scanner;
import java.util.function.Function;
public class FunctionApplier {
    public static void main(String []args){
        
         Function<String, Integer> f1 = s -> {
           int upperStr = s.length();
           
           //div=num/2;
            System.out.println("String length of "+s+ " : " + upperStr);
            
             return upperStr;
        };
        Function<Integer, Double> f2 = d -> {
            double div=(double)d/2;
            System.out.println("Result of dividing " +d+" by 2: " + div);
            return div;

        };

        

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=sc.nextInt();
        f1.apply(str);
        f2.apply(num);
      




    } 
}