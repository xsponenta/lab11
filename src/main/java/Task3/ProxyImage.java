package Task3;

public class ProxyImage implements MyImage{

    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        RealImage realImage = new RealImage(fileName);
        realImage.display();
    }
}