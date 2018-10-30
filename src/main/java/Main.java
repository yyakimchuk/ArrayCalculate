
import Calc.Calc;
import java.util.Scanner;

public class Main {

    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        Calc calculation = new Calc();

        userQuestionsA("Введите первое число и нажмите Enter:", calculation);
        userQuestionsB("Введите второе число и нажмите Enter:", calculation);

        calculation.setOperator(getValue("Введите операцию(+, -, *, /) и нажмите Enter:"));

        scaner.close();

        calculation.calc();
    }

    private static String getValue(String text) {
        System.out.println(text);
        return scaner.nextLine();
    }

    public static void userQuestionsA(String string, Calc calc) {
        System.out.println(string);
        String a = scaner.nextLine();
        try {
            calc.setA(a);
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное значение");
            userQuestionsA(string, calc);
        }
    }

    public static void userQuestionsB(String string, Calc calc) {
        System.out.println(string);
        String a = scaner.nextLine();
        try {
            calc.setB(a);
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное значение");
            userQuestionsA(string, calc);
        }
    }
}


