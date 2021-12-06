package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter full payment: ");
        double sum = in.nextDouble(); /*жалпы соманы енгіземіз*/
        System.out.print("Enter your monthly payment: ");
        double monthSum = in.nextDouble();   /*ай сайынғы төлемді енгіземіз*/


        /* Mortgage айнымалы мәнін инициализация жасаймыз және мәндері бар конструкторды шақырамыз*/
        Mortgage bank = new Mortgage(sum, monthSum);

        bank.Print(); /*ақпаратты көрсетуге жауапты функцияны шақырамыз */
    }
}