package Task_Interview.Interview.interviewAprilRevision;

class VowelsConsonentsCount {

    public static void main(String[] args){

        int vowelCount =0;
        int consonentCount = 0;
        int specCharCount = 0;

        String text = "The count of Vowels Consonents Count are:";
        text = text.toLowerCase();
        System.out.println(text);

        for(int i=0;i<=text.length()-1;i++){
            char ch = text.charAt(i);
            if(ch=='a' || ch== 'e'|| ch=='i' || ch== 'o' || ch== 'u') {
                vowelCount++;
            }
            else if(ch >= 'b' && ch <= 'z'){
                consonentCount++;

            }
            else if(!Character.isLetter(ch)){
                specCharCount++;
                System.out.println(ch);
            }
        }

        System.out.println("vowelCount: " + vowelCount + " consonentCount: " + consonentCount + " specCharCount: " + specCharCount );
    }
}


