package exercises.technology;

public class Smartphone extends Computer {
    private String cameraType;
    private int numPhotos;

    public Smartphone(int storage, String aManufacturer, String aModel, String camera) {
        super(storage, aManufacturer, aModel);
        cameraType = camera;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    public int getNumPhotos() {
        return numPhotos;
    }

    public void setNumPhotos(int numPhotos) {
        this.numPhotos = numPhotos;
    }

    public int takePhoto() {
        numPhotos++;
        return numPhotos;
    }
}
