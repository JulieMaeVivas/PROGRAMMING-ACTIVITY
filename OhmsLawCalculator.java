import javax.swing.JOptionPane;

public class OhmsLawCalculator {

    public static void main(String[] args) {
        do {
            // Get user's choice for calculation
            String[] options = {"Voltage", "Current", "Resistance"};
            int calculationChoice = JOptionPane.showOptionDialog(
                    null,
                    "Choose the parameter to calculate:",
                    "Ohm's Law Calculator",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            // Get input values based on user's choice
            double voltage = 0.0;
            double current = 0.0;
            double resistance = 0.0;

            switch (calculationChoice) {
                case 0: // Calculate Voltage
                    current = Double.parseDouble(JOptionPane.showInputDialog("Enter current (I):"));
                    resistance = Double.parseDouble(JOptionPane.showInputDialog("Enter resistance (R):"));
                    voltage = calculateVoltage(current, resistance);
                    break;

                case 1: // Calculate Current
                    voltage = Double.parseDouble(JOptionPane.showInputDialog("Enter voltage (V):"));
                    resistance = Double.parseDouble(JOptionPane.showInputDialog("Enter resistance (R):"));
                    current = calculateCurrent(voltage, resistance);
                    break;

                case 2: // Calculate Resistance
                    voltage = Double.parseDouble(JOptionPane.showInputDialog("Enter voltage (V):"));
                    current = Double.parseDouble(JOptionPane.showInputDialog("Enter current (I):"));
                    resistance = calculateResistance(voltage, current);
                    break;

                default:
                    break;
            }

            // Display the result
            String resultMessage = getResultMessage(voltage, current, resistance, options[calculationChoice]);
            JOptionPane.showMessageDialog(null, resultMessage);

            // Ask if they want to try again
            int option = JOptionPane.showConfirmDialog(null, "Do you want to calculate again?", "Ohm's Law Calculator", JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION) {
                break;
            }
        } while (true);
    }

    private static double calculateVoltage(double current, double resistance) {
        return current * resistance;
    }

    private static double calculateCurrent(double voltage, double resistance) {
        return voltage / resistance;
    }

    private static double calculateResistance(double voltage, double current) {
        return voltage / current;
    }

    private static String getResultMessage(double voltage, double current, double resistance, String calculationType) {
        return String.format("%s Calculation Result:\nVoltage (V): %.2f\nCurrent (I): %.2f\nResistance (R): %.2f",
                calculationType, voltage, current, resistance);
    }
}
