import java.util.Scanner;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } 
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        
        
        int[] prices = new int[n];
        
        System.out.println("Enter the prices of the stock for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        
        
        Solution solution = new Solution();
        
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
        
        scanner.close();
    }
}
