/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.csia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author student
 */
public class QuestionGenerator {
    
    // creates ArrayLists to store Question objects of different physics topics
    
    private ArrayList<Question> measurementQuestions;
    // ArrayList storing all measurement and uncertainty questions.
    private ArrayList<Question> wavesQuestions;
    // ArrayList storing all waves questions.
    private ArrayList<Question> kinematicsQuestions;
    // ArrayList storing all mechanics questions.
    private ArrayList<Question> circularQuestions;
    // ArrayList storing all circular motion questions.
    private ArrayList<Question> emQuestions;
    // ArrayList storing all electricity and magnetism questions.
    private ArrayList<Question> thermalQuestions;
    // ArrayList storing all thermal physics questions.
   
    private int questionNumber;
    
    private Question q = new Question();
    private String text;
    private String answer = q.getCorrectAnswer();
    private int currentQuestionIndex;
    private char selectedAnswer;
    private boolean correct;
    Home gui;
    private String fileName;
    private String topic;
    private ArrayList<Question> holder;
    
    public QuestionGenerator()
    {
        measurementQuestions = new ArrayList<Question>();
        //measurementQuestions = addMeasurementQuestions();
        
        wavesQuestions = new ArrayList<Question>();
        //wavesQuestions = addWavesQuestions();
        
        kinematicsQuestions = new ArrayList<Question>();
        //kinematicsQuestions = addMechanicsQuestions();
        
        circularQuestions = new ArrayList<Question>();
        //circularQuestions = addCircularQuestions();
        
        emQuestions = new ArrayList<Question>();
        //emQuestions = addEMQuestions();
        
        thermalQuestions = new ArrayList<Question>();
        //thermalQuestions = addThermalQuestions();
         
        questionNumber = 0;
        gui = new Home();
        fileName = "";
        topic = "";
        holder = null;
    }
    
    // accessor method for ArrayList measurementQuestions
    public ArrayList<Question> getAllMQuestions()
    {
        return measurementQuestions;
    }
    
    // accessor method for ArrayList wavesQuestions
    public ArrayList<Question> getAllWQuestions()
    {
        return wavesQuestions;
    }
    
    // accessor method for ArrayList kinematicsQuestions
    public ArrayList<Question> getAllKQuestions()
    {
        return kinematicsQuestions;
    }
    
    // accessor method for ArrayList circularQuestions
    public ArrayList<Question> getAllCQuestions()
    {
        return circularQuestions;
    }
    
    // accessor method for ArrayList emQuestions
    public ArrayList<Question> getAllEMQuestions()
    {
        return emQuestions;
    }
    
    // accessor method for ArrayList thermalQuestions
    public ArrayList<Question> getAllTQuestions()
    {
        return thermalQuestions;
    }
    
