import greenfoot.*;

/**
 * MyKara is a subclass of Kara. Therefore, it inherits all methods of Kara: <p>
 * 
 * <i>MyKara ist eine Unterklasse von Kara. Sie erbt damit alle Methoden der Klasse Kara:</i> <p>
 * 
 * Actions:     move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors:     onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MyKara extends Kara
{
    public static final int ROWS = 2;
    /**
     * In the 'act()' method you can write your program for Kara <br>
     * <i>In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden</i>
     */

    int carry = 0;
    public void act() 
    {

        turnRight();
        inspectRow();
        turnAround();
        goBack();
        turnRight();

        if ((carry & 1) == 1)
            putLeaf();
        carry = carry >> 1;

        move();
        if (treeFront()) Greenfoot.stop();
    }  

    private void inspectRow(){
        for (int i=0;i<ROWS;i++){
            move();        
            if (onLeaf())
                carry++;
        }
    }

    private void turnAround(){
        turnLeft();
        turnLeft();
    }

    private void goBack(){
        for (int i=0;i<ROWS;i++){
            move();        
        }
    }
}
