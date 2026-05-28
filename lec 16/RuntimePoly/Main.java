
public class Main {

    public static void main(String[] args) {
        System.out.println("Main file!!!!");

        Circle c = new Circle();
        c.draw();

        Shape s = new Shape();
        doDrawing(s);
        
        
    }

    //  Dynamic method dispatch(up-casting)
    public static void doDrawing(Shape s ){
        s.draw();
    }
}
