/*
CZ
3/20/24
HK
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Maze {

    private char[][] maze;
    private int width;
    private int height;
    private int statesCount;

    private Random r;

    private final static char penalty = 'X';
    private final static char finish = 'F';
    private final static char empty = '0';

    public Maze() {
        r = new Random();
        width = 3;
        height = 3;
        statesCount = width * height;
    }

    public void generate() {
        int rPenaltyH = r.nextInt(height);
        int rPenaltyW = r.nextInt(width);
        int rFinishH = r.nextInt(height);
        int rFinishW = r.nextInt(width);
        while (rFinishH == rPenaltyH && rFinishW == rPenaltyW) {
            rFinishH = r.nextInt(height);
            rFinishW = r.nextInt(width);
        }

        maze = new char[height][width];

        maze[rPenaltyH][rPenaltyW] = penalty;
        maze[rFinishH][rFinishW] = finish;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] != penalty && maze[i][j] != finish) {
                    maze[i][j] = empty;
                }
            }
        }
    }

    public void outputMaze() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(maze[i][j]);
            }
            sb.append("\n");
        }
        PrintWriter pw = new PrintWriter("maze.txt");
        pw.println(sb);
        pw.close();
    }
}
