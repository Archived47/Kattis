package Fails;// TODO Find out how to make mAgree dynamic, instead of the standard 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lockedtreasure {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nrTestCases = Integer.parseInt(reader.readLine());
        for (int i = 0; i < nrTestCases; i++) {
            String[] inputs = reader.readLine().split("\\s");
            int nBandits = Integer.parseInt(inputs[0]);
            int mAgree = Integer.parseInt(inputs[1]);

            ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
            for (int j = 0; j < nBandits; j++) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(j);
                for (int k = j+1; k < nBandits; k++) {
                    Integer x = k;
                    numbers.add(x);
                    arrayLists.add((ArrayList<Integer>) numbers.clone());
                    numbers.remove(x);
                }
            }

            System.out.println(arrayLists);
            System.out.println(arrayLists.size());
        }
    }

}
