package Done;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class stararrangements {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int stars = in.nextInt();
        out.write(stars + ":\n");

        for (int i = 2; i < stars; i++) {
            for (int j = i - 1; j <= i; j++) {
                if (hasCorrectStars(i, j, stars) && i + j <= stars) out.write(i + "," + j + "\n");
            }
        }

        out.close();
    }

    private static boolean hasCorrectStars(int x, int y, int stars) {
        boolean isX = true;
        int sum = 0;
        while((sum += isX ? x : y) <= stars) {
            if (sum == stars) return true;
            isX = !isX;
        }
        return false;
    }

}
