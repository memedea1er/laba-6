import java.util.*;
public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String a = in.nextLine();
        System.out.println("Введите цифру, которую нужно удалить");
        String b = in.nextLine();
        System.out.println(a.replace(b,""));
    }
}