package Done;

import java.io.*;

public class twostones {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int stones = Integer.parseInt(in.readLine());

        out.write(stones % 2 == 0 ? "Bob" : "Alice");

        out.close();
    }

}
