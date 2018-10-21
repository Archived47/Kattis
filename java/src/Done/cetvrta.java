package Done;

import java.io.*;

public class cetvrta {

    private static class Point {
        int x;
        int y;
        
        Point(String[] s) {
            x = Integer.parseInt(s[0]);
            y = Integer.parseInt(s[1]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        Point[] points = new Point[3];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(in.readLine().split("\\s"));
        }

        int x = 0;
        int y = 0;
        if (points[0].x == points[1].x) x = points[2].x;
        else if(points[1].x == points[2].x) x = points[0].x;
        else if(points[0].x == points[2].x) x = points[1].x;
        if (points[0].y == points[1].y) y = points[2].y;
        else if(points[1].y == points[2].y) y = points[0].y;
        else if(points[0].y == points[2].y) y = points[1].y;

        out.write(x + " " + y);
        out.close();
    }

}
