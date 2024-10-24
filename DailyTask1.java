public class DailyTask1 {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 15 };
        int sumArray = sumOfArray(arr);
        System.out.println("Sum of Array is " + sumArray);

        int[] arr1 = { 12, 3, 4, 15, 1 };
        countOfOddAndEven(arr1);

        String str = "welcome";
        firstOccuranceString(str);
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void countOfOddAndEven(int[] arr1) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total Even number in Array " + evenCount++);
        System.out.println("Total Odd number in Array " + oddCount++);
    }

    public static void firstOccuranceString(String str) {
        char targetChar = 'l';
        char[] stringArray = str.toCharArray();
        for (int i = 0; i <= stringArray.length; i++) {
            if (targetChar == stringArray[i]) {
                System.out.println("The first occurrence of '" + targetChar + "' is at index: " + i);
                return;
            }
        }
        System.out.println("Target Char is not found in the string.");
    }
}
