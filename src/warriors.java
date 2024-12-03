public class warriors extends RpgCharacters implements warrior{
    private swords sword;
    private shields shield;
    public warriors(int level, int baseHp, int baseMana, int baseSpeed,String name) {
        super(level, baseHp, baseMana, baseSpeed,name);
    }

    @Override
    public void slash(RpgCharacters character) {
        super.setStat();
        setstatWp();
        if(sword!=null){
            if(Mana>5){
                if(speed>=character.speed){
                    double damage;
                    damage=sword.swordAtk-character.def;
                    character.Hp-=damage;
                    System.out.println(character.name+" Hp -= "+damage+" by slash!!!");

                }else{
                    System.out.println(character.name+" is too fast!!!");
                }
                Mana-=5;
            }else{
                System.out.println("Need more Mana!!!");
            }
        }else{
            System.out.println("Need sword to use slash!!!");
        }


    }

    @Override
    public void equiqweapon(swords sword) {
        this.sword = sword;
        setstatWp();

    }

    @Override
    public void equiqweapon(shields shield) {
        this.shield = shield;
        setstatWp();

    }


    protected void setstatWp() {
        if(shield!=null){
            speed-=shield.weight;
            def+=shield.shieldDef;
        }
        if(sword!=null){
            speed+=sword.weight;
        }

    }

    @Override
    public void detail() {
        super.detail();
        if(sword != null) {
            sword.detail();
        }
        if(shield != null) {
            shield.detail();
        }
    }
}
