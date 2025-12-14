public class Delejoke// joke module
{
    public static String getJoke()
    {
        final int NUMBER_OF_JOKES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_JOKES);
        String response = "";
        if (whichResponse == 0)
        {
            response = "What is a pirate's favourite letter?\n\n\nR";
        }
        else if (whichResponse == 1)
        {
            response = "yeth king";
        }
        else if (whichResponse == 2)
        {
            response = "no king";
        }
        else if (whichResponse == 3)
        {
            System.out.println("I'm going to starbucks\n\n Mr Delemar left the room...");
            response = "Bye!";
            
        }

        return response;
    }
    
}