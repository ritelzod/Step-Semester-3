package src.main.java.assignment_problems;

public class Week1_Assignment2 {
    

    
    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int total = original.length();
        int firstMismatchPos = -1;
        char origChar = ' ', typedChar = ' ';

        for (int i = 0; i < total; i++) {
            if (i < typed.length() && original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; 
                origChar = original.charAt(i);
                typedChar = (i < typed.length()) ? typed.charAt(i) : ' ';
            }
        }

        double accuracy = ((double) matched / total) * 100;

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | ", matched, total, accuracy);
        if (firstMismatchPos != -1) {
            System.out.printf("First Mismatch at position %d ('%c' vs '%c')%n", firstMismatchPos, origChar, typedChar);
        } else {
            System.out.println("No Mismatches");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\n--- Test Case 2 ---");
        checkTypingAccuracy("coding", "coding");
    }
}
    

