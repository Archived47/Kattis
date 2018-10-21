package Done;

import java.io.*;

public class hissingmicrophone {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();

        out.write(input.contains("ss") ? "hiss" : "no hiss");
        out.close();
    }

}
