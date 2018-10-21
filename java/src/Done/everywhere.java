package Done;

import java.io.*;
import java.util.ArrayList;

public class everywhere {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrTestCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < nrTestCases; i++) {
            ArrayList<String> cities = new ArrayList<>();
            int nrCities = Integer.parseInt(in.readLine());
            for (int j = 0; j < nrCities; j++) {
                String city = in.readLine();
                if (!cities.contains(city)) cities.add(city);
            }
            out.write(cities.size() + "\n");
        }

        out.close();
    }

}
