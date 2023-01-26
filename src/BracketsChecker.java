import java.util.List;
import java.util.stream.Collectors;

public class BracketsChecker {
    public static boolean check(String value, char[][] config) {
        if (value.length() % 2 != 0) {
            return false;
        }
        List<Character> valueChars =
                value.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        int flag = 1;
        while (flag == 1) {
            flag = 0;
            for (int i = 0, j = 1; j < valueChars.size(); i++, j++) {
                if (configChecker(valueChars.get(i), valueChars.get(j), config)) {
                    valueChars.remove(i);
                    valueChars.remove(i);
                    flag = 1;
                }
            }
        }
        if (valueChars.size() == 0) {
            return true;
        }
        return false;
    }


    private static boolean  configChecker(char open, char close, char[][] config) {
        for (int i = 0; i < config.length; i++) {
            if (open == config[i][0] & close == config[i][1]) {
                return true;
            }
        }
        return false;
    }
}