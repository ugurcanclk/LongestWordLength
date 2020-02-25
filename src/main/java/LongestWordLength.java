import java.util.Arrays;
import java.util.List;

public class LongestWordLength {

    public String finder(String str) {

        String result = "";

        str =str.replaceAll("[!\"\\#$%&'()*+,\\-./:;<=>?@\\[\\\\\\]^_‘{|}~]", "");

        List<String> words = Arrays.asList(str.split(" "));

        String temp = "";

        for (String word : words) {
            if (word.length() > temp.length()) {
                temp = word;
            }
            result=temp;
        }
        return result+" "+result.length();

    }
}

