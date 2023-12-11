public abstract class Pokemon {

    private String name;
    private String type;
    private int level;
    private int xp;
    private int hp;
    private int attack;
    private int special;
    private int defence;
    private int accuracy;
    private double height;

    protected Pokemon(String name, String type, int level, int xp, int hp, int attack, int special, int defence, int accuracy, double height) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.xp = xp;
        this.hp = hp;
        this.attack = attack;
        this.special = special;
        this.defence = defence;
        this.accuracy = accuracy;
        this.height = height;
    }

    //    Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpecial() {
        return special;
    }

    public int getDefence() {
        return defence;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public double getHeight() {
        return height;
    }

//    Setters if I'm correct could be used for stats that could change during battle of after battles?

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setHeight(double height) {
        this.height = height;

    }

//    Methods

    public void choice(){
        System.out.print("Your Choice Is = ");
    }

    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", xp=" + xp +
                ", hp=" + hp +
                ", attack=" + attack +
                ", special=" + special +
                ", defence=" + defence +
                ", accuracy=" + accuracy +
                ", height=" + height +
                '}';
    }


    public void specialattack(){
        System.out.println("Has no special attack");
    }



}