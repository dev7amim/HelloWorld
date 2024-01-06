import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decryption {
    public static void main(String[] args) {
        String encryption = "d89%l++5r19o7W *o=l645le9H";

        Pattern pattern = Pattern.compile("[ A-Za-z]+");
        Matcher matcher = pattern.matcher(encryption);

        StringBuilder secretMsg = new StringBuilder();
        while (matcher.find()) {
            secretMsg.append(matcher.group());
        }

        char[] charArray = secretMsg.toString().toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }

        String decryption = new String(charArray);
        System.out.println(decryption);
    }
}

// Happy Coding!!