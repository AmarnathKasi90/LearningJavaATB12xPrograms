package ex_2026_Jan;

public class Alpha_Reverse {
    public static void main(String[] args) {

        String input = "Java956bdd7092selenium67a";
        String output = "avaJ956ddb7092muineles67a";

        StringBuilder letters = new StringBuilder();
        for(char c: input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }
            System.out.println(letters);
            letters.reverse();
            System.out.println(letters);

            StringBuilder result = new StringBuilder();
            int letterIndex=0;

            for(char c: input.toCharArray()){
                if(Character.isDigit(c)){
                    result.append(c);
                }
                else {
                    result.append(letters.charAt(letterIndex++));
                }
            }

        System.out.println(result.equals(output));


























        /*
         String input = "Amarnath Reddy";
        String reversed = "";
        String output = "yddeR htanramA";


      for(int i = input.length()-1;i>=0;i--){
          char ch = input.charAt(i);
          reversed = reversed + ch;

      }
        System.out.println(reversed);

      if(reversed.equalsIgnoreCase(output)){
          System.out.println("Input and Output are same");
      }
      else {
          System.out.println("Input and Output are not same");
      }
*/



















/*
        String input ="amar";
        String input ="madam";

       for(int i = input.length()-1;i>=0;i--){
            char ch = input.charAt(i);
            reversed = reversed + ch;
        }
        System.out.println(reversed);

        if(input.equalsIgnoreCase(reversed)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
*/
    }
}
