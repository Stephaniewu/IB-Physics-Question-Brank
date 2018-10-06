/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.csia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Quiz {
    Scanner scan = new Scanner(System.in);
    private String answer;
    private String lAnswer;
    private String correctAnswer;
    private int questionLevel;
    private int tChoice;
    private String sChoice;
    private RightCounter rightCounter = new RightCounter();
    private WrongCounter wrongCounter = new WrongCounter();
    private ScoreCounter scoreCounter = new ScoreCounter();
    private LevelCounter levelCounter = new LevelCounter();
    private String fileU = "measurement and uncertainties.txt";
   
    
    ArrayList<Question> mechaniceQuestion = new ArrayList<Question>();
   
    
    
    public Quiz()
    {
        
    }
    
 
}
