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

// keeps track of the user's score
public class ScoreCounter {
    
    private int score; // variable to keep track of the user's score
    
    // constructor of the ScoreCoutner class
    public ScoreCounter()
    {
        score = 0;
    }
    
    // returns the user's current score
    public int getScore()
    {
        return score;
    }
    
    // sets the value of user's score
    public void setScore(int s)
    {
        score = s;
    }
    
    // increments user's score by 10
    public void increment()
    {
        score = score + 10;
    }
    
    // increments user's score by a specified value
    public void increment(int i)
    {
        score = score + i;
    }
    
    // resets user's score to 0
    public void reset()
    {
        score = 0;
    }
    
    // returns all variables of ScoreCounter class
    public String toString()
    {
        return "" + score;
    }
}
