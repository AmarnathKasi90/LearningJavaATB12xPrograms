package novInterview;

public class IQ011_CountVowelsAndConsonants {
    public static void main(String[] args) {
        String sentence = "IQ011_CountVowelsAndConsonants";
        sentence=sentence.toLowerCase();
        System.out.println(sentence);
        int vCount = 0,cCount=0;
        for(int i=0;i<sentence.length()-1;i++) {
            char ch = sentence.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            vCount++;
        }
        else if(ch>='a'&& ch<='z'){
            cCount++;
        }
        else {
            System.out.println(ch+" - Its not in a-z Range");
        }
        }
        System.out.println(vCount + " is vCount and cCount is "+ cCount);
    }
}
