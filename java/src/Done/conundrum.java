package Done;

import java.io.*;

public class conundrum {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = in.readLine().toCharArray();
        int days = 0;

        for (int i = input.length - 1; i >= 0; i--) {
            if (i + 1 >= input.length) {
                if (input[i] != 'R') {
                    input[i] = 'R';
                    days++;
                }
            } else {
                switch (input[i + 1]) {
                    case 'P':
                        if (input[i] != 'R') {
                            input[i] = 'R';
                            days++;
                        }
                        break;
                    case 'E':
                        if (input[i] != 'P') {
                            input[i] = 'P';
                            days++;
                        }
                        break;
                    case 'R':
                        if (input[i] != 'E') {
                            input[i] = 'E';
                            days++;
                        }
                        break;
                }
            }
        }

        out.write(String.valueOf(days));
        out.close();
    }

}
