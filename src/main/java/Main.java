
import java.util.Scanner;

public class Main {

    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {

        Calc.Calc calculation = new Calc.Calc();
        calculation.setA(getValue("Введите первое число и нажмите Enter:"));
        calculation.setB(getValue("Введите второе число и нажмите Enter:"));
        calculation.setOperator(getValue("Введите операцию(+, -, *, /) и нажмите Enter:"));

        scaner.close();

        calculation.calc();
    }

    private static String getValue(String text) {
        System.out.println(text);
        return scaner.nextLine();
    }
}


