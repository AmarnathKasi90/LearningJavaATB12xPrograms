package interviewJuly26;

public class IQ031_ReverseSentenceChars {
    public static void main(String[] args) {
        String text = "Java Selenium";
        String output = "avaJ muineleS";

        String[] words = text.split("\\s+");
        String result = "";
        for (String word : words) {
            char[] arr = word.toCharArray();
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                if (!Character.isLetter(arr[left])) {
                    left++;
                } else if (!Character.isLetter((arr[right]))) {
                    right--;
                } else {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            result = result + new String(arr) + " ";
        }
        output = result.trim();
        System.out.println(output);
    }
}
