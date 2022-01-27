package exercises.technology;

public class Smartphone extends Computer {
    private String cameraType;
    private int numPhotos;

    public Smartphone(int storage, String aManufacturer, String aModel, String camera) {
        super(storage, aManufacturer, aModel);
        cameraType = camera;
    }

    public int takePhoto() {
        numPhotos++;
        return numPhotos;
    }
}
