import java.util.HashSet;
import java.util.Scanner;

class UniqueCharacter {
    public static void main(String[] args) {
        HashSet<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the String ");
        String userStr = sc.nextLine();
        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.println("Unique character is your String is :");
        for (Character ch : unique) {
            System.out.println(ch);
        }
    }

}
