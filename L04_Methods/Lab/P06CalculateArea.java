package L04_Methods.Lab;

import java.util.Scanner;

public class P06CalculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateArea(width,length));

    }

    public static int calculateArea (int width, int length){

        return width * length;
    }
}
