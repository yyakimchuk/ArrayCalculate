package Calc;

public class Calc {
    private String a;
    private String b;
    private String operator;

    private float an = 0;
    private float bn = 0;

    public void setA(String a) {
        an = Float.parseFloat(a);
        this.a = a;
    }

    public void setB(String b) {
        bn = Float.parseFloat(b);
        this.b = b;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void calc() {
        switch (operator) {
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
                System.out.printf("Частное: %.4f", an / bn);
                break;
            default:
                System.out.println("Введена не корретная операция");
        }
    }
}