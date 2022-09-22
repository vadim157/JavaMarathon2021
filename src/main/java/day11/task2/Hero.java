package day11.task2;

public abstract class Hero implements PhysAttack {

   private int health;

   private double physDef;

   private double magicDef;

   private int physAtt;

//   private int magicAtt;

   public Hero() {
      this.health = 100;
   }

   public int getHealth() {
      return health;
   }

   public void setHealth(int health) {
      this.health = health;
   }

   public double getPhysDef() {
      return physDef;
   }

   public void setPhysDef(double physDef) {
      this.physDef = physDef;
   }

   public double getMagicDef() {
      return magicDef;
   }

   public void setMagicDef(double magicDef) {
      this.magicDef = magicDef;
   }

   public int getPhysAtt() {
      return physAtt;
   }

   public void setPhysAtt(int physAtt) {
      this.physAtt = physAtt;
   }

//   public int getMagicAtt() {
//      return magicAtt;
//   }
//
//   public void setMagicAtt(int magicAtt) {
//      this.magicAtt = magicAtt;
//   }

   @Override
   public void physicalAttack(Hero hero) {
      if (hero.getHealth() < (getPhysAtt() - (getPhysAtt() * hero.getPhysDef()))) {
         hero.setHealth(0);
      } else if (hero.getPhysDef() == 0) {
         hero.setHealth(hero.getHealth() - getPhysAtt());
      } else {
         hero.setHealth((int) (hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef()))));
      }
   }
}
