
import Calc.Calc;
import java.util.Scanner;

public class Main {

    static Scanner scaner = new Scanner(System.in);
    //private static String c;

    public static void main(String[] args) {
        Calc calculation = new Calc();

        userQuestionsA("Введите первое число и нажмите Enter: ", calculation);
        userQuestionsB("Введите второе число и нажмите Enter: ", calculation);

        calculation.setOperator(getValue("Введите операцию(+, -, *, /) и нажмите Enter:"));

        try {
            String str;
            str = String.format("%.4f", calculation.calc());
            System.out.print("Результат: " + str);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Деление на ноль!");
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
            System.out.println("Введена неверная операция!");
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
            System.out.println("Введите корректное значение первого аргумента.");
            userQuestionsA(string, calc);
        }
    }

    public static void userQuestionsB(String string, Calc calc) {
        System.out.println(string);
        String b = scaner.nextLine();
        try {
            calc.setB(b);
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное значение второго аргумента.");
            userQuestionsB(string, calc);
        }
    }
}


