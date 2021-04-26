import java.awt.*;

public class Trapeze {
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new trapeze at default position with default color.
     */
    public Trapeze(int height, int width, int xPosition, int yPosition, String color) {
        this.height = height;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
    }

    /**
     * Make this trapeze visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this trapeze invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }


    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta", "black" and "orange".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the trapeze with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition - width/2, xPosition, xPosition + width, xPosition + width + (width/2) };
            int[] ypoints = { yPosition, yPosition - height, yPosition - height, yPosition};
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 4));
            canvas.wait(10);
        }
    }

    /**
     * Erase the trapeze on screen.
     */
    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
