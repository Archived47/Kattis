package Done;

import java.io.*;

public class spavanac {

    private static class Time {
        int hours;
        int minutes;

        Time(int hours, int minutes) {
            if (minutes < 0) {
                this.hours = hours - 1;
                if (this.hours < 0) this.hours = 23;
                this.minutes = 60 + minutes;
            } else {
                this.hours = hours;
                this.minutes = minutes;
            }
        }

        @Override
        public String toString() {
            return hours + " " + minutes;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        Time time = new Time(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]) - 45);

        out.write(time.toString());

        out.close();
    }

}
