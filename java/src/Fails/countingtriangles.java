package Fails;//TODO redo in the future, I understood it wrong.
// Tip for future self, you need to check every POINT on the line segments.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class countingtriangles {

    private static class Line {
        double startX, endX;
        double startY, endY;

        Line(double startX, double startY, double endX, double endY) {
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
        }

        boolean intersects(Line line) {
            return (this.startX == line.startX || this.startY == line.startY) || (this.endX == line.endX || this.endY == line.endY);
        }

        @Override
        public String toString() {
            return startX + ":" + startY + ";" + endX + ":" + endY;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nrLines;
        while ((nrLines = Integer.parseInt(reader.readLine())) != 0) {
            Line[] lines = new Line[nrLines];
            for (int i = 0; i < nrLines; i++) {
                String[] sArr = reader.readLine().split("\\s");
                lines[i] = new Line(Double.parseDouble(sArr[0]), Double.parseDouble(sArr[1]), Double.parseDouble(sArr[2]), Double.parseDouble(sArr[3]));
            }

            ArrayList<ArrayList<Line>> triangles = new ArrayList<>();
            for (int i = 0; i < lines.length - 2; i++) {
                ArrayList<Line> temp = new ArrayList<>();
                for (int j = i; j < lines.length - 2; j++) {
                    temp.add(lines[j]);
                    if (temp.size() == 3) temp.remove(1);
                    for (int k = j+1; k < lines.length; k++) {
                        temp.add(lines[k]);
                        if (temp.size() > 2) {
                            triangles.add((ArrayList<Line>) temp.clone());
                        }
                        temp.remove(lines[k]);
                    }
                }
                temp.clear();

            }

            System.out.println(triangles);

            int count = 0;

            for (ArrayList<Line> triangle : triangles) {
                boolean correct = true;
                for (int i = 0; i < triangle.size() - 1; i++) {
                    if (!triangle.get(i).intersects(triangle.get(i + 1))) {
                        correct = false;
                        break;
                    }
                }
                if (correct) count++;
            }

            System.out.println(count);
        }
    }

}
