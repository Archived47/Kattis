package Done;

import java.io.*;
import java.util.Scanner;

public class reversebinary {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = in.nextInt();
        StringBuilder reverser = new StringBuilder();
        reverser.append(Integer.toBinaryString(input));
        reverser.reverse();

        out.write(String.valueOf(Integer.parseInt(reverser.toString(), 2)));
        out.close();
    }

}
