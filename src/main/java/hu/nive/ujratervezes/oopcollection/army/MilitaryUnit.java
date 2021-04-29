package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int vitality;
    private int attackDamage;
    private boolean hasArmor;

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getHitPoints() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public MilitaryUnit(boolean hasArmor) {

        this.hasArmor = hasArmor;
    }

    public void setHasArmor(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }

    public MilitaryUnit() {
    }

    public int doDamage() {
        return attackDamage;
    }

    public void sufferDamage(int damage) {
        if (hasArmor) {
            setVitality(vitality - ((int) damage / 2));
        } else {
            setVitality(vitality - damage);
        }

    }

}
