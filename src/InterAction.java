import java.util.Scanner;

import static java.lang.System.out;

public class InterAction {
    static Scanner scanner = new Scanner(System.in);

    public static void print(String message) {
        out.println(message);
    }

    public static int getNumberValue(String message) {
        print("Enter " + message);
        return scanner.nextInt();
    }

    //    to check value
    public static boolean checkYesOrNo() {
        String answer = scanner.next();
        switch (answer.toLowerCase()) {
            case "yes", "y":
                return true;
            case "no", "n":
                return false;
            default:
                toEnterValidValue();
        }
        return false;
    }

    //to enter valid value
    private static void toEnterValidValue() {
        print("Enter valid value");
        checkYesOrNo();

    }

    // to ask name
    public static void getPlayerNames() {
        System.out.println("yes");
        ForName.getNames();
    }

    // to rewrite name
    public static void updateScoreAndPlayerCount() {
        System.out.println("no");
        ScoreAndPlayerCount.getScoreAndPlayerCount();
    }


}
