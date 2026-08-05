package Task_Interview.Interview.interviewNov;

class RemoveDuplicatesCaseSensitive {
    public static void main(String[] args) {
        String input = "Bdd Cucumber";
        String expected = "Bd Cumer";

        String result = "";
        for(int i=0; i<input.length();i++) {
            char ch = input.charAt(i);
            if(result.toLowerCase().indexOf(Character.toLowerCase(ch)) == -1){
                result = result+ch;
            }
        }
        System.out.println(result);
        if(result.equals(expected)){
            System.out.println("Matching");
        }
        else {
            System.out.println("Not Matching");
        }
    }}