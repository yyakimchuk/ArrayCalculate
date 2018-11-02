import Calc.Calc;
import org.junit.Assert;
import org.junit.Test;

public class TestCalc {
    private static Calc calc = new Calc();

    @Test
    public void testCreateObjectNotNull() {
        Assert.assertTrue("При создании объекта поля объекта не пустые", calc.getAn()==null && calc.getBn()==null);
    }

    @Test
    public void testCreateObjectNull() {
        calc.setA("2");
        calc.setB("3");
        Assert.assertTrue("При создании объекта поля объекта пустые", calc.getAn()!=null && calc.getBn()!=null);
    }

    @Test (expected = ArithmeticException.class)
    public void TestDivNolException() throws ArithmeticException {
        calc.setA("2");
        calc.setB("0");
        calc.setOperator("/");
        calc.calc();
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestOperationException() throws IllegalArgumentException {
        calc.setA("2");
        calc.setB("1");
        calc.setOperator("плюс");
        calc.calc();
    }

    @Test
    public void testSum() throws ArithmeticException, IllegalArgumentException {
        calc.setA("2");
        calc.setB("1");
        calc.setOperator("+");
        String str = String.format("%.4f",calc.calc());
        Assert.assertEquals("Сложение не верно!", 3.000, calc.calc(), 0);
    }

    @Test
    public void testRaznost() throws ArithmeticException, IllegalArgumentException {
        calc.setA("15");
        calc.setB("12");
        calc.setOperator("-");
        String str = String.format("%.4f",calc.calc());
        Assert.assertEquals("Разность не верна!", 3.000, calc.calc(), 0);
    }

    @Test
    public void testProizvedenie() throws ArithmeticException, IllegalArgumentException {
        calc.setA("2.5");
        calc.setB("2");
        calc.setOperator("*");
        String str = String.format("%.4f",calc.calc());
        Assert.assertEquals("Произведение не верно!", 5.000, calc.calc(), 0);
    }
}
