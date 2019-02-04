import java.util.Scanner;

public class PracticewithArrays4 {
    public static void main(String[] args){
        String[] arr = new String[3];
        int x;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter three names: ");
        for (x=0;x<=3; x++){
            arr[x]=key.next();
            System.out.println("One name you entered is " +arr[x]);
        }
    }
}
