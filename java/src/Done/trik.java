package Done;

import java.io.*;

public class trik {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = in.readLine().toCharArray();

        int current = 1;
        for (char c : input) {
            switch (c) {
                case 'A':
                    if (current == 1 || current == 2) {
                        current = current == 2 ? 1 : 2;
                    }
                    break;
                case 'B':
                    if (current == 2 || current == 3) {
                        current = current == 2 ? 3 : 2;
                    }
                    break;
                case 'C':
                    if (current == 1 || current == 3) {
                        current = current == 3 ? 1 : 3;
                    }
                    break;
            }
        }

        out.write(String.valueOf(current));

        out.close();
    }

}
