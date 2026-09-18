package src.main.java.assignment_problems;

public class Week1_Assignment1 {

    
    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) continue;

            
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        int[] seats1 = {101, 102, 103, 102, 105};
        checkDuplicateSeats(seats1);

        System.out.println("\n--- Test Case 2 ---");
        int[] seats2 = {101, 102, 103, 104, 105};
        checkDuplicateSeats(seats2);
    }
}