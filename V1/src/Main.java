
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Nice name, " + getName());

        Wait(4000);
        
        System.out.println("Welp, bye! (ig)");
    }

    static String getName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.next();
        
        scanner.close();
        return name;
    }

    static void Wait(long time) {
        time /= 5;
        try {
            Thread.sleep(time);
            for (int i = 0; i < 4; i++) {
                System.out.print(".");
                Thread.sleep(time);
            }
        }
        catch (Exception e) {  }
        System.out.println("");
    }
}