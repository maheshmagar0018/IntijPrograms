import java.util.Scanner;
class Vehicle
{
    String brand;
    String color;
    double price;
    String vModelNo;
    public void start()
    {

    }
    public void stop()
    {

    }
    public void vehicle()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1 : Twowheller ref=new Twowheeler();
                ref.twoWheller();
        }
        class Twowheeler extends Vehicle
        {
            public void twoWheller(){
                System.out.println("Twowheeler");
            }
            class Threewheeler extends Vehicle
            {

            }
            class Fourwheeler extends Vehicle
            {

            }
            class Sixwheeler extends Vehicle
            {

            }
            class Cycle extends Twowheeler
            {

            }
            class Bike extends Twowheeler
            {

            }
            class Scooty extends Twowheeler
            {

            }
            class Auto extends Threewheeler
            {

            }
            class Tumtum extends Threewheeler
            {

            }
            class Petrol extends Fourwheeler
            {

            }
            class Diesel extends Fourwheeler
            {

            }
            class Ev extends Fourwheeler
            {

            }
            class Truck extends Sixwheeler
            {

            }
            class Bus extends Sixwheeler
            {

            }
            class Hero extends Bike
            {

            }
            class Bajaj extends Bike
            {

            }
            class Honda extends Bike
            {

            }
            class Royalenfield extends Bike
            {

            }
            class Tvs extends Bike
            {

            }
            class Yamaha extends Bike
            {

            }
            class Ktm extends Bike
            {

            }
            class Audi extends Petrol
            {

            }
            class Swift extends Petrol
            {

            }
            class Alto extends Petrol
            {

            }
            class Fortuner extends Diesel
            {

            }
            class Benz extends Diesel
            {

            }
            class Innova extends Diesel
            {

            }
            class Tatanexon extends Ev
            {

            }
            class Kia extends Ev
            {

            }
            class Tesla extends Ev
            {

            }
            Class Eicher extends Track
        {

        }
            class Pulsor extends Bajaj
            {

            }
            class Platina extends Bajaj
            {

            }
            class Splender extends Honda
            {

            }
            class Shine extends Honda
            {

            }
            class Activa extends Honda
            {

            }
            class Apache extends Tvs
            {

            }
            class StarCity extends Tvs
            {

            }
            class Classic extends Royalenfield
            {

            }
            class Thunderbird extends Royalenfield
            {

            }
            class Himalayan extends Royalenfield
            {

            }
            class Intercepter extends Royalenfield
            {

            }
            class Driver
            {
                public static void main(String[] args)
                {
                    Vehicle V1=new Vehicle();
                    V1.Vehicle();
                    Vehicle V2=new Twowheeler();
                    Vehicle V3=new Threewheeler();
                    Vehicle V4=new Fourwheeler();
                    Vehicle V5=new Sixwheeler();
                    Vehicle V6=new Cycle();
                    Vehicle V7=new Bike();
                    Vehicle V8=new Scooty();
                    Vehicle V9=new Auto();
                    Vehicle V10=new Tumtum();
                    Vehicle V11=new Petrol();
                    Vehicle V12=new Diesel();
                    Vehicle V13=new Ev();
                    Vehicle V14=new Truck();
                    Vehicle V15=new Bus();
                    Vehicle V16=new Hero();
                    Vehicle V17=new Bajaj();
                    Vehicle V18=new Honda();
                    Vehicle V19=new Royalenfield();
                    Vehicle V20=new Tvs();
                    Vehicle V21=new Yamaha();
                    Vehicle V22=new Audi();
                    Vehicle V23=new Swift();
                    Vehicle V24=new Alto();
                    Vehicle V25=new Fortuner();
                    Vehicle V26=new Benz();
                    Vehicle V27=new Innova();
                    Vehicle V28=new Tatanexon();
                    Vehicle V29=new Kia();
                    Vehicle V30=new Tesla();
                    Vehicle V31=new Pulsor();
                    Vehicle V32=new Platina();
                    Vehicle V33=new Splender();
                    Vehicle V34=new Shine();
                    Vehicle V35=new Activa();
                    Vehicle V36=new Apache();
                    Vehicle V37=new StarCity();
                    Vehicle V38=new Classic();
                    Vehicle V39=new Thunderbird();
                    Vehicle V40=new Intercepter();
                    Vehicle V41=new Himalayan();
                }
            }