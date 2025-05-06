package Interview;

public class IQ018_RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    private static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {

                result = result + ch;
            }
        }
        return result;
    }
}
