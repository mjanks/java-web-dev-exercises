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
    }
}
