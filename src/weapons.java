public class weapons implements weapon{
    protected int level;

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    public weapons(int lvl) {
        setLevel(lvl);
    }
}
