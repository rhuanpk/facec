public class Condicionais {
    public static void main(String[] args) {
        // IF/ELSE
        if (0 > 1) {
            // ...
        } else if (2 > 3) {
            // ...
        } else {
            // ...
        }

        // OPERADOR/TERNÁRIO
        int n1 = (0 > 1) ? 42 : 43;

        // SWITCH/CASE
        switch (42) {
            case 0:
                // ...
                break;
            case 1:
                // ...
                break;
            case 2, 3:
                // ...
                break;
            default:
                // ...
        }

        // SWITCH/EXPRESSION
        int n2 = switch (42) {
            case 0    -> 43;
            case 1    -> 44;
            case 2, 3 -> 45;
            default   -> 46;
        };
    }
}
