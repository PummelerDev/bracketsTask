public class Main {
    public static void main(String[] args) {
        System.out.println(
                BracketsChecker.check(
                        "()[()]{((()))()}<({[]})>",
                        new char[][]{{'(', ')'},{'[',']'},{'{','}'}, {'<','>'}}));

    }
}
