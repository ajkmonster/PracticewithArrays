public class PracticewithArrays5 {
    public static void main(String[] args){
        int[] arr = {2,5,9,0,2,1,8,5,4};
        int x=0;
            do {
                if (arr[x] == 5){
                    System.out.println("You got " + arr[x] + "!");
            }
                x=x+1;
            } while (x != 9);
        }
    }
