import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Fighter {

    Random random = new Random();


    private int health = 100;
    private int attack = random.nextInt(4) + 1;
    private int defence = random.nextInt(4) + 1;
    private String name;
    private String motto;

    public Fighter(String name, String motto) {
        this.health = health;
        this.name = name;
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {

        this.health = health;
    }

    public void loseHealth(int dmg){
        this.health = this.health - dmg;
        if(this.health < 1){
            System.out.println(Battle.C_RED + this.name + " got knocked the fuck out" + Battle.C_RESET);
        }
    }


    public int getAttack() {

        return attack;
    }

    public void setAttack(int attack) {

        this.attack = attack;
    }

    public int getDefence() {

        return defence;
    }

    public void setDefence(int defence) {

        this.defence = defence;
    }

    public String getMotto(){
        return motto;
    }


    /*  //skapa fighters egenskaper.
    // ju starkare gubbe man har desto mindre chans att träffa fienden?
    private String name;
    private String winningMotto;
    private int health;
    private int power;
    private int speed;
    private int defence;
    private String attackMethod;
    private String defenceMethod;


    public Fighter(String name, String winningMotto, int health, int power, int speed, int defence, String attackMethod, String defenceMethod){
        this.name = name;
        this.winningMotto = winningMotto;
        this.health = health;
        this.power = power;
        this.speed = speed;
        this.defence = defence;
        this.attackMethod = attackMethod;
        this.defenceMethod = defenceMethod;



     //   public String toString(){
       //     return "Fighter:  name: " + name + ", winning motto: " + winningMotto + ", health" +health;
       // }

    }



/*



  public void setName(String name){
        this.name = name;
        }

        public String getWinningMotto(){
        return winningMotto;
    }

        public void setWinningMotto(String winningMotto){
        this.winningMotto= winningMotto;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getDefence(){
        return defence;
    }

    public void setDefence(int defence){
        this.defence = defence;
    }

    public String getAttackMethod(){
        return attackMethod;
    }

    public void setAttackMethod(String attackMethod){
        this.attackMethod = attackMethod;
    }

    public String getDefenceMethod(){
        return defenceMethod;
    }

    public void setDefenceMethod(String defenceMethod){
        this.defenceMethod = defenceMethod;
    }
/
 */









    }

