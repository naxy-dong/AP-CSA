//Create an array that matches the output in the checklist
//Be sure to add Java Docs if any are missing.
class Main {
    public static void main(String[] args) {
      Plot[][] plotArr= {{new Plot("corn",20),new Plot("corn", 30),new Plot("peas",20)},
                         {new Plot("peas",30), new Plot("corn",40), new Plot("corn",62)},
                         {new Plot("wheat", 10), new Plot("corn", 50), new Plot("rice",30)},
                         {new Plot("corn",55), new Plot("corn",30), new Plot("peas",30)}};
    //Construct a new ExperimentalFarm object f
    ExperimentalFarm f = new ExperimentalFarm(plotArr);
    System.out.println("f = " + f);
    //print all the output here to match the checklist on classroom
    System.out.println("\nPart (a) - Testing getHighestYeild:");
    System.out.println("f.getHighestYeild(\"corn\") = " + f.getHighestYield("corn"));
    System.out.println("f.getHighestYeild(\"peas\") = " + f.getHighestYield("peas"));
    System.out.println("f.getHighestYeild(\"bananas\")= " + f.getHighestYield("bananas"));
  
  
    System.out.println("\nPart (b) - Testing sameCrop:");
    System.out.println("f.sameCrop(0) = " + f.sameCrop(0));
    System.out.println("f.sameCrop(1) = " + f.sameCrop(1));
    
    System.out.println("\nAdditional Testing:");
    System.out.println("f.getHighestYield(\"rice\") = " + f.getHighestYield("rice"));
    System.out.println("f.sameCrop(2) = " + f.sameCrop(2));
    }
  }