package Task_Interview.Interview.interviewMarch;

//Reverse letters within segments separated by digits
public class ReverseCharsInSegments {
    public static void main(String[] args) {

        String input = "Java956BDD2057Selenium67a";
        String expected = "avaJ956DDB2057muineleS67a";
        char[] arr = input.toCharArray();
        int start = 0;
        for (int i = 0; i <= arr.length; i++) {
            // When digit OR end → reverse previous word
            if (i == arr.length || !Character.isLetter(arr[i])) {

                int left = start;
                int right = i - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                start = i + 1;
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

/*  String input = "Java956bdd7092selenium67a";
String output = "avaJ956ddb7092muineles67a";

StringBuilder letters = new StringBuilder();
for(char c: input.toCharArray()) {
    if (Character.isLetter(c)) {
        letters.append(c);
    }
}

letters.reverse();

StringBuilder result = new StringBuilder();
int letterIndex = 0;

for(char c: input.toCharArray()) {
    if(Character.isDigit(c)) {
        result.append(c);
    } else {
        result.append(letters.charAt(letterIndex++));
    }
}

System.out.println(result.equals(output));  // prints true


 */