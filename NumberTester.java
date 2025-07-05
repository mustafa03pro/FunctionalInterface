package com.mustafa.july03;


import java.util.Scanner;
import java.util.function.Predicate;
public class NumberTester {
    public static void main(String []args){
        Predicate<Integer>p1=num->num%2==0;
        Predicate<Integer>p2=num->{
            if(num==1){
                return false;
            }
            for(int i=2;i<=num/2;i++){
              
                if(num%i==0){
                    return false;

                }
               
            }
             return true;
        };


        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Is "+num+" even? "+p1.test(num));
        System.out.println("Is "+num+" prime? "+p2.test(num));




    } 
}