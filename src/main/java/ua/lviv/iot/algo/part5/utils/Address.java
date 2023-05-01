package ua.lviv.iot.algo.part5.utils;

import java.util.Scanner;

public class Address {
    public String findAddress(String text) {
        String pattern = "\\w+, str. (\\w+\\s?)+, \\d+\\w?";
        return text.replaceAll(pattern, "ADDRESS");
    }

    public static void main(String[] args) {
        Address address = new Address();
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a text:");
        String text = scanner.nextLine();
        address.findAddress(text);
        scanner.close();
        System.out.println("\n");
        System.out.println(address.findAddress(text));
    }
}