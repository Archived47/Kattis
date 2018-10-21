package Done;

import java.io.*;

public class pet {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] inputs = new int[5][4];

        for (int i = 0; i < inputs.length; i++) {
            char[] input = in.readLine().replaceAll("\\s", "").toCharArray();
            int[] array = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                array[j] = Character.digit(input[j], 10);
            }
            inputs[i] = array;
        }

        int[] sums = new int[inputs.length];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = getSum(inputs[i]);
        }

        int winner = 0;
        for (int i = 0; i < sums.length; i++) {
            winner = sums[i] > sums[winner] ? i : winner;
        }

        out.write(winner + 1 + " " + sums[winner]);
        out.close();
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}
