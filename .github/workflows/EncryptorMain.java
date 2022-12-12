/**
 * The EncryptorMain program takes a simple phrase and then procceeds to encypt it!
 * @author  Junsnag Lee
 * @version final
 * @since   2022-12-10
 */



import java.util.Scanner;
public class EncryptorMain /* this is the main methode*/
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The encryptor!\n");
        System.out.println("Please input the phrase you want encrypted (only lowercase and letters)");
        
        String phrase1 = input.nextLine();

        System.out.println("Please input the method to do so:");
        System.out.println("1.Ceaser cypher");  /* This options give the user the option to use a Ceaser cypher*/ 
        System.out.println("2.randomization cypher");     /* This cypher will randomly replace the letter with a random letter and save the placement, bascially a Ceaser cypher without the choice in regards to number*/
        
        
        int phrase2 = input.nextInt(); 
        Encryptor object1 =  new Encryptor(phrase2, phrase1);/*This is the constructor*/
        object1.inputconfirmer(phrase2); /*This is the call of the inputconfirmer method*/
        if (phrase2 == 1){
         System.out.println("Please put in the code number then:");
         int phrase3 = input.nextInt();
         System.out.println(object1.ceasercypher(phrase1, phrase3));/*This is the call of the Ceasercypher method*/
            
        }
        if (phrase2 == 2){
            
         System.out.println(object1.randomization(phrase1));/*This is the call of the randomization method*/
            
        }
    }
}
