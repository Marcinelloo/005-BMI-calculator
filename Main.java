package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            Obikety osoba = new Obikety();

            double a,b;

        try{
            System.out.println("Podaj swoj wzrost w metrach (np 1,71): ");
            a = scanner.nextDouble();

            System.out.println("Podaj swoja wage w kg: ");
            b = scanner.nextDouble();

            osoba.obliczenie(a,b);}
        catch(Exception e)
        {
            System.out.println(" zamiast kropki uzyj przecinka :)) ");
        }

    }
}
