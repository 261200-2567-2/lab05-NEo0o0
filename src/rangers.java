public class rangers extends RpgCharacters implements ranger {
    private bows bow;
    public rangers(int level, int baseHp, int baseMana, int baseSpeed,String name) {
        super(level, baseHp, baseMana, baseSpeed,name);
    }


    @Override
    public void shoot(RpgCharacters character) {
        super.setStat();
        setstatWp();
        if(bow!=null){
            if(Mana>10){
                if(speed*2>=character.speed){
                    double damage;
                    damage=bow.bowAtk-character.def;
                    character.Hp-=damage;
                    System.out.println(character.name+" Hp -= "+damage+" by a magic arrow!!!");

                }else{
                    System.out.println(character.name+" is too fast!!!");
                }
                Mana-=5;
            }else{
                System.out.println("Need more Mana!!!");
            }
        }else{
            System.out.println("Need bow to use shoot an arrow!!!");
        }

    }

    @Override
    public void equiqweapon(bows bow) {
        this.bow = bow;
        setstatWp();
    }

    protected void  setstatWp() {
        if(bow!=null){
            speed-=bow.weight;
        }
    }

    @Override
    public void detail() {
        super.detail();
        if(bow != null) {
            bow.detail();
        }
    }
}
