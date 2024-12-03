public interface weapon {
    public void setLevel(int level);
}

interface sword extends weapon {
    public void detail();
}

interface shield extends weapon {
    public void detail();
}

interface bow extends weapon {
    public void detail();
}

interface wand extends weapon {
    public void detail();
}