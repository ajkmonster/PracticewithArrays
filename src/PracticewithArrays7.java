public class PracticewithArrays7 {
    public static void main(String[] args){
        String[] arr = {"w","t","y","h","k"};
        int x;
        for (x=0;x<=4;x++){
            if (arr[x].equalsIgnoreCase("t")) {
                String replace;
                replace = arr[x].replaceAll("t","hello");
                System.out.println(replace);
            } else {
                System.out.println(arr[x]);
            }
        }
    }
}
