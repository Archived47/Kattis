package Done;

import java.io.*;
import java.util.Scanner;

public class skener {

    public static void main(String[] args) throws IOException {
        Scanner intInput = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = in.readLine().split("\\s");
        int rows = Integer.parseInt(parts[0]);
        int columns = Integer.parseInt(parts[1]);
        int zRows = Integer.parseInt(parts[2]);
        int zColumns = Integer.parseInt(parts[3]);

        char[][] input = new char[rows][];

        for (int i = 0; i < input.length; i++) {
            input[i] = in.readLine().toCharArray();
        }

        for (int i = 0; i < rows * zRows; i++) {
            for (int j = 0; j < columns * zColumns; j++) {
                out.write(input[i / zRows][j / zColumns]);
            }
            out.newLine();
        }

        out.close();
        intInput.close();
    }

}
