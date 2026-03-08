public class App {
    public static void main(String[] args) throws Exception {
        
        Car myCar = new Car();
        Car myHonda = new Car("Honda", "Brio", "Yellow", 150);

        System.out.println(myHonda.getBrand());
    }
}