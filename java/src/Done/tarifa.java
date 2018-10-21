package Done;

import java.io.*;

public class tarifa {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int monthly = Integer.parseInt(in.readLine());
        int data = monthly;
        int months = Integer.parseInt(in.readLine());

        for (int i = 0; i < months; i++) {
            data += monthly;
            data -= Integer.parseInt(in.readLine());
        }

        out.write(String.valueOf(data));

        out.close();
    }

}
