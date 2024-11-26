package org.example;

// Class to represent a point in the Cartesian system
class Point {
    private double x;
    private double y;

    // Constructor to initialize a point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Class to represent a line between two points
class Line {
    private Point startPoint;
    private Point endPoint;

    // Constructor to initialize a line with two points
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Method to calculate the length of the line
    public double calculateLength() {
        double x1 = startPoint.getX();
        double y1 = startPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LineComparisonComputation {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Welcome to Line Comparison Computation ");

        // Define points
        Point point1 = new Point(2, 3);
        Point point2 = new Point(5, 7);

        // Create a line using the points
        Line line = new Line(point1, point2);

        // Calculate and display the length of the line
        double length = line.calculateLength();
        System.out.printf("\nThe length of the line between points (%.1f, %.1f) and (%.1f, %.1f) is: %.2f%n",
                point1.getX(), point1.getY(), point2.getX(), point2.getY(), length);
    }



    }
