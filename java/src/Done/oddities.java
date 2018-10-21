package Done;

import java.io.*;

public class oddities {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrInputs = Integer.parseInt(in.readLine());

        for (int i = 0; i < nrInputs; i++) {
            int number = Integer.parseInt(in.readLine());
            out.write(number + (number % 2 == 0 ? " is even" : " is odd")  + "\n");
        }

        out.close();
    }

}
