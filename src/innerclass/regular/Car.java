package innerclass.regular;

public class Car {

    private int speed;
    //Quando a outerClass é criada é tambem criada a innerClass
    private Engine engine = new Engine();
    private boolean on;

    public void accelerate(){
        engine.injectFuel();
    }

    public int getSpeed() {
        return speed;
    }

    //Ao deixar a innerClass private é mantido o encapsulamento da mesma. Não faz sentido existir instancia de Engine nesse contexto
    private class Engine {
        private boolean on;
          public void injectFuel(){
              speed += +10;
          }
          public boolean isAllon(){
              return on && Car.this.on;
          }


       }

       public class Door{

        private boolean isOpen;

        public void open(){
            this.isOpen = true;
            //Todas as innerClass tem acesso as instâncias criadas na outerClass
            //engine.injectFuel();
           }
        public void close(){
               this.isOpen = false;
           }

       }

}
