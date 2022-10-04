public class Increasing {
    public static void increasing(int n){
        if(n == 0){
            return;
        }
       increasing(n-1);
        System.out.println(n);
    }
}


