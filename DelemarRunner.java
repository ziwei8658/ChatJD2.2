

/**
 * A simple class to run the Delemar class.
 * @author Zijun Wei
 * @version 2.2
 * @date December 11/2025
 * @update description: Added randomThanks module, share playground available
 */
 
import java.util.Scanner;
 // normal mode includes some random responses, jokes, 
public class DelemarRunner
{

    /**
     * Create a Delemar, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Delemar jason = new Delemar();
        System.out.println(jason);
        
        System.out.println (jason.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = "";
        
        String mode = "normal";
        // modes for larger modules that expect further conversations
        
        while (!statement.equalsIgnoreCase("Bye")) 
        {
            statement = in.nextLine();// read new line every time going through loop

            switch (mode) 
                {

                case "normal":
                    if (statement.toLowerCase().contains("essay") || statement.toLowerCase().contains("frq")) {
                        System.out.println("Which essay type?");
                        mode = "essay"; // enter essay mode
                        break;
                    }
                     else {
                            System.out.println(jason.getResponse(statement));
                            break;
                    }
                    

                case "essay":
                    boolean valid = jason.essay(statement.toLowerCase());
                    if(valid)
                    {
                        mode = "normal";
                    }
                    break;
                    
                default:
                    System.out.println("Hmm, I didn't understand that. Let's keep chatting!");
                    mode = "normal";
                    break;
      
                }// end of switch
        }// end of while-loops
    }//end of main
}//end of class

  

