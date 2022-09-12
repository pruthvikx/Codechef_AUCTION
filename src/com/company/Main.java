package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for(int i = 0;i < testCase;i++){
            int alice = scan.nextInt();
            int bob = scan.nextInt();
            int charlie = scan.nextInt();

            if (alice > bob && alice > charlie){
                System.out.println("Alice");
            }else if (bob > alice && bob > charlie){
                System.out.println("Bob");
            }else {
                System.out.println("Charlie");
            }
        }
    }
}
