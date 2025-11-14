import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {
    private static final String HELP_TEXT = String.join(System.lineSeparator(),
            "Simple Calculator",
            "",
            "Enter expressions in one of these forms:",
            "  <number> <op> <number>    e.g., 12.5 * -3",
            "  <op> <number> <number>    e.g., add 2 3",
            "",
            "Supported ops:",
            "  +  -  *  /  %  ^",
            "  add sub mul div mod pow",
            "",
            "Commands:",
            "  help  - show this help",
            "  quit  - exit the calculator",
            "");

    public static void main(String[] args) {
        // If expression provided as CLI args, evaluate once then exit
        if (args != null && args.length >= 3) {
            String result = evaluateTokens(args);
            System.out.println(result);
            return;
        }

        // Interactive REPL
        System.out.println(HELP_TEXT);
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        while (true) {
            System.out.print("> ");
            if (!scanner.hasNextLine()) {
                break;
            }
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                continue;
            }

            String lower = line.toLowerCase(Locale.ROOT);
            if ("quit".equals(lower) || "exit".equals(lower)) {
                break;
            }
            if ("help".equals(lower)) {
                System.out.println(HELP_TEXT);
                continue;
            }

            String[] tokens = line.split("\\s+");
            String output = evaluateTokens(tokens);
            System.out.println(output);
        }
    }

    private static String evaluateTokens(String[] tokens) {
        if (tokens == null || tokens.length < 3) {
            return errorWithUsage("Expected 3 tokens, got " + (tokens == null ? 0 : tokens.length));
        }

        // Two acceptable forms:
        // 1) <number> <op> <number>
        // 2) <op> <number> <number>
        // Choose by inspecting the first token
        String first = tokens[0];

        if (isNumber(first)) {
            if (tokens.length != 3) {
                return errorWithUsage("Infix form requires exactly 3 tokens");
            }
            String leftToken = tokens[0];
            String operatorToken = tokens[1];
            String rightToken = tokens[2];
            return evaluateInfix(leftToken, operatorToken, rightToken);
        } else {
            if (tokens.length != 3) {
                return errorWithUsage("Prefix form requires exactly 3 tokens");
            }
            String operatorToken = tokens[0];
            String leftToken = tokens[1];
            String rightToken = tokens[2];
            return evaluateInfix(leftToken, operatorToken, rightToken);
        }
    }

    private static String evaluateInfix(String leftToken, String operatorToken, String rightToken) {
        Double left = parseNumber(leftToken);
        Double right = parseNumber(rightToken);
        if (left == null || right == null) {
            return errorWithUsage("Numbers are invalid: '" + leftToken + "' and '" + rightToken + "'");
        }

        String normalizedOp = normalizeOperator(operatorToken);
        if (normalizedOp == null) {
            return errorWithUsage("Unsupported operator: '" + operatorToken + "'");
        }

        try {
            double result = evaluateBinary(normalizedOp, left, right);
            return formatResult(left, normalizedOp, right, result);
        } catch (ArithmeticException ex) {
            return "Error: " + ex.getMessage();
        }
    }

    private static String formatResult(double left, String op, double right, double result) {
        return String.format(Locale.US, "%s %s %s = %s",
                stripTrailingZeros(left), op, stripTrailingZeros(right), stripTrailingZeros(result));
    }

    private static String stripTrailingZeros(double value) {
        // Use BigDecimal-like formatting without importing BigDecimal for simplicity
        String text = String.format(Locale.US, "%.15f", value);
        // Trim trailing zeros and optional dot
        int end = text.length();
        while (end > 0 && text.charAt(end - 1) == '0') {
            end--;
        }
        if (end > 0 && text.charAt(end - 1) == '.') {
            end--;
        }
        return end == 0 ? "0" : text.substring(0, end);
    }

    private static String normalizeOperator(String opToken) {
        if (opToken == null) return null;
        String op = opToken.trim().toLowerCase(Locale.ROOT);
        switch (op) {
            case "+":
            case "add":
                return "+";
            case "-":
            case "sub":
            case "subtract":
                return "-";
            case "*":
            case "x":
            case "mul":
            case "multiply":
                return "*";
            case "/":
            case "div":
            case "divide":
                return "/";
            case "%":
            case "mod":
            case "modulo":
                return "%";
            case "^":
            case "pow":
            case "power":
                return "^";
            default:
                return null;
        }
    }

    private static double evaluateBinary(String op, double left, double right) {
        switch (op) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                if (right == 0.0) {
                    throw new ArithmeticException("Division by zero");
                }
                return left / right;
            case "%":
                if (right == 0.0) {
                    throw new ArithmeticException("Modulo by zero");
                }
                return left % right;
            case "^":
                return Math.pow(left, right);
            default:
                throw new IllegalArgumentException("Unhandled operator: " + op);
        }
    }

    private static boolean isNumber(String token) {
        return parseNumber(token) != null;
    }

    private static Double parseNumber(String token) {
        if (token == null) return null;
        try {
            return Double.parseDouble(token);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static String errorWithUsage(String message) {
        return message + System.lineSeparator() +
                "Usage examples:" + System.lineSeparator() +
                "  2 + 3" + System.lineSeparator() +
                "  add 2 3" + System.lineSeparator();
    }
}
