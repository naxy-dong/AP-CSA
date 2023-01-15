class Main {
    public static void main(String[] args) {
      LightSequence gradShow = new LightSequence("0101 0101 0101");
      gradShow.display();
      gradShow.changeSequence("0011 0011 0011");
      gradShow.display();
      String resultSeq = gradShow.insertSegment("1111 1111", 4);
      gradShow.display();
  
      String test1 = gradShow.removeFirstOccurrence("1100000111", "11");
      String test2 = gradShow.removeFirstOccurrence("0000011", "11");
      String test3 = gradShow.removeFirstOccurrence("1100000111", "00");
      String test4 = gradShow.removeFirstOccurrence("11111", "00");
  
      System.out.println("test1:" + test1);
      System.out.println("test2:" + test2);
      System.out.println("test3:" + test3);
      System.out.println("test4:" + test4);
  
      double distance1 = gradShow.calculateLightDistance(10,0,0,10);
      System.out.println("distance between (10, 0) and (0, 10) is" + distance1);
    }
  }