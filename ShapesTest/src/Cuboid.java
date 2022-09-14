import javax.swing.*;

public class Cuboid extends Shape {

    float width = 0;
    float height = 0;
    float depth = 0;

    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public float surfaceArea() {
        return 2 * width * height + 2 * depth * width + 2 * depth * height;
    }

    @Override
    public float volume() {
        return width * height * depth;
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Width: " + getWidth() + "\n"
                + "Height: " + getHeight() + "\n"
                + "Depth: " + getDepth() + "\n"
                + "Surface area: " + surfaceArea() + "\n"
                + "Volume: " + volume(), "Cuboid", JOptionPane.INFORMATION_MESSAGE);
    }

    public float getWidth() {
        return width;
    }

    private void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    private void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    private void setDepth(float depth) {
        this.depth = depth;
    }
}
