package Done;

import java.io.*;

public class bela {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int nrHand = Integer.parseInt(inputs[0]);
        String suit = inputs[1];

        int score = 0;
        for (int i = 0; i < nrHand * 4; i++) {
            String[] card = in.readLine().split("");
            switch (card[0].charAt(0)) {
                case 'A': score += 11; break;
                case 'K': score += 4; break;
                case 'Q': score += 3; break;
                case 'J': score += card[1].equals(suit) ? 20 : 2; break;
                case 'T': score += 10; break;
                case '9': score += card[1].equals(suit) ? 14 : 0; break;
            }
        }

        out.write(String.valueOf(score));
        out.close();
    }

}
