package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private static final int ATTACK_DAMAGE = 10;
    private int numberOfAttacts = 0;

    public int getNumberOfAttacts() {
        return numberOfAttacts;
    }

    public void setNumberOfAttacts(int numberOfAttacts) {
        this.numberOfAttacts = numberOfAttacts;
    }

    public Swordsman(boolean hasArmor) {
        super(hasArmor);
    }
    public void hasArmor(){
        if(numberOfAttacts>1){
            setHasArmor(false);
        }
    }
}