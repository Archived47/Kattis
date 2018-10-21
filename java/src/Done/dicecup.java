package Done;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class dicecup {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = in.readLine().split("\\s");
        int dieOne = Integer.parseInt(input[0]);
        int dieTwo = Integer.parseInt(input[1]);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= dieOne; i++) {
            for (int j = 1; j <= dieTwo; j++) {
                numbers.add(i+j);
            }
        }

        int max = 0;
        numbers.sort(Integer::compareTo);
        for (int i = 2; i <= dieOne + dieTwo; i++) {
            int frequency = Collections.frequency(numbers, i);
            if (max < frequency) max = frequency;
        }

        ArrayList<Integer> outcomes = new ArrayList<>();
        for (int i = 2; i <= dieOne + dieTwo; i++) {
            if (Collections.frequency(numbers, i) == max) outcomes.add(i);
        }

        outcomes.forEach(n -> {
            try {
                out.write(n + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        out.close();
    }

}
