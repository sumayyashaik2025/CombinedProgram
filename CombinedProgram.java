import java.util.Scanner;

public class CombinedProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Convert input to lowercase for consistent processing
        String lowerInput = input.toLowerCase();

        // Count vowels and consonants
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < lowerInput.length(); i++) {
            char ch = lowerInput.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        // Count words
        String trimmedInput = input.trim();
        int wordCount = 0;
        if (!trimmedInput.isEmpty()) {
            String[] wordsForCount = trimmedInput.split("\\s+");
            wordCount = wordsForCount.length;
        }

        // Reverse each word
        String[] words = input.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Sentence with each word reversed: " + reversedSentence.toString().trim());

        scanner.close();
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
