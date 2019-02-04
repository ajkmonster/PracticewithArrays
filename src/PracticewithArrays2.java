import java.util.Scanner;

public class PracticewithArrays2 {
    public static void main(String[] args){
        int x, sum = 0;
        int[] arr = new int[10];
        System.out.println("Please enter in 10 numbers: ");
        Scanner key = new Scanner(System.in);
        for (x=0; x<=9; x++){
            arr[x] = key.nextInt();
        }
        for (x=0; x<=9; x++) {
            sum=sum+arr[x];
            System.out.println("Your sum is "+sum);
        }
    }
}

