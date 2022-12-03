public class Car_Driver
{
    public static void main(String [] args)
    {
        Vehicle o1= new Vehicle();
        o1.nameOfVehicle();
        o1.priceOfVehicle();
        Vehicle.Car o2= new Vehicle.Car();
        o2.priceOfVehicle();
        o2.nameOfVehicle();
        Vehicle.Bike o3= new Vehicle.Bike();
        o3.priceOfVehicle();
        o3.nameOfVehicle();
    }

}