package HHTest;



public class SearchOccurencesNumber {

    public static int search(String fileName, String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }

        StringBuffer buffer = new StringBuffer("qew asd zxc qwe gfh rtyj saatg qwe ggg jjqwejj");

        int index = buffer.lastIndexOf(word);
        int counter = 0;

        while (index > -1) {
            counter++;

            buffer.delete(index, index + word.length());
            index = buffer.lastIndexOf(word);
        }

        return counter;
    }
}
