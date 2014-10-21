import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class KaraNumberCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KaraNumberCreator extends Kara
{
    /**
     * Act - do whatever the KaraNumberCreator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int MAX_DIGITS = 10;
    int MAX_NUMBER = ((1<<MAX_DIGITS)-1);
    boolean done = false;
    public void act() 
    {
        if (!done){
            int number = (new Random()).nextInt(MAX_NUMBER+1);
            layNumber(number);
            done = true;
        }
    }


    public void layNumber(int number){
        if (number > MAX_NUMBER){
            showWarning("There's only room for "+MAX_DIGITS+" binary digits ("+MAX_NUMBER+")","");    
        }else{
            int current = number;
            while (current != 0){
                move();
                if ((current & 1) != 0)
                    putLeaf();
                current = current >> 1;

            }
        }
        while (!treeFront()) 
            move();
    }

}