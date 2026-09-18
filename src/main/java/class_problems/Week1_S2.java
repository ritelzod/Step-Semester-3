public class Week1_S2 {
    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    
    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }

    public static void main(String[] args) {
        String[] testInputs = {"madam", "hello"};
        
        for (String word : testInputs) {
            boolean iter = isPalindromeIterative(word);
            boolean recur = isPalindromeRecursive(word);
            boolean rev = isPalindromeArrayReversal(word);
            
            System.out.println("Input: \"" + word + "\"");
            System.out.printf("Iterative: %s | Recursive: %s | Array Reversal: %s%n%n",
                    iter ? "Palindrome" : "Not Palindrome",
                    recur ? "Palindrome" : "Not Palindrome",
                    rev ? "Palindrome" : "Not Palindrome");
        }
    }
}
