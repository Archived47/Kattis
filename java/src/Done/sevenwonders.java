package Done;

import java.io.*;
public class sevenwonders {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = in.readLine().toCharArray();
        int[] amounts = new int[]{0,0,0};

        for (char c : input) {
            switch (c) {
                case 'T': amounts[0]++; break;
                case 'C': amounts[1]++; break;
                case 'G': amounts[2]++; break;
            }
        }

        int output = 0;
        int sets = Integer.MAX_VALUE;
        for (int i : amounts) {
            sets = sets > i ? i : sets;
            output += Math.pow(i, 2);
        }
        output += sets * 7;

        out.write(String.valueOf(output));
        out.close();
    }

}
