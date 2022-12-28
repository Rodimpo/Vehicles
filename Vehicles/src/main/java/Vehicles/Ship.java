package Vehicles;

public class Ship extends Vehicles
{
    public Ship(int speed, String prod, String nam)
    {
        type = "ship";
        max_speed = speed;
        producer = prod;
        name = nam;
    }
}