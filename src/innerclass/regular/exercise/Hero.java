package innerclass.regular.exercise;

public class Hero {

    private int ammunition;
    private Weapon weappon = new Weapon();

    public Hero(int ammunition){
        this.ammunition = ammunition;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public class Weapon{

        public void shoot(){
            ammunition--;
        }


    }



}
