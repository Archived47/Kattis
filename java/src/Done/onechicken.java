package Done;

import java.io.*;

public class onechicken {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int people = Integer.parseInt(inputs[0]);
        int chicken = Integer.parseInt(inputs[1]);

        if (people > chicken) out.write("Dr. Chaz needs " + (people - chicken) + " more piece" + (people - chicken != 1 ? "s" : "") + " of chicken!");
        if (people < chicken) out.write("Dr. Chaz will have " + (chicken - people) + " piece" + (chicken - people != 1 ? "s" : "") + " of chicken left over!");

        out.close();
    }

}
