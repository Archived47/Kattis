package Done;

import java.io.*;
import java.util.ArrayList;

public class apaxiaaans {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = in.readLine();
        ArrayList<Character> x = new ArrayList<>();
        for (char c : name.toCharArray()) {
            x.add(c);
        }

        for (int i = 0; i < x.size() - 1; i++) {
            if (x.get(i) == x.get(i+1)) {
                x.remove(i+1);
                i--;
            }
        }

        StringBuilder output = new StringBuilder();
        for (char c : x) {
            output.append(c);
        }

        out.write(output.toString());
        out.close();
    }

}
