package Done;

import java.io.*;
import java.util.Scanner;

public class zanzibar {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrTestCases = in.nextInt();

        for (int i = 0; i < nrTestCases; i++) {
            int current;
            int last = 1;
            int imported = 0;
            while((current = in.nextInt()) != 0) {
                if (current > last * 2) {
                    imported += current - (last * 2);
                }
                last = current;
            }
            out.write(imported + "\n");
        }

        out.close();
    }

}
