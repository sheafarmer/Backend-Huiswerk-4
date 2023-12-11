public class GrassPokemon extends Pokemon{

    //    Could place an arraylist for all grass type pokemons??
    private boolean effective;
    private String sound;
    public GrassPokemon(String name, String type, int level, int xp, int hp, int attack, int special, int defence, int accuracy, double height, String sound) {
        super(name, type, level, xp, hp, attack, special, defence, accuracy, height);
        this.sound = sound;
    }

//    Getters

    public boolean isEffective() {
        return effective;
    }

    public String getSound() {
        return sound;
    }


//    Still needs SETTERS

    public void setEffective(boolean effective) {
        this.effective = effective;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


//    Still needs METHODS

    public void favoritefood(){
        System.out.println("grass");
    }

    //    Not sure if this counts as a universal override?
    public void specialattack(){
        System.out.println("LEAFSTORMMM");
    }


}
