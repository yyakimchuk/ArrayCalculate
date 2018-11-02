package Calc;

public class Calc {


    private String a;
    private String b;
    private String operator;

    private Float an = null;
    private Float bn = null;

    public void setA(String a) throws NumberFormatException {
        an = Float.parseFloat(a);
        this.a = a;
    }

    public void setB(String b) throws NumberFormatException {
        bn = Float.parseFloat(b);
        this.b = b;
    }

    public Float getAn() {
        return an;
    }

    public Float getBn() {
        return bn;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public float calc() throws ArithmeticException, IllegalArgumentException {
        switch (operator) {
            case "+":
                return an + bn;
            case "-":
                return an - bn;
            case "*":
                return an * bn;
            case "/":
                if (bn != 0) {
                    return an / bn;
                } else {
                    throw new ArithmeticException();
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    /*public static void Print(String text) {
        System.out.println(text);
    }*/
}