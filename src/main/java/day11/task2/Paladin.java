package day11.task2;

public class Paladin extends Hero implements Healer {

    Paladin() {
        setPhysAtt(15);
        setMagicDef(0.2);
        setPhysDef(0.5);
    }

    @Override
    public void healHimself() {
        if (getHealth() >= 75) {
            setHealth(100);
        } else {
            setHealth(getHealth() + 25);
        }
    }

        @Override
        public void healTeammate (Hero hero){
            if (hero.getHealth() >= 90) {
                setHealth(100);
            } else {
                hero.setHealth(hero.getHealth() + 10);
            }
        }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                "}";
    }
}
