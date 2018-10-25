package Done;

import java.io.*;
import java.util.Scanner;

public class speedlimit {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrSpeed;

        while ((nrSpeed = in.nextInt()) != -1) {
            int totalHours = 0;
            int totalMiles = 0;
            for (int i = 0; i < nrSpeed; i++) {
                int speed = in.nextInt();
                int hours = in.nextInt();
                final int currentHours = hours - totalHours;
                totalMiles += speed * currentHours;
                totalHours += currentHours;
            }
            out.write(totalMiles + " miles\n");
        }


        out.close();
    }

}
