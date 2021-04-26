import java.util.Scanner;

public class Collage {

    public static void main(String[] args){
        int counter = 0;
        String color;
        String option = "";
        Figures figures = new Figures();
        while (!option.equals("F")) {
            if (option.equals("M")) {
                color = "magenta";
                figures.changeColor(counter, color);
            } else if (option.equals("N")) {
                color = "orange";
                figures.changeColor(counter, color);
            } else {
                switch (counter) {
                    case 0 -> figures.createFigures();
                    case 1 -> figures.circles();
                    case 2 -> figures.triangles();
                    case 3 -> figures.squares();
                    case 4 -> figures.rectangles();
                    case 5 -> figures.trapezes();
                }
            }
            option=selectOption();
            if(option.equals("A") || option.equals("R") || option.equals("G")) {
                figures.hide(counter);
                figures = new Figures();
            }
            if (option.equals("A")) counter = counter + 1;
            else if (option.equals("R")) counter = counter - 1;
            if (counter == 6) counter = 0;
            else if (counter == -1) counter = 5;
        }
        System.exit(0);
    }

    public static String selectOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una opcion: ");
        return sc.nextLine().toUpperCase();
    }
}

