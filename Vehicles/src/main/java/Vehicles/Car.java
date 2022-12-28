package Vehicles;

public class Car extends Vehicles
{
    public Car(int speed, String prod, String nam)
    {
        type = "car";
        max_speed = speed;
        producer = prod;
        name = nam;
    }
}