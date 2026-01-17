public class Test {

    public static void main (String[]args){

        //Fixed info goes in constructor

        Car car = new Car("Tata","Safari",2026);

        // Use setter for mutable data

        car.setColor("Blue") ;
        car.setSpeed(40);


        car.accelerate(1);
            System.out.println(car.getSpeed());
        }

    }

