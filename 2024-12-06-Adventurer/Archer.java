public class Archer extends Adventurer{
  private int special = 0;
  private int specialMax = 50;
  public String getSpecialName(){
    return "Ammo";
  };
  //accessor methods
  public int getSpecial(){
    return special;
  }
  public void setSpecial(int n){
    special = n;
  }
  public int getSpecialMax(){
    return specialMax;
  }
  public String attack(Adventurer other){
    other.applyDamage(10);
    setSpecial(getSpecial - 1);
    return "Attacked " + other + " for 10 damage!\n" + getSpecialName() + " reduced by 1";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
      other.setHP(other.getHP() + 10);
      return "Shot " + other + " with a Healing Arrow!\n" + "Healed for 10 HP";
  }

  //heall or buff self
  public String support(){
      setSpecial(getSpecial + 3);
      return "Reloaded!\n" + getSpecialName() + " increased by 3";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    other.applyDamage(100);
    setSpecial(getSpecial() - 10);
    return "Rapid Fire at " + other + " for 100 damage!\n" + getSpecialName() +  " reduced by 10";
  }
}
