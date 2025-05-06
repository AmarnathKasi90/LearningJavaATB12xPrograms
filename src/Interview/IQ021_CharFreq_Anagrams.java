package Interview;

public class IQ021_CharFreq_Anagrams {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "silent";
        if (isAnagrams(s1, s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    private static boolean isAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charFreq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charFreq[s1.charAt(i) - 'a']++;
            charFreq[s2.charAt(i) - 'a']--;
        }
        for (int count : charFreq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
