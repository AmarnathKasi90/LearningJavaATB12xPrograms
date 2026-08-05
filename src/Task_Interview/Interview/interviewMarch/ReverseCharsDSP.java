package Task_Interview.Interview.interviewMarch;

//Reverses all letters across the entire string
//Keeps digits in the same positions
public class ReverseCharsDSP {
    public static void main(String[] args) {

        String input = "Java956BDD2057Selenium67a";
        String expected = "amui956nel2057eSDDBava67J";

        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Skip non-letters from left
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // Skip non-letters from right
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            // Swap letters
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        String result = new String(arr);

        System.out.println("Output: " + result);

        if (result.equals(expected)) {
            System.out.println("Matching");
        } else {
            System.out.println("Not Matching");
        }
    }
}