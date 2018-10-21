package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class parsinghex {

    private static boolean isHex(char input) {
        input = Character.toUpperCase(input);
        for (int i = 0; i <= 9; ++i) {
            if (input == Character.forDigit(i, 10)) {
                return true;
            }
        }
        for (char c = 'A'; c <= 'F'; ++c) {
            if (input == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
//                if (line.equals("LucasSTOP!")) break;
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            char[] chars = line.toCharArray();
            ArrayList<Character> storage = new ArrayList<>();
            StringBuilder hexBuilder = new StringBuilder();

            for (int i = 0; i < chars.length; ++i) {
                storage.add(chars[i]);
                if (storage.size() > 1) {
                    if (storage.get(i - 1) == '0' && (storage.get(i) == 'x' || storage.get(i) == 'X')) {
                        hexBuilder.append(chars[i - 1]);
                        hexBuilder.append(chars[i]);
                        for (int j = i + 1; j < chars.length; ++j) {
                            if (isHex(chars[j])) {
                                hexBuilder.append(chars[j]);
                            } else {
                                break;
                            }
                        }
                        String hexValue = hexBuilder.toString();
                        if (hexValue.length() < 3) continue;
                        long decimal = Long.parseLong(hexValue.substring(2), 16);
                        System.out.printf("%s %d%n", hexValue, decimal);
                        hexBuilder = new StringBuilder();
                    }
                }
            }
        }
    }

}
