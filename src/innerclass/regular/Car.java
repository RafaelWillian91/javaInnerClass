package innerclass.regular;

public class Car {

    private int speed;
    //Quando a outerClass é criada é tambem criada a innerClass
    private Engine engine = new Engine();

    public void accelerate(){
        engine.injectFuel();
    }

    public int getSpeed() {
        return speed;
    }

    //Ao deixar a innerClass private é mantido o encapsulamento da mesma. Não faz sentido existir instancia de Engine nesse contexto
    private class Engine {
          public void injectFuel(){
              speed += +10;
          }

       }

       public class Door{

        private boolean isOpen;

        private void setOpen(){
            this.isOpen = true;
           }
        private void setClose(){
               this.isOpen = false;
           }

       }

}
