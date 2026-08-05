package Task_Interview.Interview.interviewMarch;

public class RemoveCaseSensitiveDuplicates {
        public static void main(String[] args){
            String input = "Java Selenium Cucumber";
            String expected= "Jav SelniumCbr";

            String result = "";
            for(int i = 0; i<input.length();i++) {
                char ch = input.charAt(i);
                if(result.toLowerCase().indexOf(Character.toLowerCase(ch))== -1){
                    result = result + ch;
                }
            }
            System.out.println(result);
            if(result.equalsIgnoreCase(expected)){
                System.out.println("Matching");
            } else {
                System.out.println("Not Matching");
            }
        }
    }

