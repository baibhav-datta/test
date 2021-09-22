import java.util.*;
class vehicle{
    vehicle()
    {
        System.out.println("Vehicle is created");
    }

}
class car extends vehicle{
    car()
    {
        System.out.println("Car is created");
    }
    void getInfo(String s)
    {
        System.out.println(s+" is a car");
    }
}
class bike extends  vehicle{
    bike()
    {
        System.out.println("Bike is created");
    }
     void getInfo(String s)
    {
        System.out.println(s+" is a bike");
    }
}
public class InheritenceVehicle {
    public static void main(String args[]) {

    car c=new car();
    bike b=new bike();
    
    c.getInfo("Maruti");
    b.getInfo("Harley");


    }
}