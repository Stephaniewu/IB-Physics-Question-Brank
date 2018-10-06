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
public class Counter {
    
    private int count;  // number of counts
    
    // constructor of Counter class
    public Counter()
    {
        count = 0;
    }
    
    // increments the value of Counter by 1
    public void increment()
    {
        count = count + 1;
    }
}
