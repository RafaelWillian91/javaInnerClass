package innerclass.regular;

public class RegularInnerClassapp3 {

    public static void main(String[] args) {

        Car car = new Car();

        //Para criar um instancia de uma classe de que uma innerClass public
        //Preciso da instancia da OuterClass, e dentro dela chamamento do new com o nome da InnerClass
        Car.Door carDoor = car.new Door();
        carDoor.open();


    }

}
