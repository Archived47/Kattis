package Done;

import java.io.*;

public class autori {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = in.readLine().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i > 0) {
                if (chars[i - 1] == '-') out.write(chars[i]);
            } else {
                out.write(chars[i]);
            }
        }

        out.close();
    }

}
