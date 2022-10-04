public class TowerOfHanoi {
    //  insert discs from tower1 to tower2 using tower3
    public static void towerOfHanoi(int n , int t1 , int t2 , int t3){
//  assuming that our function knows how to insert n - 1 discs from source tower to destination using helper tower
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1 , t1 , t3 , t2);
        System.out.println(n + "[" + t1 + "->" + t2 + "]");
        towerOfHanoi(n-1 , t3 , t2 , t1);
    }
}
