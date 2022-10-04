public class IncreasingDecreasing {
    public static void increasingdecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        increasingdecreasing(n-1);
        System.out.println(n);
    }
}
