package homework_nr_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericAirVehicles {

   String airTeam;
   List<Vehicle>airVehicleList;

   public GenericAirVehicles(String airTeam) {
      this.airTeam = airTeam;
     this.airVehicleList=new ArrayList<>();
   }

   public <T extends Vehicle & AirVehicle>void addAirVehicleToList(T... inputVehicle){
       Collections.addAll(airVehicleList, inputVehicle);
   }

}




