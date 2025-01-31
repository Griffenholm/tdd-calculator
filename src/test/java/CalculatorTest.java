import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    void setup(){}

    @AfterEach
    void tearDown(){}

    @Test
    @DisplayName("Testing addition")
    void testAddition (){
        // Arrange
        int inputA = 1;
        int inputB = 1;
        int expected = 2;

        //Act
        int actual = calculator.add(inputA, inputB);

        // Assert
        assertEquals(expected, actual, "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("Testing subtract")
    void testSubtracting(){
        int inputA = 1;
        int inputB = 1;
        int expected = 0;

        int actual = calculator.subtract(inputA, inputB);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing multiply")
    void testMultiply(){
        int inputA = 2;
        int inputB = 2;
        int expected = 4;

        int actual = calculator.multiply(inputA, inputB);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing divide")
    void testDivide(){
        int inputA = 2;
        int inputB = 2;
        int expected = 1;

        int actual = calculator.divide(inputA, inputB);

        assertEquals(expected, actual);
    }


}
