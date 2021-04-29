package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public List<MilitaryUnit> damageAll(int damage) {
        for (MilitaryUnit unit : army) {
            unit.setVitality(unit.getVitality() - damage);
            if (unit.getVitality() < 25) {
                army.remove(unit);
            }
        }
        return army;
    }

    public int getArmyDamage() {
        int actualDamage = 0;
        for (MilitaryUnit unit : army) {
            actualDamage += unit.getHitPoints();
        }
        return actualDamage;
    }

    public int getArmySize() {
        return army.size();
    }
}

