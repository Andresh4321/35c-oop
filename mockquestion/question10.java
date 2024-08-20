package mockquestion;
import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        // question 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();      
        int numVowels = countVowels(sentence);
        System.out.println("Number of vowels: " + numVowels);
        int numConsonants = countConsonants(sentence);
        System.out.println("Number of consonants: " + numConsonants);
        scanner.close(); }
    public static int countVowels(String s) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            } }
        return count;
    }
    public static int countConsonants(String s) {
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (consonants.indexOf(c) != -1) {
                count++;
            }}
        return count;
    }}
