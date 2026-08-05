package interviewJuly26;

public class IQ029_RemoveDuplicates_CaseSensitive {
    public static void main(String[] args) {
        String input = "IQ029_RemoveDuplicates_CaseSensitive";
        String result ="";
        for(int i = 0; i<input.length();i++){
            char ch = input.charAt(i);
            if(result.toLowerCase().indexOf(Character.toLowerCase(ch))==-1){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
