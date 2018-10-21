package Done;

import java.io.*;

public class cold {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrTemps = Integer.parseInt(in.readLine());
        String[] temps = in.readLine().split("\\s");

        if (temps.length != nrTemps) return;

        int counter = 0;
        for (String s : temps) {
            counter = Integer.parseInt(s) < 0 ? counter + 1 : counter;
        }

        out.write(String.valueOf(counter));
        out.close();
    }

}
