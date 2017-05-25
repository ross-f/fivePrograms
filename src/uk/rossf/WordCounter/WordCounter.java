package uk.rossf.WordCounter;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/** * Spec - Program 3
 * Design and implement a program that will take text from an ASCII text file and count the number of words in the file.
 *  Secondly the program should sort the words into alphabetical order,
 * remove any duplicates and save the result to a file.
 *
 * import file
 *
 * split file by words into array
 *
 * count size of array
 *
 * sort array
 *
 * remove duplicates from array
 *
 * loop through array to write each word
 */
public class WordCounter {
    Scanner scanner;

    WordCounter(String filename) {
        File file = new File(filename);

        List<String> wordsInFile = new ArrayList<>();

        try {
            scanner = new Scanner(new FileInputStream(file));

            while (scanner.hasNext()) {
                wordsInFile.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.err.format("File note found %s", filename);

            System.exit(1);
        }

        // count all the words
        int noOfWordsInFile = wordsInFile.size();

        System.out.printf("Number of words in file %d \n", noOfWordsInFile);

        // alphabetise
        Collections.sort(wordsInFile);

        // remove any duplicates
        wordsInFile = wordsInFile.stream().distinct().collect(Collectors.toList());

        int noOfDuplicates = noOfWordsInFile - wordsInFile.size();

        System.out.printf("%d duplicate(s) removed \n", noOfDuplicates);

        try {
            FileWriter writer = new FileWriter(filename);

            // write each word back to the file
            for (String word : wordsInFile) {
                writer.write(word + '\n');
            }

            writer.close();
        } catch (IOException e) {
            System.err.format("Can't write to file", filename);

            System.exit(1);
        }

        System.out.println("File has been alphabetised");
    }

    public static void main(String[] args) {
        new WordCounter("test-file.txt");
    }
}
