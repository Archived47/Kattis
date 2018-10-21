package Done;

import java.io.*;

public class irepeatmyself {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrTestCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < nrTestCases; i++) {
            String input = in.readLine();
            int length = input.length();

            for (int j = 1; j < length + 1; j++) {
                if (input.equals(getString(input.substring(0, j), length / j + 1).substring(0, length))) {
                    out.write(j + "\n");
                    break;
                }
            }
        }
        out.close();
    }

    private static String getString(String s, int times) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(s);
        }
        return builder.toString();
    }

}
