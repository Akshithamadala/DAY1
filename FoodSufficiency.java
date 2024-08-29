public class FoodSufficiency {
    // Function to determine the minimum number of houses required to meet food needs
    public static int minHouses(int r, int unit, int[] arr) {
        if (arr == null) return -1; // Check for null array
        
        int totalFoodNeeded = r * unit; // Total food required
        int currentFoodSum = 0; // Accumulated food from houses

        // Iterate through the array and accumulate food
        for (int i = 0; i < arr.length; i++) {
            currentFoodSum += arr[i];
            if (currentFoodSum >= totalFoodNeeded) {
                return i + 1; // Return the number of houses used (1-based index)
            }
        }

        return 0; // Return 0 if not enough food is found
    }

    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};
        System.out.println("Output: " + minHouses(r, unit, arr)); // Expected output: 4
    }
}
