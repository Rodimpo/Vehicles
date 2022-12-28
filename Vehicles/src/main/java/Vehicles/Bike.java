package Vehicles;

public class Bike extends Vehicles
{
    public Bike(int speed, String prod, String nam)
    {
        type = "bike";
        max_speed = speed;
        producer = prod;
        name = nam;
    }
}