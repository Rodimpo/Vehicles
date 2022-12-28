package Vehicles;

public class Plane extends Vehicles
{
    public Plane(int speed, String prod, String nam)
    {
        type = "plane";
        max_speed = speed;
        producer = prod;
        name = nam;
    }
}