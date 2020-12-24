import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] testArray = new int[arrayLength];
        arrayCreation(testArray);
        selectionSort(testArray);
        UniqueCount(testArray);

    }


    public static int[] arrayCreation(int[] array) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int arrayItem = scanner.nextInt();
            array[i] = arrayItem;
        }
        return array;
    }

    public static void UniqueCount(int[] array) {
        int counter = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                counter++;
            }
        }
        if(counter == 1){
            System.out.println("The is only one unique number!");
        }
        else if(counter > 1)
            System.out.println("There are " + counter + " unique numbers");

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minItem = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minItem) {
                    minItem = arr[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tempItem = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tempItem;
            }
        }
    }
}
