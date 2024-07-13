public class SymbolPattern {
    public static void main(String[] args) {
        char[] symbols = {'@', '?', '>'};
        for (char symbol : symbols) {
            for (int j = 0; j < 3; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
