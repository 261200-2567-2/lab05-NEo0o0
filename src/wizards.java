public class wizards extends RpgCharacters implements wizard{
    private wands wand;
    public wizards(int level, int baseHp, int baseMana, int baseSpeed,String name) {
        super(level, baseHp, baseMana, baseSpeed,name);
    }

    @Override
    public void fireball(RpgCharacters character) {
        super.setStat();
        setstatWp();
        if(wand!=null){
            if(Mana>20){
                if(speed>=character.speed*1.2){
                    double damage;
                    damage=wand.wandAtk-character.def;
                    character.Hp-=damage;
                    System.out.println(character.name+" Hp -= "+damage+" by a fireball!!!");

                }else{
                    System.out.println(character.name+" is too fast!!!");
                }
                Mana-=5;
            }else{
                System.out.println("Need more Mana!!!");
            }
        }else{
            System.out.println("Need wand to use fireball!!!");
        }

    }

    @Override
    public void equiqweapon(wands wand) {
        this.wand = wand;
        setstatWp();

    }

    protected void setstatWp() {
        if(wand != null) {
            speed-=wand.weight;
        }
    }

    @Override
    public void detail() {
        super.detail();
        if (wand != null) {
            wand.detail();
        }

    }
}
