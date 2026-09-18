package src.main.java.assignment_problems;

public class Week1_Assignment5 {
    
    public static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
            int length = cleanedWord.length();

            if (length >= 1 && length <= 4) {
                shortCount++; // Short (1-4 letters)[cite: 2]
            } else if (length >= 5 && length <= 8) {
                mediumCount++; // Medium (5-8 letters)[cite: 2]
            } else if (length >= 9) {
                longCount++; // Long (9+ letters)[cite: 2]
            }
        }

        System.out.printf("Short: %d | Medium: %d | Long: %d%n", shortCount, mediumCount, longCount);
    }

    public static void main(String[] args) {
        String review = "This movie was absolutely fantastic and thrilling";
        classifyWordLengths(review);
    }
}
    
