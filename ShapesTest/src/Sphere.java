import javax.swing.*;

public class Sphere extends Shape{

    float radius = 0;

    public Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public float surfaceArea() {
        return (float) (4 * Math.PI * (Math.pow(radius, 2)));
    }

    @Override
    public float volume() {
        return (float) (4.0 / 3.0 * Math.PI * (Math.pow(radius, 3)));
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Radius: " + getRadius() + "\n"
                + "Surface area: " + surfaceArea() + "\n"
                + "Volume: " + volume(), "Sphere", JOptionPane.INFORMATION_MESSAGE);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
