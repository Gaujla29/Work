package com.sparta.ga;

import javax.swing.*;

public class Palindrome {
    public void palindromeSolver(String Answer) {

        String reverse = "";
        int length = Answer.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + Answer.charAt(i);

        if (Answer.equals(reverse))
            System.out.println(Answer+" is a palindrome");
        else
            System.out.println(Answer+" is not a palindrome");

    }
}