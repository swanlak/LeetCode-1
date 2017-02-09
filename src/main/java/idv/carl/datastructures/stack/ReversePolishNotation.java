package idv.carl.datastructures.stack;

/**
 * @author Carl Lu
 */
public class ReversePolishNotation {

    private final static int PRIORITY_LEVEL_1 = 1;
    private final static int PRIORITY_LEVEL_2 = 2;
    private final static char ADD = '+';
    private final static char MINUS = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';
    private final static char LEFT_PARENTHESES = '(';
    private final static char RIGHT_PARENTHESES = ')';

    public String doTransfer(String input) {
        StringBuffer result = new StringBuffer();
        Stack stack = new Stack(50);
        // Step1. Transform the input into char array
        char[] chars = input.toCharArray();
        // Step2. Apply related operation rule on each char
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            // 2.1 If it's operator, operate it according to the priority
            if (isAddOrMinus(c)) {
                doOperation(stack, result, c, PRIORITY_LEVEL_1);
            } else if (isMultiplyOrDivide(c)) {
                doOperation(stack, result, c, PRIORITY_LEVEL_2);
            }
            // 2.2 If it's left bracket, push to stack
            else if (c == LEFT_PARENTHESES) {
                stack.push(c);
            }
            // 2.3 If it's right bracket, pop from stack, stop when encounter the left bracket
            else if (c == RIGHT_PARENTHESES) {
                handleForRightBracket(stack, result);
            }
            // 2.4 If it's operand, add to output directly
            else {
                result.append(c);
            }
        }

        // Step3. If iterate to the end, pop up the operator into the output
        while (!stack.isEmpty()) {
            result.append((char) stack.pop());
        }
        return result.toString();
    }

    private void handleForRightBracket(Stack stack, StringBuffer result) {
        // Step1. Pop up value from stack into result
        while (!stack.isEmpty()) {
            char top = (char) stack.pop();
            // Step2. Stop until meet the left bracket
            if (top == LEFT_PARENTHESES) {
                break;
            } else {
                result.append(top);
            }
        }
    }

    private boolean isAddOrMinus(char c) {
        return (c == ADD || c == MINUS);
    }

    private boolean isMultiplyOrDivide(char c) {
        return (c == MULTIPLY || c == DIVIDE);
    }

    private void doOperation(Stack stack, StringBuffer result, char c, int priority) {
        // Step1. Obtain value from the top of stack
        while (!stack.isEmpty()) {
            char top = (char) stack.pop();
            // Step2. Compare with input char according to priority
            // 2.1 If top is left bracket, do nothing (need to push back the value)
            if (top == LEFT_PARENTHESES) {
                stack.push(top);
                break;
            } else {
                // Determine the priority of the top element
                int pTop;
                if (isAddOrMinus(c)) {
                    pTop = PRIORITY_LEVEL_1;
                } else {
                    pTop = PRIORITY_LEVEL_2;
                }

                if (pTop >= priority) {
                    // 2.2 If p(top) ≥ p(value), add top to result
                    result.append(top);
                } else {
                    // 2.3 If p(top) < p(value), do nothing (need to push back the value)
                    stack.push(c);
                    break;
                }
            }
        }
        // Step3. After found the lower priority element, push into the stack
        stack.push(c);
    }

}
