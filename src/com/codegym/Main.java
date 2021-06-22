package com.codegym;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input decimal number");
        int decimal = input.nextInt();
        while (decimal > 0){
            stack.push(decimal%2);
            decimal = decimal / 2;
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        System.out.println(result);
    }
}
