//5. Achieve multiple inheritance using any real-time example
interface Car1
{
    static int  speed=60;
    public void speed();

}
interface Bus
{
    static int distance=100;
    public void distanceTravelled();
}
class Vehicle1  implements Car1,Bus
{
    double distanceTravelled;
    double averageSpeed;
    public void distanceTravelled()
    {
        distanceTravelled=speed*distance;
        System.out.println("Total Distance Travelled is : "+distanceTravelled);
    }
    public void speed()
    {
        double averageSpeed=distanceTravelled/speed;
        System.out.println("Average Speed is : "+averageSpeed);
    }
    public static void main(String [] args)
    {
        Vehicle1 v1=new Vehicle1();
        v1.distanceTravelled();
        v1.speed();
    }
}