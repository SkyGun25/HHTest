package HHTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SearchOccurencesNumber {

    public static int search(String fileName, String word) throws IOException {
        if (word == null || word.isEmpty()) {
            return 0;
        }

        String content = new String(Files.readAllBytes(Paths.get(fileName)), "UTF-8");
        StringBuilder sb = new StringBuilder(content);

        int index = sb.lastIndexOf(word);
        int counter = 0;

        while (index > -1) {
            counter++;

            sb.delete(index, index + word.length());
            index = sb.lastIndexOf(word);
        }

        return counter;
    }
}
