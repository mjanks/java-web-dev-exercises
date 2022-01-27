package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Laptop apple = new Laptop(1000, "Apple", "MacBook Pro", 5);
        apple.showInfo();

        Smartphone pixel = new Smartphone(50, "Google", "Pixel", "GoogleCam");
        System.out.println(pixel.takePhoto());
        System.out.println(pixel.addStoarge(50));
    }
}
