import java.util.Scanner;

public class PracticewithArrays3 {
    public static void main(String[] args) {
        int x;
        double sum = 0;
        double[] arr = new double[10];
        double average;
        System.out.println("Please enter in 10 numbers: ");
        Scanner key = new Scanner(System.in);
        for (x = 0; x <= 9; x++) {
            arr[x] = key.nextDouble();
            sum = sum + arr[x];
            if (x == 9) {
                average = sum / arr.length;
                System.out.println("Your average is " + average);
            }

        }
    }
}
