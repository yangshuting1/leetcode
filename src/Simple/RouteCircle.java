package Simple; /**
 * Created by sugaryang on 2017/10/16.
 */
/**
 *he valid robot moves are R (Right), L (Left), U (Up) and D (down).
 * Input: "UD"
   Output: true

   Input: "LL"
   Output: false
 * */
public class RouteCircle {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char m = moves.charAt(i);
            switch (m) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }

        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}
