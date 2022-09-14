public class ShapesTest {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(2, 3);
        Cuboid c2 = new Cuboid(4, 5, 6);
        Sphere s1 = new Sphere(7);

        c1.render();
        c2.render();
        s1.render();

    }

}
