package Done;

import java.util.Scanner;

public class hidden {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s");
        char[] password = input[0].toCharArray();
        char[] hidden = input[1].toCharArray();

        int pwindex = 0;
        for (char aHidden : hidden) {
            if (aHidden == password[pwindex]) {
                ++pwindex;
                if (pwindex == password.length) break;
            } else {
                for (int j = pwindex + 1; j < password.length; j++) {
                    if (password[j] == aHidden) {
                        System.out.println("FAIL");
                        return;
                    }
                }
            }
        }

        if (pwindex == password.length) System.out.println("PASS");
        else System.out.println("FAIL");
    }

}
