import javax.swing.*;

public class Cylinder extends Shape{

    float radius = 0;
    float height = 0;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float surfaceArea() {
        return (float) (2 * (Math.PI) * radius * height + 2*Math.PI * (Math.pow(radius, 2)));
    }

    @Override
    public float volume() {
        return (float) (Math.PI * (Math.pow(radius, 2)) * height);
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Radius: " + getRadius() + "\n"
                                        + "Height: " + getHeight() + "\n"
                                        + "Surface area: " + surfaceArea() + "\n"
                                        + "Volume: " + volume(), "Cylinder", JOptionPane.INFORMATION_MESSAGE);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
