package Fails;//TODO fix this, should work, but it doesn't

import java.util.ArrayList;
import java.util.Scanner;

public class equalsumeasy_fail {

    public static class Sum implements Comparable<Sum> {

        ArrayList<Integer> numbers;

        Sum(ArrayList<Integer> numbers) {
            this.numbers = numbers;
        }

        private int getSum() {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            return sum;
        }

        public boolean numbersEquals(Sum sum) {
            if (sum.numbers.size() == this.numbers.size()) {
                for (int i = 0; i < sum.numbers.size(); i++) {
                    if (sum.numbers.get(i).equals(this.numbers.get(i))) return true;
                }
                return false;
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int n : numbers) builder.append(n).append(" ");
            return builder.toString().trim();
        }

        @Override
        public int compareTo(Sum o) {
            return getSum() - o.getSum();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cases; i++) {
            System.out.printf("Case #%d:%n", i+1);

            int nrNumbers = scanner.nextInt();
            int[] numbers = new int[nrNumbers];
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = scanner.nextInt();
            }

            ArrayList<Sum> sums = new ArrayList<>();
            ArrayList<Integer> currentNumbers = new ArrayList<>();

            for (int j = 0; j < numbers.length; j++) {
                currentNumbers.add(numbers[j]);
                ArrayList<Integer> sum = (ArrayList<Integer>) currentNumbers.clone();
                sums.add(new Sum(sum));
                for (int k = j+1; k < numbers.length; k++) {
//                    currentNumbers.add(numbers[k]);
//                    System.out.println(currentNumbers);
//                    ArrayList<Integer> sum = (ArrayList<Integer>) currentNumbers.clone();
//                    sums.add(new Sum(sum));
                    for (int l = k; l < numbers.length; l++) {
                        Integer integer = numbers[l];
                        currentNumbers.add(integer);
//                        System.out.println(currentNumbers);
                        sum = (ArrayList<Integer>) currentNumbers.clone();
                        sums.add(new Sum(sum));
                        currentNumbers.remove(integer);
                    }
                    currentNumbers.add(numbers[k]);
                }
                currentNumbers.clear();
            }

            System.out.println(sums);

            ArrayList<Sum> compares = new ArrayList<>();
            boolean found = false;

            for (int j = 0; j < sums.size(); j++) {
                compares.add(sums.get(j));
                for (int l = j+1; l < sums.size(); l++) {
                    compares.add(sums.get(l));
                    if (compares.get(0).compareTo(compares.get(1)) == 0) {
                        System.out.println(compares.get(0).toString());
                        System.out.println(compares.get(1).toString());
                        sums.clear();
                        found = true;
                        break;
                    }
                    compares.remove(sums.get(l));
                }
                compares.clear();
            }

            if (!found) {
                System.out.println("Impossible");
            }
        }
    }

}


