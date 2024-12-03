public class cloaks extends Accessorie implements cloak{
    final int baseDef;
    protected double def;
    protected double weight;
    public cloaks(int lvl, int baseDef) {
        super(lvl);
        this.baseDef = baseDef;
        setStat();
    }

    private void setStat(){
        this.def = this.baseDef*(1+0.3*level);
        this.weight = this.baseDef*(1+0.15*level);
    }


    public void detail() {
        System.out.print("Cloak--->Defend: " + def);
        System.out.println(" Cloak--->Weight: " + weight);
    }


    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }
}
