import javax.swing.JOptionPane;

public class NikeShoesStore {
    public static void main(String[] args) {
        boolean wantsToShopAgain;
        
        do{ 
        String customerName = JOptionPane.showInputDialog("Welcome to our Nike Shoes Store! Please enter your name:");
        String message = "Hello, " + customerName + "!\n";
        boolean wantsToBuyShoes = true;
        double totalCost = 0.0;

        StringBuilder purchasedItems = new StringBuilder(); // To store the list of purchased items

        while (wantsToBuyShoes) {
            String[] shoeModels = {
                    "Nike Air Force 1",
                    "Nike Air Max 90",
                    "Nike Cortez",
                    "Nike Dunk",
                    "Nike Air Max",
                    "Nike Air Force 1'07",
                    "Nike Air Max 95",
                    "Nike Dunk Low",
                    "Nike Air Max 97",
                    "Nike Air Huarache",
                    "Nike Court Legacy",
                    "Nike Air Max 270"
            };

            String shoeChoice = (String) JOptionPane.showInputDialog(
                    null,
                    "Available Nike shoes:",
                    "Nike Shoes Store",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    shoeModels,
                    shoeModels[0]
            );

            if (shoeChoice != null) {
                double originalPrice = 0.0;

                if (shoeChoice.contains("Nike Air Force 1")) {
                    originalPrice = 3999.0;
                } else if (shoeChoice.contains("Nike Air Max 90")) {
                    originalPrice = 3000.0;
                } else if (shoeChoice.contains("Nike Cortez")) {
                    originalPrice = 4500.0;
                } else if (shoeChoice.contains("Nike Dunk")) {
                    originalPrice = 4900.0;
                } else if (shoeChoice.contains("Nike Air Max")) {
                    originalPrice = 5300.0;
                } else if (shoeChoice.contains("Nike Air Force 1'07")) {
                    originalPrice = 5399.0;
                } else if (shoeChoice.contains("Nike Air Max 95")) {
                    originalPrice = 4399.0;
                } else if (shoeChoice.contains("Nike Dunk Low")) {
                    originalPrice = 4500.0;
                } else if (shoeChoice.contains("Nike Air Max 97")) {
                    originalPrice = 5000.0;
                } else if (shoeChoice.contains("Nike Air Huarache")) {
                    originalPrice = 4800.0;
                } else if (shoeChoice.contains("Nike Court Legacy")) {
                    originalPrice = 5000.0;
                } else if (shoeChoice.contains("Nike Air Max 270")) {
                    originalPrice = 5500.0;
                }

                String sizeInput = JOptionPane.showInputDialog("Enter your shoe size (US size):");
                double shoeSize = Double.parseDouble(sizeInput);

                String quantityInput = JOptionPane.showInputDialog("How many pairs would you like to purchase?");
                int quantity = Integer.parseInt(quantityInput);

                double subtotal = originalPrice * quantity;
                totalCost += subtotal;

                if (shoeChoice != null) {
                    // Update the purchasedItems StringBuilder with the new purchase
                    purchasedItems.append(quantity).append(" pairs of ").append(shoeChoice)
                            .append(" (Size ").append(shoeSize).append(" US) - ₱").append(subtotal).append("\n");
                }

                String anotherShoe = JOptionPane.showInputDialog("Do you want to purchase another pair of shoes? (YES/NO)");
                wantsToBuyShoes = anotherShoe.equalsIgnoreCase("YES");
            } else {
                wantsToBuyShoes = false;
            }
        }

        // Display the list of purchased items
        JOptionPane.showMessageDialog(null, "You have purchased:\n" + purchasedItems.toString());

        // Display the total cost and ask for cash payment
        double discountedTotal = totalCost;
        if (totalCost >= 6 * 3200.0) {
            double discount = totalCost * 0.10;
            discountedTotal = totalCost - discount;
            JOptionPane.showMessageDialog(null, "Your total cost before discount: ₱" + totalCost + "\nYou are eligible for a 5% discount. Your new total cost is: ₱" + discountedTotal);
        } else {
            JOptionPane.showMessageDialog(null, "Your total cost: ₱" + totalCost);
        }

        // Ask for cash payment
        String cashInput = JOptionPane.showInputDialog("Please enter the cash amount for payment in PHP:");
        double cashAmount = Double.parseDouble(cashInput);

        // Process the payment and calculate change
        if (cashAmount >= discountedTotal) {
            double change = cashAmount - discountedTotal;
            JOptionPane.showMessageDialog(null, "Payment successful! Thank you for your purchase.\nChange: ₱" + change);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient cash. Please provide enough cash for the transaction.");
            
        }
        String shopAgain = JOptionPane.showInputDialog("Do you want to shop again? (YES/NO)");
            wantsToShopAgain = shopAgain != null && shopAgain.equalsIgnoreCase("YES");
        } while (wantsToShopAgain); 
        
        JOptionPane.showMessageDialog(null, "Thank you for visiting our Nike Shoes Store. Goodbye and God bless!", "Exit", JOptionPane.INFORMATION_MESSAGE);
    }
}