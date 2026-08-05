package Task_Interview.Interview.interviewAprilRevision;

class RemoveDuplicates {
    public static void main (String[] args) {

        String text = "BDD Cucumber";
//        text = text.toLowerCase();
        String result = "";

        for(int i=0; i< text.length(); i++){
            char ch = text.charAt(i);

//            if(result.indexOf(ch) == -1) {
                if(result.toLowerCase().indexOf(Character.toLowerCase(ch)) == -1){
                result = result + ch;
            }
        }
        System.out.println(result);
    }}

