import java.util.*;

public class LaptopFil {
   private Set<Laptops> laptops = new HashSet<>();
   public void addLaptops(Laptops laptop){
      laptops.add(laptop);
   }
   public void filterLaptop(Map<Object,Object> filters){

   }
   public void filterAndPrint(Map<String, Object> filters) {
      List<Laptops> filteredLaptops = new ArrayList<>();

      for (Laptops laptop : laptops) {
         boolean passFilter = true;
         for (Map.Entry<String, Object> entry : filters.entrySet()) {
            switch (entry.getKey()) {
               case "Names":
                  if(!laptop.getNames().equals(entry.getValue())){
                     passFilter = false;
                  }
               case "RAM":
                  if (laptop.getRAM() < (int) entry.getValue()) {
                     passFilter = false;
                  }
                  break;
               case "RailwayVolume":
                  if (laptop.getRailwayVolume() < (int) entry.getValue()) {
                     passFilter = false;
                  }
                  break;
               case "Os":
                  if (!laptop.getOs().equals(entry.getValue())) {
                     passFilter = false;
                  }
                  break;
               case "Processor":
                  if (laptop.getProcessor() < (int) entry.getValue()) {
                     passFilter = false;
                  }
                  break;
            }
         }
         if (passFilter) {
            filteredLaptops.add(laptop);
         }
      }

      for (Laptops laptop : filteredLaptops) {
         System.out.println(laptop);
      }
   }
}
