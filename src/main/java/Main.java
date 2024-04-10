import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiary kwadratu: ");
        int width = scanner.nextInt();
        for (int i = 0; i < width; i++) 
          {
            for (int j = 0; j < width; j++) 
            {
              if (i == 0 || i == width - 1 || j == 0 || j == width - 1)
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}