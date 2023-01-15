class Main {
    public static void main(String[] args) {
      System.out.println("PartA:\nPossiblenames for johnsmith");
      Username smithUN = new Username("john", "smith"); 
      String[] used1 = {"smithn", "smithh", "smithj", "smithjo"};
      System.out.println("PartB:");
      System.out.println("Before:" + smithUN.getPossibleNames());
      smithUN.setAvailableUserNames(used1);
      System.out.println("After:" + smithUN.getPossibleNames());
  
      System.out.println("\nPartA:");
      Username dorothyUN = new Username("dorothy","vaughan");
      String[] used2 = {"vaughand", "vaughanod"};
      System.out.println("PartB:");
      System.out.println("Before:" + dorothyUN.getPossibleNames());
      dorothyUN.setAvailableUserNames(used2);
      System.out.println("After:" + dorothyUN.getPossibleNames());
    }
  }