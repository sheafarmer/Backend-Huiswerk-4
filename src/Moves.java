public abstract class Moves {
    private int moveAttack;
    private int moveAccuracy;
    private int moveDamage;

    public Moves(int moveAttack, int moveAccuracy, int moveDamage) {
        this.moveAttack = moveAttack;
        this.moveAccuracy = moveAccuracy;
        this.moveDamage = moveDamage;
    }

    public int getMoveAttack() {
        return moveAttack;
    }

    public int getMoveAccuracy() {
        return moveAccuracy;
    }

    public int getMoveDamage() {
        return moveDamage;
    }

//    Setters in case a debuff was used like sand attack which lowers accuracy?

    public void setMoveAttack(int moveAttack) {
        this.moveAttack = moveAttack;
    }

    public void setMoveAccuracy(int moveAccuracy) {
        this.moveAccuracy = moveAccuracy;
    }

    public void setMoveDamage(int moveDamage) {
        this.moveDamage = moveDamage;
    }


}
