import java.util.ArrayList;

public class addOneToNumber {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> digits)
    {
        // Write your code here.
        int n = digits.size();
        int carry = 1; // Initialize the carry to 1 because we want to increment by 1
        
        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits.get(i) + carry;
            digits.set(i, sum % 10); // Update the current digit
            carry = sum / 10; // Update the carry
            
            // If there is no carry left, we can stop the traversal
            if (carry == 0) {
                break;
            }
        }
        
        // If there is still a carry left after traversing all digits,
        // we need to append a new digit to the array
        if (carry > 0) {
            digits.add(0, carry);
        }
        // Remove leading zeros if present   03->3  000001->1
        int i = 0;
        while (i < digits.size() && digits.get(i) == 0) {
            digits.remove(i);
        }
        
        // If the resulting list is empty, add a single digit 1
        if (digits.isEmpty()) {
            digits.add(1);
        }
        
        return digits;
    }
    public static void main(String[] args) {
        
        
    }
}
