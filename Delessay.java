public class Delessay  //essay module
{
    public static boolean getEssay(String type)
    {
        switch (type)
        {
            case "rhetorical analysis":
                System.out.println("S: Speaker");
                System.out.println("P: Purpose");
                System.out.println("A: Audience");
                System.out.println("C: Context");
                System.out.println("E: Exigence");
                System.out.println("C: Choices");
                System.out.println("A: Appeal");
                System.out.println("T: Tone");
                System.out.println("{Thesis}\n{2/3 Rhetorical Strategies\n(Rhetorical Devices,structure, diction, tone)\n}\n{Conclusion}");
                return true;//ends the method immediately

            case "synthesis essay":
                System.out.println("This is the longest one. Spend 15 mins planning and complete it in 40 mins");
                System.out.println("{Thesis}\n{3 factors incorporating different sources}\n{Conclusion}");
                return true;
            case "argumentative essay":
                System.out.println("last one, most flexible");
                System.out.println("{Thesis}\n{Observation}\n{Reading}\n{Personal experience}\n{Conclusion}");
                return true;
            default:
                System.out.println("tell me which essay");
                System.out.println("Options:\nRhetorical Analysis\nSynthesis Essay\nArgumentative Essay");
                return false;
            
        }
    }
}