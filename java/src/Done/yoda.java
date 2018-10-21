package Done;

import java.io.*;
import java.util.Arrays;

public class yoda {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input1 = in.readLine().toCharArray();
        char[] input2 = in.readLine().toCharArray();

        int[] number1 = new int[input1.length];
        int[] number2 = new int[input2.length];

        int oneLength = number1.length;
        int twoLength = number2.length;

        int max = Math.max(oneLength, twoLength);
        int diff = Math.max(oneLength, twoLength) - Math.min(oneLength, twoLength);

        for (int i = 0; i < max; i++) {
            if (i < oneLength) number1[i] = Character.digit(input1[i], 10);
            if (i < twoLength) number2[i] = Character.digit(input2[i], 10);
        }

        for (int i = max - 1; i >= diff; i--) {
            if (oneLength == twoLength) {
                if (number1[i] < number2[i]) number1[i] = -1;
                if (number1[i] > number2[i]) number2[i] = -1;
            } else if (oneLength > twoLength) {
                if (number1[i] < number2[i-diff]) number1[i] = -1;
                if (number1[i] > number2[i-diff]) number2[i-diff] = -1;
            } else {
                if (number1[i - diff] < number2[i]) number1[i-diff] = -1;
                if (number1[i - diff] > number2[i]) number2[i] = -1;
            }
        }

        String nrString1 = Arrays.toString(number1).replaceAll("[\\[\\]\\s,]", "").replaceAll("-1", "");
        String nrString2 = Arrays.toString(number2).replaceAll("[\\[\\]\\s,]", "").replaceAll("-1", "");
        int nr1 = nrString1.isEmpty() ? -1 : Integer.parseInt(nrString1);
        int nr2 = nrString2.isEmpty() ? -1 : Integer.parseInt(nrString2);
        nrString1 = nr1 == -1 ? "YODA" : String.valueOf(nr1);
        nrString2 = nr2 == -1 ? "YODA" : String.valueOf(nr2);

        out.write(nrString1 + "\n");
        out.write(nrString2 + "\n");
        out.flush();

        out.close();
    }

}
