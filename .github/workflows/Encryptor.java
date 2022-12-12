import java.util.Scanner;
import java.util.Random;
/**
     * Encryptor constructor sets the numberchoice & input variables in Encryptor.java
     * @param numberchocie the methode in which the phrase will become encrypted 
     * @param input the phrase that is going to become encrypted 
     */
public class Encryptor {
    
    private int numberchoice;
    private String input;
    
    public Encryptor(int numberchoice, String input){
        
        this.numberchoice = numberchoice; 
        this.input =  input;
        
    }
    
     /**
     * inputconfirmer method receives the user's choice in the encyption method and returns if the chice is valid or not
     * @param numberchoice the User's choice in how the phrase will become encrypted 
     * @return if the user's input is valid or not
     */
   public boolean inputconfirmer (int numberchoice){
        
        if (numberchoice > 2){
            System.out.println("\nError input out of range");
            return false;
        }
        else if (numberchoice < 1 || numberchoice == 0){ /* This is the Advanced conditional    */
            System.out.println("\nError input out of range");
            return false;
        }
        else{
            
            System.out.println("Processing");
            System.out.println("...");
            System.out.println("...");
            System.out.println("...");
            System.out.println(" input in range");
            return true;
        }

    } 
    
     /**
     * ceasercypher method receives the user's choice in the encyption method and exectutes it 
     * @param numberchoice the User's choice in how the phrase will become encrypted in this case how much will the letters be shfted across the alphabet 
     * @param input the User's phrase before encyption
     * @return resturns the new phrase
     */
     public String ceasercypher (String input,int numberchoice){
        
       String alphabet = "abcefghijklmnopqrstuvwxyz";
       
       String finalresult = " ";
       int i = 0;
      while (i < input.length()){/*This is the loop/iteration */
    
        int letter = alphabet.indexOf(input.substring(i,i+1)); 
        int newletter = Math.abs(letter + numberchoice);
            if (newletter >=alphabet.length()){
                newletter -= alphabet.length();
            }
        finalresult = finalresult + alphabet.substring(newletter,newletter+1); 
         i += 1;
        }
        
       return finalresult;

    } 
    
     /**
     * randomization method receives the user's choice in the encyption method and exectutes it 
     * @param numberchoice the User's choice in how the phrase will become encrypted
     * @return resturns the new phrase
     */
     public String randomization (String input){
        
       String alphabet = "abcefghijklmnopqrstuvwxyz";
       String finalresult = " ";
       Random rand = new Random();
       int i = 0;
      while (i < input.length()){
        int letter = alphabet.indexOf(input.substring(i,i+1)); 
        int newletter = Math.abs(letter + rand.nextInt(5));
            if (newletter >=alphabet.length()){
                newletter -= alphabet.length();
            }
        finalresult = finalresult + alphabet.substring(newletter,newletter+1); 
         i += 1;
        }
       return finalresult;

    } 
    
  
}
