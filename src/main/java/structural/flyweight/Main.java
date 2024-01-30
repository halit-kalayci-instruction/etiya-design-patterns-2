package structural.flyweight;

import org.openjdk.jol.info.ClassLayout;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // RAM

        // 1.000.000

        // Java Object Layout
   /*     String shapeInfo = ClassLayout.parseInstance(shape).toPrintable();
        System.out.println(shapeInfo);
*/
        Color colors[] = {Color.BLACK, Color.BLUE, Color.GREEN, Color.GRAY};
        for (int i = 0; i < 1000; i++)
        {
            Shape shape = ShapeFactory.createShape(colors[(int)(Math.random() * colors.length)]);
            shape.setX((int) (Math.random() * 500));
            shape.setY((int) (Math.random() * 500));
            shape.draw();
        }
    }
}
