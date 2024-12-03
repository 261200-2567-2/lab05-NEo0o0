public class bows extends weapons implements bow {

    final int baseAtk;
    protected double bowAtk;
    protected double weight;

    public bows(int lvl, int baseAtk) {
        super(lvl);
        this.baseAtk = baseAtk;
        setStat();
    }

    public void setStat() {
        this.bowAtk = baseAtk*(1+0.4*level);
        this.weight = baseAtk*(0.2+0.008*level);
    }

    @Override
    public void detail() {
        System.out.println("Bow--->Attack: " + bowAtk);
        System.out.println("Bow--->Weight: " + weight);
        
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }
}
