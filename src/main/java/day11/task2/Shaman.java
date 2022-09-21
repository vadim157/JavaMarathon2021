package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    Shaman(){
        setPhysAtt(10);
        setMagicAtt(15);
        setMagicDef(0.2);
        setPhysDef(0.2);
    }

    @Override
    public void healHimself() {
        if (getHealth() >= 50) {
            setHealth(100);
        } else {
            setHealth(getHealth() + 50);
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() >= 70) {
            hero.setHealth(100);
        } else {
            hero.setHealth(hero.getHealth() + 30);
        }


    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() < (getMagicAtt() - (getMagicAtt() * hero.getMagicDef()))) {
            hero.setHealth(0);
        } else if (hero.getMagicDef() == 0) {
            hero.setHealth(hero.getHealth() - getMagicAtt());
        } else {
            hero.setHealth((int) (hero.getHealth() - (getMagicAtt() - (getMagicAtt() * hero.getMagicDef()))));
        }

    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                "}";
    }
}
