import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
    int x, y, temp;
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    temp = x;
    x = y;
    y = temp; 
    System.out.println(x);
    System.out.println(y);
    }
}
