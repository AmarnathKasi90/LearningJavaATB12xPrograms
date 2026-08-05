package Task_Interview.Interview.interviewMarch;

public class ReverseSentenceChars {
    public static void main(String[] args) {
        String input = "Java Selenium";
        String expected = "avaJ muineleS";
        String[] words = input.split(" ");
        String result = "";
        for (String word : words) {
            char[] arr = word.toCharArray();
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                if (!Character.isLetter(arr[left])) {
                    left++;
                } else if (!Character.isLetter(arr[right])) {
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
        result = result.trim();

        if (result.equals(expected)) {
            System.out.println("Matching");
        } else {
            System.out.println("Not Matching");

        }
    }

}
