package exercises.technology;

public class Computer extends AbstractEntity {
    private int storageSpace;
    private String manufacturer;
    private String model;
    private boolean isOn;

    public Computer(int storage, String aManufacturer, String aModel) {
        storageSpace = storage;
        manufacturer = aManufacturer;
        model = aModel;
    }

    public int getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean power(boolean status) {
        isOn = status;
        return isOn;
    }

    public int addStoarge(int amountToAdd) {
        storageSpace += amountToAdd;
        return storageSpace;
    }
}
