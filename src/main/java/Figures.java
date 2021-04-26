import java.awt.*;
import java.util.*;

public class Figures {
    private Square[] squares;
    private Rectangle[] rectangles;
    private Circle[] circles;
    private Triangle[] triangles;
    private Trapeze[] trapezes;

    public Figures() {
        squares = new Square[20];
        rectangles = new Rectangle[20];
        circles = new Circle[20];
        triangles = new Triangle[20];
        trapezes = new Trapeze[20];
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
        int option = (int) (Math.random() * 7 + 1);
        String color = switch (option) {
            case 1 -> "red";
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
        for (int i = 0; i < 20; i++) {
            squares[i] = randomSquare();
            squares[i].makeVisible();
            circles[i] = randomCircle();
            circles[i].makeVisible();
            trapezes[i] = randomTrapeze();
            trapezes[i].makeVisible();
            triangles[i] = randomTriangle();
            triangles[i].makeVisible();
            rectangles[i]= randomRectangle();
            rectangles[i].makeVisible();
        }
    }

    public void squares() {
        for (int i = 0; i < 20; i++) {
            squares[i] = randomSquare();
            squares[i].makeVisible();
        }
    }

    public void circles(){
        for (int i = 0; i < 20; i++) {
            circles[i] = randomCircle();
            circles[i].makeVisible();
        }
    }

    public void trapezes(){
        for (int i = 0; i < 20; i++) {
            trapezes[i] = randomTrapeze();
            trapezes[i].makeVisible();
        }
    }

    public void triangles(){
        for (int i = 0; i < 20; i++) {
            triangles[i] = randomTriangle();
            triangles[i].makeVisible();
        }
    }

    public void rectangles(){
        for (int i = 0; i < 20; i++) {
            rectangles[i] = randomRectangle();
            rectangles[i].makeVisible();
        }
    }

    public void hide(int c) {
        for(int i=0;i<20;i++){
            switch (c) {
                case 0 -> hideAll();
                case 1 -> circles[i].makeInvisible();
                case 2 -> triangles[i].makeInvisible();
                case 3 -> squares[i].makeInvisible();
                case 4 -> rectangles[i].makeInvisible();
                case 5 -> trapezes[i].makeInvisible();
            }

        }

    }

    public void hideAll() {
        for (int i = 0; i < 20; i++) {
            squares[i].makeInvisible();
            circles[i].makeInvisible();
            trapezes[i].makeInvisible();
            triangles[i].makeInvisible();
            rectangles[i].makeInvisible();
        }
    }

    public void changeColor(int option, String color){
        for (int i = 0; i < 20; i++) {
            switch (option) {
                case 0 -> changeAllColors(color);
                case 1 -> circles[i].changeColor(color);
                case 2 -> triangles[i].changeColor(color);
                case 3 -> squares[i].changeColor(color);
                case 4 -> rectangles[i].changeColor(color);
                case 5 -> trapezes[i].changeColor(color);
            }
        }

    }

    public void changeAllColors(String color) {
        for (int i = 0; i < 20; i++) {
            squares[i].changeColor(color);
            circles[i].changeColor(color);
            triangles[i].changeColor(color);
            trapezes[i].changeColor(color);
            rectangles[i].changeColor(color);
        }
    }


}
