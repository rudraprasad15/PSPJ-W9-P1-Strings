import java.util.Scanner;

public class UniFlowStringLab {
    static String titleCaseOneWord(String text) {
        String clean = text.trim().toLowerCase();
        if (clean.isEmpty()) {
            return "UNKNOWN";
        }
        return clean.substring(0, 1).toUpperCase() + clean.substring(1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student ID: ");
        String studentId = input.nextLine().trim().toUpperCase();
        System.out.print("Student first name: ");
