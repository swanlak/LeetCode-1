package idv.carl.datastructures.stack;

/**
 * @author Carl Lu
 */
public class ReversePolishNotationCalculator {

    private final static char ADD = '+';
    private final static char MINUS = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';

    public int calculate(String rpnExpression) {
        Stack stack = new Stack(20);
        char[] chars = rpnExpression.toCharArray();

        // Step1. Obtain char from input sequentially
        for (char c : chars) {
            /*
             * Step2. Push the element into stack if it's a operand
             * (here we only assume the operand is n, and 0 ≤ n ≤ 9)
             */
            if (c >= '0' && c <= '9') {
                stack.push((int) c - '0');
            }
            /*
             * Step3. If it's a operator, pop two value from stack for calculation, then put the
             * result back to the stack
             */
            else {
                int latter = stack.pop();
                int former = stack.pop();
                int tmp = 0;
                if (c == ADD) {
                    tmp = former + latter;
                } else if (c == MINUS) {
                    tmp = former - latter;
                } else if (c == MULTIPLY) {
                    tmp = former * latter;
                } else if (c == DIVIDE) {
                    tmp = former / latter;
                }
                // Push back to the stack
                stack.push(tmp);
            }
        }
        return stack.pop();
    }

}
