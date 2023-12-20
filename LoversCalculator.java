import javax.swing.JOptionPane;

public class LoversCalculator {

    public static void main(String[] args) {
        do {
            // Get names of lovers
            String lover1 = JOptionPane.showInputDialog("Enter the name of the first person:");
            String lover2 = JOptionPane.showInputDialog("Enter the name of the second person:");

            // Calculate love score
            int loveScore = calculateLoveScore(lover1, lover2);

            // Display result
            String resultMessage = getResultMessage(lover1, lover2, loveScore);
            JOptionPane.showMessageDialog(null, resultMessage);

            // Ask if they want to try again
            int option = JOptionPane.showConfirmDialog(null, "Do you want to calculate again?", "Lovers Calculator", JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION) {
                break;
            }
        } while (true);
    }

    private static int calculateLoveScore(String lover1, String lover2) {
        // Simple algorithm for calculating a "love score"
        // You can modify this algorithm based on your own criteria
        int commonLetters = countCommonLetters(lover1, lover2);
        return commonLetters * 10;
    }

    private static int countCommonLetters(String str1, String str2) {
        // Count the number of common letters in two strings
        int count = 0;
        for (char c : str1.toLowerCase().toCharArray()) {
            if (str2.toLowerCase().contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }

    private static String getResultMessage(String lover1, String lover2, int loveScore) {
        // Generate a message based on the love score
        String message = "Love Score for " + lover1 + " and " + lover2 + ": " + loveScore + "%\n";
        if (loveScore >= 80) {
            message += "Wow! You are made for each other!";
        } else if (loveScore >= 50) {
            message += "Not bad! There's potential for love.";
        } else {
            message += "Hmm, the love score is a bit low. Keep trying!";
        }
        return message;
    }
}
