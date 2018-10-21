package Done;

import java.io.*;

public class quadrant {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(in.readLine());
        int y = Integer.parseInt(in.readLine());

        if (x > 0 && y > 0) out.write("1");
        if (x < 0 && y > 0) out.write("2");
        if (x < 0 && y < 0) out.write("3");
        if (x > 0 && y < 0) out.write("4");

        out.close();
    }

}
