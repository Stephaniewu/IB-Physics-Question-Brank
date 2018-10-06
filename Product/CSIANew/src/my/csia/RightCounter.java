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

// keeps track of the number of questions that the user gets right
public class RightCounter {
    
    private int rCount; // number of questions user has answered correctly
    
    // constructor of RightCounter class
    public RightCounter()
    {
        rCount = 0; 
    }
    
    // returns the number of questions answered correctly
    public int getNoRight()
    {
        return rCount;
    }
    
    // sets the number of questions answered correctly
    public void setNoRight(int s)
    {
        rCount = s;
    }
    
    // increments number of questions answered correctly by 1
    public void increment()
    {
        rCount = rCount + 1;
    }
    
    // increments number of questions answered correctly by a specified value
    public void increment(int i)
    {
        rCount = rCount + 1;
    }
    
    // resets number of questions answered correctly to 0
    public void reset()
    {
        rCount = 0;
    }
    
    // returns all variables of the class RightCounter
    public String toString()
    {
        return "" + rCount;
    }
}
