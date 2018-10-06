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

// keeps track of the number of questions that the user gets wrong
public class WrongCounter {
    private int wCount; // number of questions user has answered correctly
    
    // constructor of WrongCounter class
    public WrongCounter()
    {
        wCount = 0;
    }
    
    // returns the number of questions answered incorrectly
    public int getNoWrong()
    {
        return wCount;
    }
    
    // sets the number of questions answered incorrectly
    public void setNoWrong(int s)
    {
        wCount = s;
    }
    
    // increments number of questions answered incorrectly by 1
    public void increment()
    {
        wCount = wCount + 1;
    }
    
    // increments number of questions answeredin correctly by a specified value
    public void increment(int i)
    {
        wCount = wCount + i;
    }
    
    // resets number of questions answered incorrectly to 0
    public void reset()
    {
        wCount = 0;
    }
    
    // returns all variables of the class WrongCounter
    public String toString()
    {
        return "" + wCount;
    }
}
