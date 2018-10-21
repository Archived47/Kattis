package Done;

import java.io.*;

public class ladder {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        double height = Double.parseDouble(inputs[0]);
        double degree = Double.parseDouble(inputs[1]);

        // radians = degree -> radian
        // height / sin(radians)
        out.write(String.valueOf((int)(Math.ceil(height / Math.sin(Math.toRadians(degree))))));

        out.close();
    }

}
