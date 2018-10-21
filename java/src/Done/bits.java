package Done;

import java.util.Scanner;

public class bits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrTestCases = scanner.nextInt();

        for (int i = 0; i < nrTestCases; i++) {
            long x = scanner.nextLong();
            int maxCounter = 0;
            int counter = 0;
            StringBuilder builder = new StringBuilder();
            String sX = String.valueOf(x);
            for (int j = 0; j < sX.length(); j++) {
                builder.append(sX.charAt(j));
                String bits = Long.toBinaryString(Long.parseLong(builder.toString()));

                for (char c : bits.toCharArray()) {
                    if (c == '1') ++counter;
                }

                if (counter > maxCounter) maxCounter = counter;
                counter = 0;
            }

            System.out.println(maxCounter);

        }
    }

}
