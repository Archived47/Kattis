package Fails;//TODO, find out how it can still fail

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class parsinghex {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("LucasSTOP!")) break;
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> hexes = new ArrayList<>();

        for (String s : lines) {
            // Handle file
            StringBuilder builder = new StringBuilder();
            for (char c : s.toCharArray()) {
//                System.out.println(builder.toString() + " " + c);
                if (builder.toString().isEmpty() && c == '0') {
                    builder.append(c);
                } else if(builder.toString().equals("0") && String.valueOf(c).matches("[xX]")) {
                    builder.append(c);
                } else if(String.valueOf(c).matches("[0-9a-fA-F]") && builder.toString().matches("^0[xX][0-9a-fA-F]*$")) {
                    builder.append(c);
                } else if (builder.toString().matches("^0[xX][0-9a-fA-F]+$") && !String.valueOf(c).matches("[0-9a-fA-F]")) {
//                    System.out.println(builder.toString());
//                    System.out.println(c);
                    hexes.add(builder.toString());
                    builder = new StringBuilder();
                } else {
                    // (builder.toString().matches("0[xX]") || builder.toString().startsWith("0")) && !String.valueOf(c).matches("[0-9a-fA-F]")
                    builder = new StringBuilder();
                }
            }
            if (!builder.toString().isEmpty() && builder.toString().matches("^0[xX][0-9a-fA-F]+$")) {
                hexes.add(builder.toString());
            }
        }
        for (String hex : hexes) {
            if(hex.length() < 3) continue;
            String actual = hex.substring(2);
            long decimal = Long.parseLong(actual, 16);
            if (decimal == 0) continue;
            System.out.printf("%s %d%n", hex, decimal);
        }

    }

}
