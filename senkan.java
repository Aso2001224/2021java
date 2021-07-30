package Lastsubject;
import java.util.*;
public class senkan {
    private String name;
    private int[][] a= new int[5][5];   // 位置
    private int hp = 3;
    Scanner sc = new Scanner(System.in);
    int bombx = sc.nextInt();
    int bomby = sc.nextInt();

    public senkan(String name,int randomX,int randomY,int hp){
        this.name = name;
        this.hp = hp;
        if(this.a[randomX][randomY] != 1){
            this.a[randomX][randomY] = 1;   //X,Y座標に位置である1を設定
        }
        if(bombx == a[bombx][bomby]){
            this.hp = hp -1;
        }
    }
    public void miss(){
        System.out.printf("ヒットしませんでした。\n");
    }

    public void nearmiss(){
        System.out.printf("ヒットしたが沈まない\n");
    }
   

}
