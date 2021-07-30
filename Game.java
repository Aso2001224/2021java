package Lastsubject;
import java.util.*;
public class Game {
    public static int turn =1;

    Random random = new Random();
    int randomValue01 = 1+ random.nextInt(3);
    int randomValue02 = 1+ random.nextInt(3);

   

    senkan s1 = new senkan("s1",randomValue01,randomValue02,3);
    senkan s2 = new senkan("s2",randomValue01,randomValue02,3);
    senkan s3 = new senkan("s3",randomValue01,randomValue02,3);

    public static void GameStart(){
        System.out.printf("--------\n戦艦ゲーム\n--------\n\n");
    }
    public void GPS(){
        System.out.println("s1:生きてる s2:生きてる s3:生きてる");
    }

}
