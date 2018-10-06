/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.csia;

/**
 *
 * @author student
 */

// keeps track of the user's level
public class LevelCounter{
    private int level; // the user's current level
    private int maxCount; // the highest level
    private RightCounter rightCounter; // rightCounter to keep track of when to increment level
    
    // constructor of LevelCounter class
    public LevelCounter()
    {
        level = 1; // sets the initial level to be 1
        maxCount = 3; // the highest level available is 3
        RightCounter rightCounter = new RightCounter(); // instantiates a new RightCounter;
    }
    
    // returns the value of the LevelCounter 
    public int getLevel()
    {
        return level;
    }
    
    // returns the highest acceptable value of the LevelCounter
    public int getMaxCount()
    {
        return maxCount;
    }
    
    // sets the value of the LevelCounter
    public void setLevel(int l)
    {
        level = l;
    }
    
    // sets the highest acceptable value of LevelCounter
    public void setMaxCount(int c)
    {
        maxCount = c;
    }
    
    // increments user's level by 1 if it hasn't exceeded 3
    public void increment()
    {
        if (level <=2)
        {
            level = level + 1;
        }
    }
    
    // increments user's level by a specified value if it hasn't exceeded 3
    public void increment(int i)
    {
        if (level <=2)
        {
            level = level + i;
        }
    }
    
    // resets LevelCounter to 0
    public void reset()
    {
        level = 0;
    }
    
    // returns all variables of LevelCounter class
    public String toString()
    {
        return "" + level + maxCount;
    }
}
