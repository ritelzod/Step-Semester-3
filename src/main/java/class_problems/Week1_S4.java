public class Week1_S4 {

    
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {
        String[] testCases = {"swiss", "aabbcc"};
        
        for (String word : testCases) {
            char result = findFirstNonRepeatingChar(word);
            if (result != '\0') {
                System.out.println("Input: \"" + word + "\" -> First Non-Repeating Character: '" + result + "'");
            } else {
                System.out.println("Input: \"" + word + "\" -> No Non-Repeating Character Found");
            }
        }
    }
}