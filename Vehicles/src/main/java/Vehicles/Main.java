package Vehicles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private final static Logger log = LogManager.getLogger(Main.class);
    private static Scanner scan = new Scanner(System.in);
    private static String option;
    public static void main(String[] args)
    {
        //cars
        Car bmw = new Car(250,"BMW","AAA");
        Car mercedes = new Car(200,"Mercedes","BBB");
        //ships
        Ship ship1 = new Ship(100,"Producer1","CCC");
        Ship ship2 = new Ship(90,"Producer2","DDD");
        //planes
        Plane plane1 = new Plane(280,"Birch_tree","EEE");
        Plane plane2 = new Plane(300,"Bermuda Triangle","FFF");
        //bikes
        Bike bmx = new Bike(50,"BMX","GGG");
        Bike noname_bike = new Bike(30,"Noname","HHH");
        //list related
        List<Vehicles> list = new ArrayList<>();
        list.add(bmw);
        list.add(mercedes);
        list.add(ship1);
        list.add(ship2);
        list.add(plane1);
        list.add(plane2);
        list.add(bmx);
        list.add(noname_bike);

        //Program start
        int speed;
        String prod,name;
        do
        {
            speed=0;
            prod = "ebebe";
            name= "aaaaa";
            log.info("Choose your option (bike/car/plane/ship/all/exit): ");
            option = scan.next();
            if(option.equalsIgnoreCase("bike"))
            {
                for(Vehicles v1 : list)
                {
                    if(v1.getType() == "bike")
                    {
                        if(v1.getMax_speed()>=speed)
                        {
                            speed = v1.getMax_speed();
                            prod = v1.getProducer();
                            name = v1.getName();
                        }
                    }
                }
                log.info("Vehicle "+name+" of the producer "+prod+" is the fastest(max speed="+speed+")");
            }
            else if(option.equalsIgnoreCase("car"))
            {
               for(Vehicles v1 : list)
               {
                   if(v1.getType() == "car")
                   {
                      if(v1.getMax_speed()>=speed)
                      {
                        speed = v1.getMax_speed();
                        prod = v1.getProducer();
                        name = v1.getName();
                      }
                   }
               }
                log.info("Vehicle "+name+" of the producer "+prod+" is the fastest(max speed="+speed+")");
            }
            else if(option.equalsIgnoreCase("plane"))
            {
                for(Vehicles v1 : list)
                {
                    if(v1.getType() == "plane")
                    {
                        if(v1.getMax_speed()>=speed)
                        {
                            speed = v1.getMax_speed();
                            prod = v1.getProducer();
                            name = v1.getName();
                        }
                    }
                }
                log.info("Vehicle "+name+" of the producer "+prod+" is the fastest(max speed="+speed+")");
            }
            else if(option.equalsIgnoreCase("ship"))
            {
                for(Vehicles v1 : list)
                {
                    if(v1.getType() == "ship")
                    {
                        if(v1.getMax_speed()>=speed)
                        {
                            speed = v1.getMax_speed();
                            prod = v1.getProducer();
                            name = v1.getName();
                        }
                    }
                }
                log.info("Vehicle "+name+" of the producer "+prod+" is the fastest(max speed="+speed+")");
            }
            else if(option.equalsIgnoreCase("all"))
            {
                for(Vehicles v1 : list)
                {
                    if(v1.getMax_speed()>=speed)
                    {
                        speed = v1.getMax_speed();
                        prod = v1.getProducer();
                        name = v1.getName();
                    }
                }
                log.info("The fastest vehicle(max speed="+speed+") is "+name+" of producer "+prod);
            }
            else if(option.equalsIgnoreCase("exit"))
            {
                log.info("Exiting program");
                break;
            }
            else
            {
                log.info("WRONG OPTION!!!!");
            }
        }while(true);
    }
}