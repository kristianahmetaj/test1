import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of words: ");
        int index = scanner.nextInt();
        String[] words = new String[index];
        System.out.println("Enter words:");
        Scanner scan1 = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            words[i] = scan1.nextLine().toLowerCase();
        }
        //krahaso shumat ne ascci

        for (int i = 0; i < words.length; i++) {
            System.out.println(sumAscii(words));
        }
    }

    private static int[] sumAscii(String words[]) {
        int sumArray[] = new int[words.length];
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                sum += words[i].charAt(j);
            }
            sumArray[i] = sum;
        }
        return sumArray;
    }
}