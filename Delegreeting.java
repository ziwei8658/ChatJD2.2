public class Delegreeting // greeting module
{
    public static String getGreeting()
    {
        final int NUMBER_OF_Greetings = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_Greetings);
        String response = "";
        if (whichResponse == 0)
        {
            response = "Hello! I'm Mr Delemar";
        }
        else if (whichResponse == 1)
        {
            response = "What can I help you?";
        }
        else if (whichResponse == 2)
        {
            response = "Disneyland! what can I do for you?";
        }
        else if (whichResponse == 3)
        {
            response = "Delemar! I can give you advice on AP Lang";
            
        }
        response += "\nCurrent modes: essay, basic triggers, joke";
        return response;
    }
}