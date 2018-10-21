package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class busnumbers2 {

    private static class Sum {
        int one;
        int two;

        Sum(double one, double two) {
            this.one = (int) one;
            this.two = (int) two;
        }

        int getSum() {
            return one + two;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Sum) {
                return (this.one == ((Sum) obj).one && this.two == ((Sum) obj).two) || (this.two == ((Sum) obj).one && this.one == ((Sum) obj).two);
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return "[" + one + ", " + two + ", " + getSum() + "]";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int bound = Integer.parseInt(reader.readLine());

        int busNumber = getBusNumber(bound);
        System.out.println(busNumber == 0 ? "none" : busNumber);
    }

    private static int getBusNumber(int bound) {
        ArrayList<Sum> sums = new ArrayList<>();

        for (int i = 1; i < bound; i++) {
            for (int j = 2; j < bound; j++) {
                Sum sum = new Sum(Math.pow(i, 3), Math.pow(j, 3));
                if (sum.getSum() > bound || sum.getSum() < 0) break;
                if (!sums.contains(sum) && sum.one != sum.two) sums.add(sum);
            }
        }
        int max = 0;
        for (int i = 0; i < sums.size(); i++) {
            for (int j = i+1; j < sums.size(); j++) {
                if (sums.get(i).getSum() == sums.get(j).getSum() && sums.get(i).getSum() > max) max = sums.get(i).getSum();
            }
        }
        return max;
    }

}
