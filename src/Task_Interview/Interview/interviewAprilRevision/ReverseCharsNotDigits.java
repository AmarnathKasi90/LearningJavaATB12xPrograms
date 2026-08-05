package Task_Interview.Interview.interviewAprilRevision;

class ReverseCharsNotDigits {
    public static void main(String[] args) {

        String input = "Java956Selenium2058Bdd98a";
        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length -1 ;

        while(left < right){
            if(!Character.isLetter(arr[left])){
                left++;
            }
            else if (!Character.isLetter(arr[right])){
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String result = new String(arr);
        System.out.println(result);
    }
}

