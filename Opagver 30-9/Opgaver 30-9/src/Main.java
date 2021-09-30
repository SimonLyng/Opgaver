import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);

        //test dine metoder ved at kalde dem her:

        String printLongestWord = printLongestWord(text);
        System.out.println("longest string"  + printLongestWord);

        //2
        printFirstHalfOfEachWord();

    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    //1
    private static String printLongestWord(String[] array) {
        int maxLength = 0;
        String printLongestWord = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                printLongestWord = s;
            }
        }

        return printLongestWord;
    }
    //2
    private static void printFirstHalfOfEachWord(){
        int lookThroughWords = 0;
        for(String s : text){
            if(s.length()>lookThroughWords){
                System.out.println("half the word : " + s.substring(0, s.length() /2));
                lookThroughWords++;
            }
        }

    }
    //3
    public static void printMostFrequentLetter() {
        char[] letters = new char[29];
        int[] letterAmount = new int[29];

        int i = 0;
        for (char c = 'A'; c <= 'Z'; ++c) {
            letters[i] = c;
            i++;
        }
        letters[26] = 'Æ';
        letters[27] = 'Ø';
        letters[28] = 'Å';

        for (String s : text) {
            for (char c : s.toUpperCase().toCharArray()) {
                for (int j = 0; j < letters.length; j++) {
                    if (c == letters[j]) {
                        letterAmount[j]++;
                        break;
                    }
                }
                int numberIndex = 0;
                for (int j = 0; j < letterAmount.length; j++) {
                    if (letterAmount[j] > letterAmount[numberIndex]) {
                        numberIndex = j;
                    }
                }
                System.out.println(letters[numberIndex] + " : " + letterAmount[numberIndex]);
            }
        }
        //4
    }
    public static void printLessFrequentLetter() {
        char[] letters = new char[29];
        int[] letterAmount = new int[29];

        int i = 0;
        for (char c = 'A'; c <= 'Z'; ++c) {
            letters[i] = c;
            i++;
        }
        letters[26] = 'Æ';
        letters[27] = 'Ø';
        letters[28] = 'Å';

        for (String s : text) {
            for (char c : s.toUpperCase().toCharArray()) {
                for (int j = 0; j < letters.length; j++) {
                    if (c == letters[j]) {
                        letterAmount[j]++;
                        break;
                    }
                }
                int numberIndex = 0;
                for (int j = 0; j > letterAmount.length; j++) {
                    if (letterAmount[j] < letterAmount[numberIndex]) {
                        numberIndex = j;
                    }
                }
                System.out.println(letters[numberIndex] + " : " + letterAmount[numberIndex]);
            }
        }
    }
}