public class Main {
    public static void main(String[] args) {
        PowerOutlet laptopOutlet = new LaptopAdapter(new Laptop());
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(new Refrigerator());
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(new SmartphoneCharger());

        laptopOutlet.plugIn();
        refrigeratorOutlet.plugIn();
        smartphoneOutlet.plugIn();
    }
}