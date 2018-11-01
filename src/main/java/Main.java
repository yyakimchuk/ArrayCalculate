
import Calc.Calc;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        Calc calculation = new Calc();

        userQuestionsA("Введите первое число и нажмите Enter:", calculation);
        userQuestionsB("Введите второе число и нажмите Enter:", calculation);

        calculation.setOperator(getValue("Введите операцию(+, -, *, /) и нажмите Enter:"));

        try {
            String str;
            str = String.format("%.4f",calculation.calc());
            System.out.print("Результат: " + str);
            //System.out.printf("Результат: %.4f" + calculation.calc());
            //System.out.printf(Float.valueOf(calculation.calc()));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Деление на ноль!");
        }
        scaner.close();
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
        String b = scaner.nextLine();
        try {
            calc.setB(b);
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное значение");
            userQuestionsB(string, calc);
        }
    }
}


