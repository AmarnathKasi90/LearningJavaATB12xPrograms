package Interview;

public class IQ011_CountVowelsAndConsonants {

    public static void main(String[] args) {
        String word = "Count the Vowels and Consonants";
        word = word.toLowerCase();

        //char ch=' ';
        int vowelCount = 0,consonantCount = 0;
        for(int i=0; i<=word.length()-1;i++){
            char ch = word.charAt(i);
            if(  ch =='a' || ch =='e'|| ch =='i' || ch =='o' || ch =='u' ){
                vowelCount++;
            }
            else if (ch >= 'a' && ch <= 'z'){
                consonantCount++;
            }
        }
        System.out.println("Count the Vowels " + vowelCount + " and Consonants " +consonantCount );

    }
}
