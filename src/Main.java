import java.util.*;
public class Main {
    public static void main(String [] args){
        TowerOfHanoi abc = new TowerOfHanoi();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1 = scn.nextInt();
        int t2 = scn.nextInt();
        int t3 = scn.nextInt();
        abc.towerOfHanoi(n , t1 , t2 , t3);

    }
}
