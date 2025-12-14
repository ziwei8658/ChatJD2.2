public class Deleresponse //response module, include random response and jokes
{
    public static String joke()// joke is later called in a static method(getResponse)
    //static method cannot call a non-static method directly because non-static methods require an object.
    {
        return Delejoke.getJoke();
    }
    
    public static String getRandomResponse()
    {
        return Delerandom.getRandom();
    }
    
    public static String getResponse(String statement)
    {
        String response = "";
        if (statement.toLowerCase().indexOf("no") >= 0) {
            response = "Why so negative?";
        }
        else if (statement.toLowerCase().indexOf("mother") >= 0 ||
                 statement.toLowerCase().indexOf("father") >= 0) {
            response = "Tell me more about your family.";
        }
        else if (statement.toLowerCase().indexOf("baseball") >= 0 ||
                 statement.toLowerCase().indexOf("football") >= 0) {
            response = "What position do you play?";
        }
        else if (statement.toLowerCase().indexOf("brother") >= 0 ||
                 statement.toLowerCase().indexOf("sister") >= 0) {
            response = "How many siblings do you have?";
        }
        else if (statement.toLowerCase().indexOf("english") >= 0) {
            response = "Which English are you taking?";
        }
        else if (statement.toLowerCase().indexOf("computer") >= 0) {
            response = "Do you like computer science?";
        }
        else if (statement.toLowerCase().indexOf("chess") >= 0) {
            response = "What is your elo?";
        }
        else if (statement.toLowerCase().indexOf("joke") >= 0) {
            response = joke();
        }
        else if (statement.toLowerCase().indexOf("thx") >= 0 ||
                 statement.toLowerCase().indexOf("thank") >= 0) {
            response = Delerandom.getRandomThanks();
        }
        else if (statement.trim().length() == 0) {
            response = "Please say something.";
        }
        else if (statement.toLowerCase().indexOf("bye") >= 0) {
            response = "Bye!";
        }
        else {
            response = getRandomResponse();
        }

        return response;
    }
    
}