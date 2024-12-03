public abstract class armors extends Accessorie implements armor {
    final int baseDef;
    protected double def;
    protected double weight;
    public armors(int lvl , int baseDef) {
        super(lvl);
        this.baseDef = baseDef;
        setStat();
    }

    private void setStat(){
        this.def = this.baseDef*(1+0.5*level);
        this.weight = this.baseDef*(1+0.3*level);
    }

    public void detail() {
        System.out.print("Armor--->Defend: " + def);
        System.out.println(" Armor--->Weight: " + weight);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }

}