    // sets the file name of the file from which Question objects will be created
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }
    
    // mutator method for variable topic
    public void setTopic(String topic)
    {
        this.topic = topic;
    }
    
    // accessor method for variable topic
    public String getTopic()
    {
        return topic;
    }
    
    // reads physics questions past papers on a text file and stores them into ArrayLists according as Question objects to their topics
    public void topicArrayList()
    {
        if (fileName.equals("measurement and uncertainties.txt"))
        {
            topic = "Measurement and Uncertainties";
            holder = measurementQuestions;
        }
        
        else if (fileName.equals("kinematics.txt"))
        {
            topic = "Kinematics";
            holder = kinematicsQuestions;
        }
        
        else if (fileName.equals("waves and shm.txt"))
        {
            topic = "Waves and SHM";
            holder = wavesQuestions;
        }
        
        else if (fileName.equals("circular motion.txt"))
        {
            topic = "Circular Motion";
            holder = circularQuestions;
        }
        
        else if (fileName.equals("electricity and magnetism.txt"))
        {
            topic = "Measurement and Uncertainties";
            holder = emQuestions;
        }
        
        else if (fileName.equals("thermal physics.txt"))
        {
            topic = "Measurement and Uncertainties";
            holder = thermalQuestions;   
        }
    }
    
    // accessor method for variable fileName
    public String fileName()
    {
        return fileName;
    }
    
    // mutator method for variable fileName
    public String topic()
    {
        return topic;
    }
    
    // reads physics questions past papers on a text file and stores them into ArrayLists according as Question objects to their topics

    public void storeQuestion()
    {
        try 
        {  
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder questionText = new StringBuilder();
            StringBuilder answerOptions1 = new StringBuilder();
            StringBuilder answerOptions2 = new StringBuilder();
            StringBuilder answerOptions3 = new StringBuilder();
            StringBuilder answerOptions4 = new StringBuilder();
            StringBuilder absorb = new StringBuilder();
            String line;
            String correctAnswer = "";
            String a;
                      
            /*for (int d=0; d<questionNumber*6; d++)
            {
                if ((line = bufferedReader.readLine()) != null)
                {
                    absorb.append(line);
                }
            }*/
            for(int i=0; i<15; i++)   // change! (20)
            {   
                String answers[] = new String[4];
                if ((line = bufferedReader.readLine()) != null)
                {
                    // reads the question from text file
                    if (questionText.length()>0)
                    {
                        questionText.append("\n");
                    }
                    questionText.append(line);
                }

                // reads the answer options of a Question from text file and stores them into a String array one by one
           
                if ((line = bufferedReader.readLine()) != null)
                {
                    answers[0]=answerOptions1.append(line + " ").toString();
                }
            
                if ((line = bufferedReader.readLine()) != null)
                {
                    answers[1]=answerOptions2.append(line + " ").toString();
                }
            
                if ((line = bufferedReader.readLine()) != null)
                {
                    answers[2]=answerOptions3.append(line + " ").toString();
                }
            
                if ((line = bufferedReader.readLine()) != null)
                {
                    answers[3]=answerOptions4.append(line + " ").toString();
                } 
             
                String text = questionText.toString(); // converts the question read from text file into a String
            
                if ((line = bufferedReader.readLine()) != null)
                {
                    correctAnswer=line.toString();
                }
                topicArrayList();
                Question question = new Question(text, topic, answers, correctAnswer); 
                holder.add(question); 
                questionText.delete(0, questionText.length());
                answerOptions1.delete(0, answerOptions1.length());
                answerOptions2.delete(0, answerOptions2.length());
                answerOptions3.delete(0, answerOptions3.length());
                answerOptions4.delete(0, answerOptions4.length());
            }
                bufferedReader.close();  
        }
        
        catch(FileNotFoundException ex) 
        {
            System.out.println("Sorry, unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) 
        {
            System.out.println("Error reading file '" + fileName + "'"); 
        } 
        
        //questionNumber++;
    }
    
    // returns the question of specified topic and question number
    public String getQuestionText(String topic, int questionNumber)
    {
        //returns a question from the measurements and uncertainty topic
        if (topic.equals("mu"))
        {
            // System.out.println(measurementQuestions.get(0).toString() + measurementQuestions.get(1).toString() + measurementQuestions.get(2).toString());  does not work here (answer options)
            return measurementQuestions.get(questionNumber).getText();
        }
        
        //returns a question from the waves topic
        else if (topic.equals("w"))
        {
            return wavesQuestions.get(questionNumber).getText();
        }
        
        //returns a question from the mechanics topic
        else if (topic.equals("k"))
        {
            return kinematicsQuestions.get(questionNumber).getText();
        }
        
        //returns a question from the circular motion topic       
        else if (topic.equals("c"))
        {
            return circularQuestions.get(questionNumber).getText();
        }
        
        //returns a question from the electricity and magnetism topic       
        else if (topic.equals("em"))
        {
            return emQuestions.get(questionNumber).getText();
        }
        
        //returns a question from the thermal physics topic       
        else if (topic.equals("t"))
        {
            return thermalQuestions.get(questionNumber).getText();
        }
        
        else
        {
            return "";
        }
    }
    
    // returns the answer option of a question of specified topic, question number, and answer option number
    public String getAnswerOptions(String topic, int questionNumber, int answerOptionNumber)  // answerOptionNumber ranges from 0 to 3
    {
        //returns an answer option of a question from the measurements and uncertainty topic
        if (topic.equals("mu"))
        {
            return measurementQuestions.get(questionNumber).getAnswer()[answerOptionNumber];
        }
        
        //returns an answer option of a question from the waves topic
        else if (topic.equals("w"))
        {
            return wavesQuestions.get(questionNumber).getAnswer()[answerOptionNumber];
        }
        
        //returns an answer option of a question from the mechanics topic
        else if (topic.equals("k"))
        {
            return kinematicsQuestions.get(questionNumber).getAnswer()[answerOptionNumber];
        }
        
        //returns an answer option of a question from the circular motion topic
        else if (topic.equals("c"))
        {
            return circularQuestions.get(questionNumber).getAnswer()[answerOptionNumber];
        }
        
        //returns an answer option of a question from the electricity and magnetism topic
        else if (topic.equals("em"))
        {
            return emQuestions.get(questionNumber).getAnswer()[answerOptionNumber];
        }
        
        //returns an answer option of a question from the thermal physics topic
        else if (topic.equals("t"))
        {
            return thermalQuestions.get(questionNumber).getAnswer()[answerOptionNumber];
        }
        
        else
        {
            return "";
        }
    }
    
    // returns the correct answer of a question of specified topic and question number

    public String getAns(String topic, int questionNumber)
    {
        if (topic.equals("mu"))
        {
            return measurementQuestions.get(questionNumber).getCorrectAnswer();
        }
        
        //returns an answer option of a question from the waves topic
        else if (topic.equals("w"))
        {
            return wavesQuestions.get(questionNumber).getCorrectAnswer();
        }
        
        //returns an answer option of a question from the mechanics topic
        else if (topic.equals("k"))
        {
            return kinematicsQuestions.get(questionNumber).getCorrectAnswer();
        }
        
        //returns an answer option of a question from the circular motion topic
        else if (topic.equals("c"))
        {
            return circularQuestions.get(questionNumber).getCorrectAnswer();
        }
        
        //returns an answer option of a question from the electricity and magnetism topic
        else if (topic.equals("em"))
        {
            return emQuestions.get(questionNumber).getCorrectAnswer();
        }
        
        //returns an answer option of a question from the thermal physics topic
        else if (topic.equals("t"))
        {
            return thermalQuestions.get(questionNumber).getCorrectAnswer();
        }
        
        else
        {
            return "";
        }
    }     
    
}
