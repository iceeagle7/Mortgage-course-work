package com.company;
import java.util.Scanner;
/*дочерний класс который наследует основной класс Банк*/
public class Mortgage extends Bank {
    Scanner keyboard = new Scanner(System.in);
    private double MonthSum; /*ай сайынғы вклад*/

    /*қалған айнымалыларды инициализациялау үшін конструктор
    (жалпы және айлық төлемдерді қабылдайды)*/
    public Mortgage(double sum, double monthSum) { /*жалпы айнымалылар толық төлем және айлық төлем*/
        /*негізгі функцияға қатынасады және негізгі функциядағы конструкторды шақырады*/
        super(sum); /*шакыру*/
        MonthSum = monthSum;
    }
    public static int menu(Scanner keyboard) {

        System.out.println("Select a bank to get a mortgage"); /*Ипотека алу үшін Банк таңдаңыз*/
        System.out.println("1.Zhil Stroy Bank");
        System.out.println("2. Halyk Bank");
        System.out.println("3. ForteBank");
        System.out.println("4. Exit");

        int choice;

        do {
            System.out.print("Enter the number: "); /*Санды еңгезіңіз*/
            choice = keyboard.nextInt();
        } while(choice < 1 || choice > 4);

        return choice;
    }
    public void Print() {
        int choice;

        {
            choice = menu(keyboard);
            System.out.println();

            if (choice == 1) {
                percent = 8;
                System.out.println(this.percent + " interest rate");/*пайызды корсету*/
                System.out.println(this.sum + " full payment");/*общий сумманы көрсету*/
                System.out.println("You must pay in "+CalculateYear(MonthSum) + " years"); /*Сіз толық төлейтін уақытты корсетеди*/
                System.out.println(this.leftSum + " overpayment"); /*артық төлем*/
            } else if(choice == 2) {
                percent = 6;
                System.out.println(this.percent + " interest rate");/*пайызды корсету*/
                System.out.println(this.sum + " full payment");/*общий сумманы көрсету*/
                System.out.println("You must pay in "+CalculateYear(MonthSum) + " years"); /*Сіз толық төлейтін уақытты корсетеди*/
                System.out.println(this.leftSum + " overpayment"); /*Артық төлем */
            } else if(choice ==3){
                percent = 9;
                System.out.println(this.percent + " interest rate");
                System.out.println(this.sum + " full payment");
                System.out.println("You must pay in "+CalculateYear(MonthSum) + " years");
                System.out.println(this.leftSum + " overpayment"); /*Артық төлем */
            }
            else  {
                System.out.println("GoodBye!");
                return;
            }
            System.out.println();
            Print();
        }
    }


}
