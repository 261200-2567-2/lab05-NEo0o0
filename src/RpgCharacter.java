public interface RpgCharacter{
    void setLevel(int level);
    void equipAccessorie(Accessories accessories);
    void detail();
}

interface warrior extends RpgCharacter{
    void slash(RpgCharacters character);
    void equiqweapon(swords sword);
    void equiqweapon(shields shield);
}

interface wizard extends RpgCharacter{
    void fireball(RpgCharacters character);
    void equiqweapon(wands wand);
}

interface ranger extends RpgCharacter{
    void shoot(RpgCharacters character);
    void equiqweapon(bows bow);
}