import java.awt.*;
import java.util.*;

public class Figures {
    private Square[] squares;
    private Rectangle[] rectangles;
    private Circle[] circles;
    private Triangle[] triangles;
    private Trapeze[] trapezes;

    public Figures() {
        squares = new Square[50];
        rectangles = new Rectangle[50];
        circles = new Circle[50];
        triangles = new Triangle[50];
        trapezes = new Trapeze[50];
    }
    public Square randomSquare(){
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 750);
        int size = (int) (Math.random() * 50 + 5);
        String color = randomColor();
        Square square = new Square(size, posX, posY,color);
        return square;
    }

    public Circle randomCircle(){
        int diameter = (int) (Math.random() * 50 + 5);
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 750);
        String color = randomColor();
        Circle circle = new Circle(diameter, posX, posY, color);
        return circle;
    }

    public Triangle randomTriangle(){
        int posX = (int) (Math.random() * 750);
        int posY= (int) (Math.random() * 750);
        int width=(int) (Math.random() * 50 + 5);
        int length = (int) (Math.random() * 50 + 5);
        String color = randomColor();
        Triangle triangle = new Triangle(width, length, posX, posY, color);
        return triangle;
    }

    public Rectangle randomRectangle(){
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        int width = (int) (Math.random() * 50 + 5);
        int length = (int) (Math.random() * 100 + 5);
        String color = randomColor();
        Rectangle rectangle = new Rectangle(width, length, posX, posY, color);
        return rectangle;
    }

    public Trapeze randomTrapeze(){
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 750);
        int width = (int) (Math.random() * 50 + 5);
        int length = (int) (Math.random() * 40 + 5);
        String color = randomColor();
        Trapeze trapeze = new Trapeze(length, width, posX, posY, color);
        return trapeze;
    }

    public String randomColor(){
        String color;
        int option = (int) (Math.random() * 7 + 1);
        color = switch (option) {
            case 1 -> "red";
            case 2 -> "black";
            case 3 -> "blue";
            case 4 -> "yellow";
            case 5 -> "green";
            case 6 -> "magenta";
            case 7 -> "orange";
            default -> "black";
        };
        return color;
    }

    public void createFigures(){

    }

    public void mostrarFiguras(){

    }




}
