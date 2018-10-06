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
// each quiz question is stored as a question object
public class Question {
    private String text;
    private String topic;
    private String[] answers; 
    // a field of the Question object storing the four answer options of each Question
    private String correctAnswer;
    
    // constructs a Question object
    public Question()
    {
        text = "";
        correctAnswer = "";
        topic = "";
        answers = null;
    }
    
    // constructs a Question object of specified text, topic, answer options, and correct answer
    public Question (String text, String topic, String[] answers, String correctAnswer)
    {
        this.text = text;
        this.topic = topic;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
    
    // sets the text of the question
    public void setText(String text)
    {
        this.text = text;
    }
    
    // sets the topic of the question
    public void setTopic(String topic)
    {
        this.topic = topic;
    }
    
    // sets the answer options of the question
    public void setAnswers(String[] answers)
    {
        this.answers = answers;
    }
    
    // sets the correct answer of the question
    public void setCorrectAnswer(String correctAnswer)
    {
        this.correctAnswer = correctAnswer;
    }
    
    // returns the text of the question
    public String getText()
    {
        return text;
    } 
    
    // returns the topic of the question
    public String getTopic()
    {
        return topic;
    }
    
    // returns the answer options of the question
    public String[] getAnswer()
    {
        return answers;
    }
    
    // returns the correct answer of the question
    public String getCorrectAnswer()
    {
        return correctAnswer;
    }
    
    // returns all of the Question class’ fields.
    public String toString()
    {
        return "" + "Question: "+ text + " Topic: " + topic + " Answer Options: " + answers[0] + answers[1] + answers[2] + answers[3] + "Answer: " + correctAnswer;
    }
}
