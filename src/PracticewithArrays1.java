public class PracticewithArrays1 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        int x=0;
        int sum =0;
        do {
            sum= sum + arr[x];
            x=x+1;
            System.out.println(sum );
        } while (x !=10);
    }
}
