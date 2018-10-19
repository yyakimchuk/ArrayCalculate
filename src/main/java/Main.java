import java.util.Scanner;

public class Main {
    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        String metod = "да";
        while (metod.equalsIgnoreCase("да")) {
            metod = getValue("Введите вид программы (1-калькулятор или 2-массив) и нажмите Enter:");
            switch (metod) {
                case "1":
                    calc();
                    break;
                case "2":
                    stringLeght();
                    break;
                default:
                    System.out.println("Неверный выбор!");
                    break;
            }
            metod = getValue("Для возврата выбора программы введите ДА и нажмите Enter");
        }

    }

    public static void calc() {

        String a;
        String b;
        String opr = "да";

        while (opr.equalsIgnoreCase("да")) {
            a = getValue("Введите первое число и нажмите Enter:");
            b = getValue("Введите второе число и нажмите Enter:");
            opr = getValue("Введите операцию(+,-,*,/) и нажмите Enter:");
            float an = 0;
            float bn = 0;
            try {
                an = Float.parseFloat(a);
                bn = Float.parseFloat(b);
            } catch (NumberFormatException e) {
                System.out.println("Введены не корректные числа. Расчет не возможен");
            }

            switch (opr) {
                case "+":
                    System.out.printf("Сумма: %.4f", an + bn);
                    break;
                case "-":
                    System.out.printf("Разность:  %.4f", an - bn);
                    break;
                case "*":
                    System.out.printf("Произведение: %.4f", an * bn);
                    break;
                case "/":
                    if (bn != 0) {
                        System.out.printf("Частное: %.4f", an / bn);
                        break;
                    } else {
                        System.out.println("Деление на ноль.На ноль делить нельзя");
                        break;
                    }
                default:
                    System.out.println("Введена не корретная операция");
            }
            opr = getValue("\nДля продолжения работы калькулятора введите ДА и нажмите Enter");
        }
    }

    public static void stringLeght() {
        String[] mass;
        try {
            mass = new String[Integer.parseInt(getValue("Введите длину массива целым числом и нажмите Enter:"))];
            int strCount = mass.length;
            for (int i = 0; i < strCount; i++) {
                mass[i] = getValue("Введите значение массива" + i + ":");
            }
            String rez = "";
            for (String element : mass) {
                if (element.length() > rez.length())
                    rez = element;
            }
            System.out.println("Наиболее длинное слово в массиве:\n"
                    + rez + "\nЕго длина: " + rez.length());
        } catch (NumberFormatException e) {
            System.out.println("Введено не корректное число. Попробуйде еще раз");
        }
    }

    private static String getValue(String text) {
        System.out.println(text);
        return scaner.nextLine();
    }
}


