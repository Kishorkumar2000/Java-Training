//4. Create a base class- Vehicle with final and non-final methods. Create a child class- Car that extends the base class and try overriding the final and non-final methods. Compile and see what happens.

//Then, make the parent class Vehicle to be final and try extending the parent from another child Bike. Interpret the results.
public class Vehicle
{
    public final void nameOfVehicle()
    {
        System.out.println("Not Specified");
    }
    public void priceOfVehicle()
    {
        System.out.println("Not Lesser Than RS.1");
    }
    static class Car extends Vehicle
    {
//        public void nameOfVehicle()
//        {
//            System.out.println("Car");
//        }

        @Override
        public void priceOfVehicle()
        {
            System.out.println("Rs.1000000");
        }
    }
    static class Bike extends Vehicle
    {
//        public void nameOfVehicle()
//        {
//            System.out.println("Bike");
//       }

        @Override
        public void priceOfVehicle()
        {
            System.out.println("Rs.50000");
        }
    }
}