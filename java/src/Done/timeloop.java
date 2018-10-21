package Done;

import java.io.*;

public class timeloop {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int times = Integer.parseInt(in.readLine());

        for (int i = 1; i <= times; i++) {
            out.write(i + " Abracadabra\n");
        }

        out.flush();
        out.close();
    }

}
