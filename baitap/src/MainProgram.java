// MainProgram.java
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Khởi tạo vài hình
        shapes.add(new Rectangle(new Point(1, 2), 4, 5));
        shapes.add(new Square(new Point(3, 3), 6));
        shapes.add(new Circle(new Point(0, 0), 10));

        // In số lượng hình đã tạo
        System.out.println("Số lượng hình đã khởi tạo: " + Shape.getCount());

        // In chi tiết các hình
        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s.getDetail());
        }

        // In danh sách tâm điểm
        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
