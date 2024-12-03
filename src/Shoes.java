public class Shoes extends Accessorie implements boot{
    final int baseSpeed;
    protected double speed;
    public Shoes(int lvl, int baseSpeed) {
        super(lvl);
        this.baseSpeed = baseSpeed;
        setStat();
    }

    private void setStat(){
        this.speed = this.baseSpeed*(1+0.5*level);
    }


    public void detail() {
        System.out.println("Boots--->Speed: " + speed);
    }


    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        setStat();
    }
}
