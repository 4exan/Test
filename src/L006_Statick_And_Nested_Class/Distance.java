package L006_Statick_And_Nested_Class;

public class Distance {

   static double distance;

    void print(){

    }

    static class Converter{
        void meterToKilometer(Double distance){
            System.out.println("Meter to Kilometer: " + distance/1000 + " km;");
        }
        void meterToMiles(Double distance){
            System.out.println("Meter to Miles: " + distance*0.0006 + " miles;");
        }
        void meterToSantimeter(Double distance){
            System.out.println("Meter to Santimeter: " + distance*100 + " Santimeters;");
        }
    }

}
