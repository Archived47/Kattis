package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class chess {

    private static Position end;
    private static ArrayList<ArrayList<Position>> paths;

    private static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return getColumn(x) + " " + y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Position) {
                return x == ((Position) obj).x && y == ((Position) obj).y;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nrTestCases = Integer.parseInt(reader.readLine());

        for (int i = 0; i < nrTestCases; i++) {
            char[] input = reader.readLine().replaceAll("\\s", "").toCharArray();
            int startColumn = getColumn(input[0]);
            int startRow = Character.digit(input[1], 10);
            int endColumn = getColumn(input[2]);
            int endRow = Character.digit(input[3], 10);

            Position start = new Position(startColumn, startRow);
            end = new Position(endColumn, endRow);

            boolean startBlack = (startColumn + startRow) % 2 == 0;
            boolean endBlack = (endColumn + endRow) % 2 == 0;

            if ((startBlack && !endBlack) || (!startBlack && endBlack)) {
                System.out.println("Impossible");
                continue;
            }

            StringBuilder output = new StringBuilder();
            int moves = Integer.MAX_VALUE;

            output.append(start).append(" ");

            paths = new ArrayList<>();

            if (!start.equals(end)) {
                paths = getPath(new Position(startColumn, startRow));
            }

            for (ArrayList<Position> path : paths) {
                if (path.size() < moves && path.get(path.size()-1).equals(end)) {
                    moves = path.size();
                    for (Position p : path) {
                        output.append(p).append(" ");
                    }
                    break;
                }
            }

            if (moves == Integer.MAX_VALUE) moves = 0;
            System.out.printf("%d %s%n", moves, output.toString());
        }
    }

    private static int getColumn(char pos) {
        switch (pos) {
            case 'A': return 1;
            case 'B': return 2;
            case 'C': return 3;
            case 'D': return 4;
            case 'E': return 5;
            case 'F': return 6;
            case 'G': return 7;
            case 'H': return 8;
            default: return 0;
        }
    }

    private static char getColumn(int pos) {
        switch (pos) {
            case 1: return 'A';
            case 2: return 'B';
            case 3: return 'C';
            case 4: return 'D';
            case 5: return 'E';
            case 6: return 'F';
            case 7: return 'G';
            case 8: return 'H';
            default: return 0;
        }
    }

    private static ArrayList<ArrayList<Position>> getPath(Position position) {
        if (paths.isEmpty()) {
            for (Position p : getAvailableMoves(position)) {
                ArrayList<Position> path = new ArrayList<>();
                path.add(p);
                paths.add(path);
            }
        }
        while(true) {
            ArrayList<Position> current = null;
            for (ArrayList<Position> path : paths) {
                if (path.size() >= 2) continue;
                if (path.get(0).equals(end)) return paths;
                Position[] available = getAvailableMoves(path.get(path.size() - 1));
                Position pos = null;
                for (Position anAvailable : available) {
                    pos = anAvailable;
                    if (!path.contains(pos)) path.add(pos);
                    if (pos.equals(end)) {
                        return paths;
                    }
                    path.remove(pos);
                }
                path.add(pos);
                current = path;
            }
            paths.add(current);
        }
    }

    private static Position[] getAvailableMoves(Position position) {
        ArrayList<Position> positions = new ArrayList<>();

        int currentX = position.x;
        int currentY = position.y;

        while(currentX != 1 && currentY != 1) {
            currentX--;
            currentY--;
            positions.add(new Position(currentX, currentY));
        }

        currentX = position.x;
        currentY = position.y;
        while(currentX != 1 && currentY != 8) {
            currentX--;
            currentY++;
            positions.add(new Position(currentX, currentY));
        }

        currentX = position.x;
        currentY = position.y;
        while(currentX != 8 && currentY != 1) {
            currentX++;
            currentY--;
            positions.add(new Position(currentX, currentY));
        }

        currentX = position.x;
        currentY = position.y;
        while(currentX != 8 && currentY != 8) {
            currentX++;
            currentY++;
            positions.add(new Position(currentX, currentY));
        }

        return positions.toArray(new Position[0]);
    }

}
