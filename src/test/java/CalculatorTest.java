import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.*;

import javax.xml.transform.Result;
import java.net.ProxySelector;
import java.util.stream.Stream;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test start");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test start");
    }

    @Test
    public void testAdd() {
        //Arrange
        int x = 3;
        int y = -4;
        int expected = -1;

        //Act
        int result = calculator.add(x, y);
        //Assert
        Assertions.assertEquals(expected, result);


    }

    @Test
    public void testMultiply() {
        //Arrange
        int x = 5, y = 3, expected = 15;
        //Act
        int result = calculator.multiply(x, y);
        //Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivade() {
        int x = 50, y = 9, expected = 5;

        int result = calculator.divide(x, y);

        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testDivade1() {
        int x = 3, y = 0,expected=0;

        int result = calculator.divide(x, y);

        Assertions.assertEquals(expected,result);
    }

    @Test
    public  void subtraction(){
        int x=8,y=5,expected=3;

        int result=calculator.subtraction(x,y);

        Assertions.assertEquals(expected,result);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test end");

    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test end");
    }
}
