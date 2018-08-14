package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age to be converted into Nexian Habitat");
        int a = scan.nextInt();
        int count =0;
        ArrayList<String> list = new ArrayList<>();

        for(int i =1; i <= a;i++){

            if(i%10 == 0){
                if(i/10 == 1){
                   list.add("A");
                }
                else{
                   list.add(((i/10)-1) + "A");
                }
            }

            list.add(i+ "");
            if(i < a) {
                System.out.print(list.get(i - 1) + ", ");
            }else {
                System.out.println(list.get(i-1)+ ".}");
            }
        }


    }
}
