package Done;

import java.io.*;

public class filip {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = in.readLine().split("\\s");
        StringBuilder builder = new StringBuilder();
        int x = Integer.parseInt(builder.append(input[0]).reverse().toString());
        builder = new StringBuilder();
        int y = Integer.parseInt(builder.append(input[1]).reverse().toString());

        out.write(String.valueOf(x < y ? y : x));
        out.close();
    }

}
