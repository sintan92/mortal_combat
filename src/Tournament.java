import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tournament {
    Fighter fighter1;
    Fighter fighter2;

    Match match = new Match();
    Battle battle = new Battle();
    Scanner scanner = new Scanner(System.in);



    public void fight() {

        match.SQL();


        do {
            for (int i = 0; i < match.getTotalFighters(); i++) {
                System.out.println("\n" + match.fighters.get(i).getName() + "\nhp: " + match.fighters.get(i).getHealth());
            }
            for (int i = 0; i < match.getTotalFighters(); i = i + 2) {

                //Fighter fighter1 = match.ran(match.getTotalFighters());
                //Fighter fighter2 = match.ran(match.getTotalFighters());
                this.fighter1 = match.fighters.get(i);
                this.fighter2 = match.fighters.get(i + 1);

                battle.battle(this.fighter1, this.fighter2);
            }

            System.out.println( battle.C_RED + "These are this rounds losers!\n Eliminated!" + battle.C_RESET);

            List<Fighter> remainingFighters = new ArrayList<>();

            for (int i = 0; i < match.getTotalFighters(); i++) {
                if (match.fighters.get(i).getHealth() <= 0) {
                    System.out.println(match.fighters.get(i).getName() + " " + match.fighters.get(i).getHealth());
                } else {
                    match.fighters.get(i).setHealth(100);
                    remainingFighters.add(match.fighters.get(i));
                }
            }
            System.out.println("-----------------------\n");
            match.fighters = (ArrayList<Fighter>) remainingFighters;
        }

                while (match.fighters.size() > 1) ;

                System.out.println("THE TRUE CAHMPION IS " +
                        match.fighters.get(0).getName().toUpperCase() + "!!!!!!!!!!!!!!!");

            }
        }











