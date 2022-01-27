package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Computer intel = new Computer(10000, "Dell", "Intel PC");
        System.out.println("Current storage: " + intel.getStorageSpace());
        System.out.println("Added 5000 storage. New storage: " + intel.addStoarge(5000));
        System.out.println("Intel id: " + intel.getId());

        Laptop apple = new Laptop(1000, "Apple", "MacBook Pro", 5);
        apple.showInfo();
        System.out.println("Apple id: " + apple.getId());

        Smartphone pixel = new Smartphone(50, "Google", "Pixel", "GoogleCam");
        System.out.println(pixel.takePhoto());
        System.out.println(pixel.addStoarge(50));
        System.out.println("Pixel id: " + pixel.getId());

        Computer computer = new Computer(4500, "Acer", "B472");
        System.out.println("Current storage: " + computer.getStorageSpace());
        System.out.println("New storage: " + computer.addStoarge(5000));

        Computer laptop = new Laptop(8200, "Microsoft", "Surface", 10);
        System.out.println("Current storage: " + laptop.getStorageSpace());
        // Call to the overridden  method from the base class variable 'laptop' is polymorphic, since the type
        // of the object referenced will determine which method is actually executed
        System.out.println("New storage: " + laptop.addStoarge(10000));
    }
}
