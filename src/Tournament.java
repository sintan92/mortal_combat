import java.util.List;
import java.util.Scanner;

public class Tournament {
    Database database = new Database();
  Scanner sc = new Scanner(System.in);


  private int round = 0;
  private int totalFighter;
  private int getTotalFighter;
  private List<Fighter> allFighters;



  public void fight(){

      database.SQL();


      for (int i = 0; i <database.getTotalFighters()/2 ; i++) {

          Fighter fighter1 = database.ran(database.getTotalFighters());
          Fighter fighter2 = database.ran(database.getTotalFighters());

          System.out.println("\nThe battle is between " + fighter1.getName() + " and " + fighter2.getName());
          sc.nextLine();
          System.out.println();

          while(fighter2.getHealth() > 0 && fighter1.getHealth() > 0){
              System.out.println(fighter1.getName() + " attacks with " + fighter1.getAttack());
              System.out.println(fighter2.getName() + " lost " + fighter1.getAttack() + " hp" + fighter2.getName() +
                      " has " + fighter2.getHealth() + " hp left");

              if(fighter1.getHealth() < 1 || fighter2.getHealth() < 1){
                  break;
              }
              System.out.println(fighter2.getName() + " attacks with " + fighter2.getAttack());
              System.out.println(fighter1.getName() + " lost " + fighter2.getAttack() + " hp" + fighter1.getName() +
                      " has " + fighter1.getHealth() + " hp left");

              System.out.println();
          
      }
          
      }
  }


}
