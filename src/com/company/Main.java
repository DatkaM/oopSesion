package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Car car = new Car();
    Scanner scanner = new Scanner(System.in);

        car.name="Toyota";
        car.color="Black";
        car.model="Camry";
       // int a = scanner.nextInt();

        System.out.println(car.name);
        System.out.println(car.color);
        System.out.println(car.model);

        car.chekSpped(scanner.nextInt());   //a
    }
}
