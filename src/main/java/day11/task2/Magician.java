package day11.task2;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        setPhysAtt(5);
        setMagicAtt(20);
        setMagicDef(0.8);
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
        return "Magician{" +
                "health=" + getHealth() +
                "}";
    }

}
