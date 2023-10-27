package homework_nr_14;

import java.util.List;

public class main {
   public static void main(String[] args) {
      Integer testIneger=10;
      Double testDouble=10.0;
      int testInt=22;
      Generic number=new Generic(testInt);
      Generic number3=new Generic(testIneger);
      Generic number4=new Generic( testDouble);

      Airplane boing =new Airplane("USA","747",4,100,"blue");
      Helicopter blackShark = new Helicopter("USSR","K19",2,1,"black");
      Car subaru = new Car("japan","WRX STI",1,4,"pink");

      GenericAirVehicles airTeam =new GenericAirVehicles("AirTeam");
      airTeam.addAirVehicleToList(boing,blackShark);
   }


}
