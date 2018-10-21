package Done;

import java.io.*;

public class nastyhacks {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < nrCases; i++) {
            String[] inputs = in.readLine().split("\\s");
            int revenue = Integer.parseInt(inputs[0], 10);
            int revenueAd = Integer.parseInt(inputs[1], 10);
            int adCosts = Integer.parseInt(inputs[2], 10);

            int actualRevenue = revenueAd - adCosts;
            out.write( (actualRevenue > revenue ? "advertise" : actualRevenue == revenue ? "does not matter" : "do not advertise") + "\n");
        }

        out.close();
    }

}
