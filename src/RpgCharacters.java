public class RpgCharacters implements RpgCharacter {
     protected int level;
     final int baseHp;
     final int baseMana;
     final int baseSpeed;
     protected double speed;
     protected double Hp;
     protected double Mana;
     private armors armor;
     private cloaks cloak;
     private rings ring;
     private Shoes boots;
     protected String name;
     protected double def;


     public RpgCharacters(int level, int baseHp, int baseMana,int baseSpeed,String name) {
         this.level = level;
         this.baseHp = baseHp;
         this.baseMana = baseMana;
         this.baseSpeed = baseSpeed;
         this.name = name;
         setStat();
     }

     protected void setStat(){
         Hp = baseHp*(1+0.6*level);
         Mana = baseMana*(1+0.6*level);
         speed = baseSpeed*(1+0.6*level);
         if(armor != null){
             speed-=armor.weight;
             def+=armor.def;
         }
         if(cloak != null){
             speed-=cloak.weight;
             def+=cloak.def;
         }
         if(ring != null){
             Mana+=ring.mana;
         }
         if(boots != null){
             speed+=boots.speed;
         }
     }

    @Override
    public void setLevel(int level) {
      this.level = level;
    }

    @Override
    public void equipAccessorie(Accessories accessories) {
        if(accessories instanceof rings){
            ring = (rings) accessories;
        }else
        if(accessories instanceof Shoes){
            boots = (Shoes) accessories;
        }else
        if(accessories instanceof armors){
            armor = (armors) accessories;
        }else
        if(accessories instanceof cloaks){
            cloak = (cloaks) accessories;
        }
    }



    @Override
    public void detail() {
        System.out.println(name+"------>Hp: " + Hp);
        System.out.println(name+"------>Mana: " + Mana);
        if(this.ring != null) {
            System.out.print(name+"------>Ring: ");
            ring.detail();
        }
        if(this.armor != null) {
            System.out.print(name+"------>Armor: ");
            armor.detail();
        }
        if(this.cloak != null) {
            System.out.print(name+"------>Cloak: ");
            cloak.detail();
        }
        if(this.boots != null) {
            System.out.print(name+"------>Boots: ");
            boots.detail();
        }

    }
}
