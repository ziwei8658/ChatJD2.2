/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *             Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Zijun Wei
 * @version Dec 11/2025
 * 
 */
public class Delemar
{
    
    //instance variables
    int height;
    double weight;
    int age;
    String career;
    
    /**
     * Default constructor
     */
    public Delemar()
    {
        height = 67;
        weight = 180.0;
        age = 21;
        career = "English Professor";
    }
    /**
     * Normal constructor
     */
     public Delemar(int h, double w, int a, String c)
     {
        height = h;
        weight = w;
        age = a;
        career = c;
     }
     
/**********************mutators(setters)*****************/
    public void setHeight(int h)
    {
        height = h;
    }
    public void setWeight(double w)
    {
        weight = w;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public void setCareer(String c)
    {
        career = c;
    }
    
/************************accessers(getters)******************/
    public int getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public int getAge()
    {
        return age;
    }
    public String getCareer()
    {
        return career;
    }

//initial printouts    
    public String toString()
        {
            String str = "Configuration of Mr. Delemar: ";
            str += "\n\t Height: " + height;
            str += "\n\t Weight: " + weight;
            str += "\n\t Age: " + age;
            str += "\n\t Career: " + career + "\n";
            return str;
        }
    
    
/***********************methods***********************/
    /**
     * Get a default greeting     
     * @return a greeting
     */
     
    public String getGreeting()
    {
        return Delegreeting.getGreeting();
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        return Deleresponse.getResponse(statement);
    }
    
    public boolean essay(String type)
    {
        return Delessay.getEssay(type);
    }
    
    
    
            
        

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    
}

// this file declares the methods for the chatbot, no output
 /**
 *  Keywords  /  Responses
 * no : Why so negative?
 * mother/father : Tell me more about your family.
 * baseball/football : What position do you play?
 * brother/sister : How many siblings do you have?
 * english : Which English are you taking?
 * computer : Do you like computer science?
 * chess : What is your elo?
 * input nothing : Please say something.
 */