public class rings  extends Accessorie implements ring{
    final int basemana;
    protected double mana;
    public rings(int lvl, int basemana) {
        super(lvl);
        this.basemana = basemana;
        setStat();
    }

    private void setStat(){
        this.mana = this.basemana*(1+0.5*level);
    }


    public void detail() {
        System.out.println("Ring--->Mana: " + mana);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }
}
