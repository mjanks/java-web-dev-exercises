package exercises.technology;

public class Laptop extends Computer {
    private int numInputs;

    public Laptop(int storage, String aManufacturer, String aModel, int inputs) {
        super(storage, aManufacturer, aModel);
        numInputs = inputs;
    }

    public void showInfo() {
        System.out.println("Manufacturer: " + this.getManufacturer());
        System.out.println("Model: " + this.getModel());
        System.out.println("Storage: " + this.getStorageSpace());
        System.out.println("Number of inputs: " + this.numInputs);
    }

    @Override
    public int addStoarge(int amountToAdd) {
        int newStorageSpace = getStorageSpace() + amountToAdd;
        System.out.println("Called from Laptop class");
        return newStorageSpace;
    }
}
