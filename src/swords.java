public class swords extends weapons implements sword {
    final int baseAtk;
    protected double swordAtk;
    protected double weight;
    public swords(int lvl,int baseAtk) {
        super(lvl);
        this.baseAtk = baseAtk;
        setStat();
    }

    public void setStat() {
        this.swordAtk = baseAtk*(1+0.4*level);
        this.weight = baseAtk*(0.3+0.01*level);
    }

    @Override
    public void detail() {
        System.out.println("Sword--->Attack: " + swordAtk);
        System.out.println("Sword--->Weight: " + weight);

    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }
}
