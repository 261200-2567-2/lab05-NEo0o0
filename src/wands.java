public class wands extends weapons implements wand{
    final int baseAtk;
    protected double wandAtk;
    protected double weight;
    public wands(int lvl,int baseAtk) {
        super(lvl);
        this.baseAtk = baseAtk;
        setStat();
    }

    public void setStat() {
        this.wandAtk = baseAtk*(1+0.4*level);
        this.weight = baseAtk*(0.2+0.008*level);
    }

    @Override
    public void detail() {
        System.out.println("Wand--->Attack: " + wandAtk);
        System.out.println("Wand--->Weight: " + weight);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }
}
