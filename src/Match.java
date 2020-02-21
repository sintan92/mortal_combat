import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Match {

    Random random = new Random();
    ArrayList<Fighter> fighters = new ArrayList<>();
    private int totalFighters;


    public void SQL(){

        Connection myConn;
        Statement myStmt;
        ResultSet myRs;
        String dbUrl = "jdbc:mysql://localhost:3306/mortal_combat";
        String user = "root";
        String pass = "Vaggen92";


try {

    //1. Anslut till databasen
    myConn = DriverManager.getConnection(dbUrl, user, pass);
    System.out.println("Anslutningen lyckades!" + '\r');

    //2. Skapa ett statement
    myStmt = myConn.createStatement();
    System.out.println("Statement skapat!" + '\r');

    //3. Kör en sql fråga.
    myRs = myStmt.executeQuery("select name from characters");
    System.out.println("Frågan har tagits emot av databasen!" + '\r');

    //4. processa resultatsettet.
    while (myRs.next()) {
        fighters.add(new Fighter(myRs.getString("name")));
        this.totalFighters++;
        // System.out.println(myRs.getString("name"));


    }

    for (int i = 0; i < fighters.size(); i++) {
        System.out.println(fighters.get(i).getName());
        System.out.println(fighters.get(i).getAttack());
        System.out.println(fighters.get(i).getDefence());

    }
        }
catch (Exception e){
    e.printStackTrace();
        }
    }
    public Fighter ran(int num){
        return fighters.get(random.nextInt(num));
    }

    public int getTotalFighters(){
        return totalFighters;
    }
}