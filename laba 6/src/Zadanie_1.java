import java.util.*;
import static java.lang.Math.*;
public class Zadanie_1 {
    public static long factorio(int x) {
        long r=1;
        while (x>0) {
            r*=x;
            x--;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=1;
        double s=0;
        System.out.println("Введите M");
        double m = in.nextDouble();
        System.out.println("Введите N");
        double n = in.nextDouble();
        System.out.println("Введите x");
        double x = in.nextDouble();
        for (i=1; i<=n; i++) {
            if(pow(cos(pow(x,2*i-1)/factorio(2*i-1)),i)<m) {
                s+=pow(cos(pow(x,2*i-1)/factorio(2*i-1)),i);
            }
        }
        System.out.println(s);
    }
}