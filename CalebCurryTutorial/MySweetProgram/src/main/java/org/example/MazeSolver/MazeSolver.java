package org.example.MazeSolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class MazeSolver {
    //0 = wall
    //1 = path
    //2 = destination

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Maze> mazes = new ArrayList<>();

        Maze m = new Maze();

        //fill list from file
        Scanner scanner = new Scanner(new File("C:\\Users\\Toma\\IDEA Projects\\CalebCurryTutorial\\MySweetProgram\\src\\main\\resources\\mazes.txt"));
        int rows = Integer.parseInt(scanner.nextLine());
        m.maze = new int[rows][];

        //loop
        for (int i = 0; i < rows; i++) {
            String[] items = scanner.nextLine().split(", ");
            m.maze[i] = Arrays.stream(items).mapToInt(Integer::parseInt).toArray();
        }

        //starting point
        m.start = new Position(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));

        mazes.add(m);

        int i = 0;
        while (i < mazes.size()) {
            String result = (solveMaze(mazes.get(i))) ? "You won" : "No path";
            System.out.println(result);
            i++;
        }
    }

    private static boolean solveMaze(Maze m) {
        Position position = m.start;
        m.path.push(position);

        while (true) {
            assert m.path.peek() != null;
            int y = m.path.peek().y;
            int x = m.path.peek().x;
            m.maze[y][x] = 0;

            //down
            if (isValid(y + 1, x, m)) {
                if (m.maze[y + 1][x] == 2) {
                    System.out.println("Moved down!");
                    return true;
                } else if (m.maze[y + 1][x] == 1) {
                    System.out.println("Moved down!");
                    m.path.push(new Position(y + 1, x));
                    continue;
                }
            }

            //left
            if (isValid(y, x - 1, m)) {
                if (m.maze[y][x - 1] == 2) {
                    System.out.println("Moved left!");
                    return true;
                } else if (m.maze[y][x - 1] == 1) {
                    System.out.println("Moved left!");
                    m.path.push(new Position(y, x - 1));
                    continue;
                }
            }

            //up
            if (isValid(y - 1, x, m)) {
                if (m.maze[y - 1][x] == 2) {
                    System.out.println("Moved up!");
                    return true;
                } else if (m.maze[y - 1][x] == 1) {
                    System.out.println("Moved up!");
                    m.path.push(new Position(y - 1, x));
                    continue;
                }
            }

            //right
            if (isValid(y, x + 1, m)) {
                if (m.maze[y][x + 1] == 2) {
                    System.out.println("Moved right!");
                    return true;
                } else if (m.maze[y][x + 1] == 1) {
                    System.out.println("Moved right!");
                    m.path.push(new Position(y, x + 1));
                    continue;
                }
            }

            //popping
            m.path.pop();
            System.out.println("Moved back");
            if (m.path.size() == 0) {
                return false;
            }
        }
    }

    public static boolean isValid(int y, int x, Maze m) {
        if (y < 0 || y >= m.maze.length || x < 0 || x >= m.maze[y].length) {
            return false;
        }
        return true;
    }
}
