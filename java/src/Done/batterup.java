package Done;

import java.util.Scanner;

public class batterup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOutcomes = scanner.nextInt();
        scanner.nextLine();
        int score = 0;
        int divisions = 0;
        for (int i = 0; i < nrOutcomes; i++) {
            int input = scanner.nextInt();
            if (input >= 0) {
                score += input;
                divisions++;
            }
        }

        System.out.println((double)score / divisions);

        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrOutcomes = Integer.parseInt(in.readLine());
        ArrayList<Integer> outcomes = new ArrayList<>();

        // Is slower than a for loop that does the same
        String[] inputs = in.readLine().split("\\s");
        Arrays.stream(inputs)
                .mapToInt(Integer::parseInt)
                .filter(i -> i >= 0)
                .forEach(outcomes::add);

        double score = outcomes.stream().mapToDouble(i -> i).sum() / outcomes.size();

        out.write(String.valueOf(score));
        out.close();
        */
    }

}
