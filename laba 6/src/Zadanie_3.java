import static java.lang.Math.*;
public class Zadanie_3 {
    public static void main(String[] args) {
        double a=0,b=0,c=1;
        for (int i=1; i<=8; i++) {
            for (int j=1; j<=i; j++) {
                a+=pow(j+i,2)/cos(j+pow(i,2));
            }
            b+=a;
        }
        System.out.println(b);
        a=b=1;
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                a*=asin(pow(j,-i));
            }
            b*=a;
        }
        System.out.println(b);
        a=b=0;
        for (int i=1; i<=8; i++) {
            for (int j=i; j<=2*i-1; j++) {
                for (int k=i+j; k<=2*(i+j); k++) {
                    a+=k+4*(j+pow(i,k));
                }
                b+=a;
            }
            c*=b;
        }
        System.out.println(c);
    }
}
