public class Delerandom //random responses
{
    public static String getRandom()
    {
        final int NUMBER_OF_RESPONSES = 5;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Really?";
        }
        else if (whichResponse == 3)
        {
            response = "Salute";
        }else if (whichResponse == 4)
        {
            response = "let's move on to the next topic";
        }

        return response;
    }
    
    public static String getRandomThanks()
    {
        final int NUMBER_OF_THANKS = 5;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_THANKS);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "No Problem!";
        }
        else if (whichResponse == 1)
        {
            response = Delejoke.getJoke();
        }
        else if (whichResponse == 2)
        {
            response = "67";
        }
        else if (whichResponse == 3)
        {
            response = "Come take mock exam!";
        }else if (whichResponse == 4)
        {
            response = "Great! let's move on to the next topic";
        }

        return response;
    }
    
}