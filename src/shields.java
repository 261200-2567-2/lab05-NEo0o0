public class shields extends weapons implements shield{
    final int baseDef;
    protected double shieldDef;
    protected double weight;
    public shields(int lvl,int baseDef) {
        super(lvl);
        this.baseDef = baseDef;
        setStat();
    }

    public void setStat() {
        this.shieldDef = baseDef*(1+0.4*level);
        this.weight = baseDef*(0.5+0.02*level);
    }

    @Override
    public void detail() {
        System.out.println("Shield--->Defend: " + shieldDef);
        System.out.println("Shield--->Weight: " + weight);

    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }
}
