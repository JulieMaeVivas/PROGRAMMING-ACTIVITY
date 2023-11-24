import java.util.Scanner;

public class MathProblemSolver {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Choose a math topic:");
                System.out.println("1. Trigonometry");
                System.out.println("2. Solid Mensuration");
                System.out.println("3. Geometry");
                System.out.println("4. Solving Equation One Unknown");
                System.out.println("5. Simply Square Roots");
                System.out.println("6. Exit");
                
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character
                
                switch (choice) {
                    case 1:
                        solveTrigonometryProblem();
                        break;
                    case 2:
                        solveSolidMensurationProblem();
                        break;
                    case 3:
                        solveGeometryProblem();
                        break;
                    case 4:
                        solveEquationOneUnknownProblem();
                        break;
                    case 5:
                        solveSquareRootsProblem();
                        break;
                    case 6:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
                
                System.out.println("Do you want to continue? (yes/no)");
                String continueChoice = scanner.nextLine().toLowerCase();
                
                if (!continueChoice.equals("yes")) {
                    System.out.println("Goodbye!");
                    break;
                }
            }
        }
    }

    private static void solveTrigonometryProblem() {
        System.out.println("Trigonometry Problem:");
        System.out.println("Question: What is the sine of 30 degrees?");
        System.out.println("Answer: 0.5");
    }

    private static void solveSolidMensurationProblem() {
        System.out.println("Solid Mensuration Problem:");
        System.out.println("Question: What is the volume of a cube with side length 3?");
        System.out.println("Answer: 27 cubic units");
    }

    private static void solveGeometryProblem() {
        System.out.println("Geometry Problem:");
        System.out.println("Question: What is the area of a rectangle with length 5 and width 8?");
        System.out.println("Answer: 40 square units");
    }

    private static void solveEquationOneUnknownProblem() {
        System.out.println("Solving Equation One Unknown Problem:");
        System.out.println("Question: Solve for x: 2x + 5 = 11");
        System.out.println("Answer: x = 3");
    }

    private static void solveSquareRootsProblem() {
        System.out.println("Simply Square Roots Problem:");
        System.out.println("Question: What is the square root of 16?");
        System.out.println("Answer: 4");
    }
}
