import java.awt.*;

public class Rectangle {
    private int length;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Rectangle() {
        length = 60;
        this.width = 40;
        xPosition = 310;
        yPosition = 120;
        color = "red";
        isVisible = false;
    }

    public Rectangle(int length, int width, int xPosition, int yPosition, String color) {
        this.length = length;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
    }

    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
    /* Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /* Make this triangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    /* Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int length, int width)
    {
        erase();
        this.length = length;
        this.width = width;
        draw();
    }
    /* Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new java.awt.Rectangle(xPosition, yPosition, width, length));
            canvas.wait(10);
        }
    }

    /**
     * Erase the square on screen.
     */
    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
