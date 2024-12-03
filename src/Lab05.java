public class Lab05 {
    public static void main(String[] args) {
        warriors A=new warriors(20,20,20,20,"ekko");
        rangers B=new rangers(20,20,20,20,"jinx");
        wizards C=new wizards(20,20,20,20,"viktor");
        A.slash(B);
        swords D= new swords(10,5);
        A.equiqweapon(D);
        A.slash(C);
        A.detail();
        D.setLevel(20);
        A.slash(B);
        A.detail();
        C.setLevel(20);
        wands E =new wands(10,5);
        C.equiqweapon(E);
        C.fireball(A);
        A.detail();
        rings F =new rings(10,5);
        Shoes G =new Shoes(10,5);
        cloaks H =new cloaks(10,5);
        C.equipAccessorie(F);
        C.equipAccessorie(G);
        C.equipAccessorie(H);
        C.detail();


    }
}
