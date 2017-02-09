package idv.carl.datastructure.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import idv.carl.datastructures.stack.ReversePolishNotation;
import idv.carl.datastructures.stack.ReversePolishNotationCalculator;

/**
 * @author Carl Lu
 */
public class ReversePolishNotationCalculatorTest {

    @Test
    public void testCalculate() {
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String rpnExpression = new ReversePolishNotation().doTransfer("((7+9)/3-4)*3-9");
        assertEquals(-6, calculator.calculate(rpnExpression));
    }

}
