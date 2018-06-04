package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fluffy's Tiny Adventure");
        System.out.println("Fluffy just woke up. Where should Fluffy go? Kitchen or Bedroom?");
        String firstAction = sc.next();
        if (firstAction.equalsIgnoreCase("kitchen")); {
            System.out.println("Fluffy waddles into the kitchen. The food bowl still empty.");
            System.out.println("What should Fluffy do? Wait for food or go find food?");
            String secAction = sc.next();
        }
        else if (firstAction.equalsIgnoreCase("bedroom"));{
            System.out.println("Fluffy waddles to the bedroom. The bedroom door is closed.");
            System.out.println("What should Fluffy do? Wait for the door to open or try to open the door?");
            String secAction = sc.next();
        }
        else
    }
}
