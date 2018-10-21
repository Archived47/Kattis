package Done;

import java.math.BigInteger;
import java.util.Scanner;

public class simpleaddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger input1 = scanner.nextBigInteger();
        BigInteger input2 = scanner.nextBigInteger();

        System.out.println(input1.add(input2));
    }

}
