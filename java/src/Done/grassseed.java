package Done;

import java.io.*;

public class grassseed {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        double cost = Double.parseDouble(in.readLine());
        int nrLawns = Integer.parseInt(in.readLine());

        double totalCost = 0;
        for (int i = 0; i < nrLawns; i++) {
            String[] parts = in.readLine().split("\\s");
            totalCost += Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]) * cost;
        }

        out.write(String.valueOf(totalCost));
        out.close();
    }

}
