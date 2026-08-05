package Task_Interview.Interview.interviewNov;

class VowelConsonantsCount {
    public static void main(String[] args) {
        String input = "Count the Vowels and Consonants";
        input = input.toLowerCase();
        int vowelCount = 0;
        int consonantsCount= 0;
        int specCharCount = 0;
        for(int i = 0; i< input.length();i++){
            char c = input.charAt(i);
            if(!Character.isLetter(c)){
                specCharCount++;
                System.out.println(c);
            }
            else if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
                vowelCount++;
            }
            else {
                consonantsCount++;
            }
        }
        System.out.println("Vowels Count: " + vowelCount + " Consonants Count: " + consonantsCount + " Special Char Count: " + specCharCount);
    }}
