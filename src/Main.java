import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("TASK 1");
        int[] numbers = new int[]{8, 3, 2, 6, 9};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        int max_val = numbers[0];
        int min = numbers[0];

        for(int i = 1; i < numbers.length; ++i) {
            if (numbers[i] > max_val) {
                max_val = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Difference between the largest and smallest values of the said array is: " + (max_val - min));
        System.out.println("TASK 2");
        int[] Array = new int[]{10, 6, -5, 3, 17, 7};
        int Array_size = Array.length;
        if (Array_size < 2) {
            System.out.println("Array size is less than two.");
        } else {
            int second_element = Integer.MAX_VALUE;
            int first_element = Integer.MAX_VALUE;

            for(int i = 0; i < Array_size; ++i) {
                if (Array[i] < first_element) {
                    second_element = first_element;
                    first_element = Array[i];
                } else if (Array[i] < second_element && Array[i] != first_element) {
                    second_element = Array[i];
                }
            }

            if (second_element == Integer.MAX_VALUE) {
                System.out.println("No second smallest element.");
            } else {
                System.out.println("The smallest element is " + first_element + " and the second smallest element is " + second_element + ".");
            }

            System.out.println("TASK 3");
            double x = 2.0;
            double y = 5.0;
            double xSquared = Math.pow(x, 2.0);
            double expressionSquared = Math.pow(4.0 * y / 5.0 - x, 2.0);
            double result = xSquared + expressionSquared;
            System.out.println("The result of the expression is: " + result);
        }
    }
}
