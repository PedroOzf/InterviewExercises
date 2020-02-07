package normal;

public class Robot {
    public static boolean isRobot(String instructions) {
        //North = 1, East = 2, South = 3, West = 4
        int dir = 1;
        int y = 0;
        int x = 0;
        for (int i = 0; i < instructions.length(); i++) {
            char c = instructions.charAt(i);
            if (c == 'L') {
                if (dir == 1) dir = 4;
                else dir--;
            } else if (c == 'R') {
                if (dir == 4) dir = 1;
                else dir++;
            } else {
                if (dir == 1) y++;
                else if (dir == 2) x++;
                else if (dir == 4) x--;
                else if (dir == 3) y--;
            }
        }
        if (dir == 1) {
            if (y == 0 && x == 0) return true;
            return false;
        }
        return true;
    }
}
