import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        x += 8;
        x /= 3;
        x %= 5; 
        x *= 5;
        System.out.println(x);
        }
    }

