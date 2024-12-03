public class Accessorie implements Accessories {
    protected int level;
    public Accessorie(int lvl) {
        setLevel(lvl);
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
