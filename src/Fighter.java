import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Fighter {

    Random random = new Random();


    private int health = 100;
    private int attack = 10;
    private int defence = 5;
    private String name;

    public Fighter(String name) {
        this.health = health;
        this.attack = random.nextInt(attack);
        this.defence = random.nextInt(defence);
        this.name = name;
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

    public void loseHealth(int health){
        this.health = this.health - health;
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

