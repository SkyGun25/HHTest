package HHTest;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        InputStream is = System.in;
        PrintStream os = System.out;


        Scanner scanner = new Scanner(is);
        boolean isRun = true;
        while (isRun) {
            try {
                switch (scanner.next()) {
                    case "1":
                        Long n = Long.valueOf(scanner.next());
                       os.println(Factorial.calculate(n));
                        break;
                    case "2":
                        String file = scanner.next();
                        String word = scanner.next();
                        os.println(SearchOccurencesNumber.search(file, word));
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    default:
                        isRun = false;
                }
            } catch (Exception e) {
                e.printStackTrace(os);
            }
        }
    }
}
