public class DailyTask2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 9};
        int n = arr.length;

        Boolean findDupArray = findDuplicateArray(arr, n);
        System.out.println(findDupArray);

        int[] arr1 = {1, 4, 8, 4, 9, 10, 4};
        int lengthArray = arr1.length;

        int[] returnArrayElement = removeElementFromArray(arr1, lengthArray, 4);
        for(int i = 0; i < returnArrayElement.length; i++) {
            System.out.println(returnArrayElement[i]);
        }
        
    }

    public static boolean findDuplicateArray(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] removeElementFromArray(int[] arr1, int lengthArray, int number) {
        int count = 0;
        for(int i = 0; i < lengthArray; i++) {
            if(arr1[i] == number) {
                count++;
            }
        }
        int[] newArray = new int[lengthArray - count];
        int j = 0;
        for(int i = 0; i < lengthArray; i++) {
            if(arr1[i]!=number) {
                if(j <= newArray.length) {
                    newArray[j] = arr1[i];
                    j++;
                }
                
            }
        }
        return newArray;
    }
}