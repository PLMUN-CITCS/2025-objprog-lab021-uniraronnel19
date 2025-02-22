import java.util.Scanner;

public class WordCountProgram {

    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;
    }

    public static int countWords(String sentence) {

        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
   
        String sentence = getSentenceInput();

        int wordCount = countWords(sentence);

        System.out.println("The sentence has: " + wordCount + " words.");
    }
}

