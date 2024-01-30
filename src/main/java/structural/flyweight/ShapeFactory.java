package structural.flyweight;

import java.awt.*;
import java.util.HashMap;

public class ShapeFactory {
    private static HashMap<Color, Shape> shapeList = new HashMap<>();
    public static Shape createShape(Color color)
    {
        Shape shape = shapeList.get(color);
        if(shape==null)
        {
            shape = new Shape(color);
            shapeList.put(color,shape);
            System.out.println("Var olmadığı için yeni bir instance üretildi +24 bytes.");
        }
        return shape;
    }
}
