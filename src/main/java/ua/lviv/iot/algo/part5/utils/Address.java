package ua.lviv.iot.algo.part5.utils;

import java.util.Scanner;

public class Address {
    public String findAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a text:");
        String text = scanner.nextLine();
        System.out.println("\n");
        String pattern = "\\w+, str. (\\w+\\s?)+, \\d+\\w?";
        return text.replaceAll(pattern, "ADDRESS");
    }
}
