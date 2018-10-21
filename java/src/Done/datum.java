package Done;

import java.io.*;

public class datum {

    enum months {
        January(31),
        February(28),
        March(31),
        April(30),
        May(31),
        June(30),
        July(31),
        August(31),
        September(30),
        October(31),
        November(30),
        December(31);

        int days;

        months(int days) {
            this.days = days;
        }

        public static int getDays(int month) {
            int days = 0;
            months[] ms = months.values();
            for (int i = 0; i < month - 1; i++) {
                days += ms[i].days;
            }
            return days;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int day = Integer.parseInt(inputs[0]);
        int month = Integer.parseInt(inputs[1]);

        int actualDay = day + months.getDays(month);

        switch (actualDay % 7) {
            case 0: out.write("Wednesday"); break;
            case 1: out.write("Thursday"); break;
            case 2: out.write("Friday"); break;
            case 3: out.write("Saturday"); break;
            case 4: out.write("Sunday"); break;
            case 5: out.write("Monday"); break;
            case 6: out.write("Tuesday"); break;
        }

        out.close();
    }

}
