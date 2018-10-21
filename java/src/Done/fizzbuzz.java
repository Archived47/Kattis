package Done;

import java.io.*;

public class fizzbuzz {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int n = Integer.parseInt(inputs[2]);

        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0) out.write("FizzBuzz\n");
            else if (i % x == 0) out.write("Fizz\n");
            else if (i % y == 0) out.write("Buzz\n");
            else out.write(i + "\n");
        }

        out.close();
    }

}
