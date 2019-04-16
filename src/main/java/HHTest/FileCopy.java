package HHTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopy {

    public static void copyFile(String file, String copy, PrintStream os) throws IOException {
        long start = System.currentTimeMillis();
        Files.copy(Paths.get(file), Paths.get(copy));
        os.println(System.currentTimeMillis() - start);
    }
}
