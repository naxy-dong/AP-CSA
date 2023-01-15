//A project made by YuXiang, Michelle, and Clara!

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.introduce();
    p1.eat();
    p1.walk();
    
    System.out.print("\n\n");
    
    Person p2 = new Person("John Doe");
    p2.introduce();
    p2.eat();
    p2.walk();

    System.out.print("\n\n");

    Person p3 = new Person("John Doe",20,"Black","Teacher");
    p3.introduce();
    
    // Scanner jIn = new Scanner(System.in);
    // int commandNum;
    // do{
    //   System.out.println("Welcome to your new human! Press 1 to have your human introduce themself. Press 2 to have them eat. Press 3 to have them walk. Press 4 to leave the game.");
    //   commandNum = jIn.nextInt();
    //   if(commandNum==1)
    //   {
    //     p.introduce();
    //   }else
    //     if(commandNum==2)
    //     {
    //       p.eat();
    //     }else
    //       if(commandNum==3)
    //       {
    //         p.walk();
    //       }
    // }while(commandNum != 4);
  }
}