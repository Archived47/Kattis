package Done;

import java.io.*;

public class r2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = in.readLine().split("\\s");
        int r1 = Integer.parseInt(parts[0]);
        int s = Integer.parseInt(parts[1]);

        int r2 = s * 2 - r1;
        out.write(String.valueOf(r2));
        out.close();
    }

}
