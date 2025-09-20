import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();
        // Bonus
        System.out.print("Enter tip percentage (default is 15): ");
        String input = scanner.nextLine(); 
        input = scanner.nextLine();        
        double tipPercentage;
        if (input.isEmpty()) {
            tipPercentage = 15.0; 
        } else {
            tipPercentage = Double.parseDouble(input);
        }
        double tipAmount = billAmount * (tipPercentage / 100);
        double totalAmount = billAmount + tipAmount;
        System.out.println("Tip (" + tipPercentage + "%): " + tipAmount);
        System.out.println("Total Amount: " + totalAmount);
        scanner.close();
    }
}
