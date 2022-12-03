public class Wipro_Driver
{
    public static void main(String [] args)
    {
        Wipro o1= new Wipro("Robert","Manager",1,8.75);
        o1.detailsOfEmployee();
        Wipro.WiproTech o2= new Wipro.WiproTech("Daniel", "Software Developer", 2, 6.00);
        o2.detailsOfWiproTechEmployee();
        Wipro.WiproTech.WiproInfo o3= new Wipro.WiproTech.WiproInfo("Kish", "Software Tester",3, 4.00);
        o3.detailsOfWiproInfoEmployee();
        Wipro.WiproTech.WiproInfo.WiproBPO o4= new Wipro.WiproTech.WiproInfo.WiproBPO("Mary", "Voice Assistant", 4, 2.5);
        o4.detailsOfWiproBPOEmployee();
    }
}