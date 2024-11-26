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
class Line implements Comparable<Line> {
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

    @Override
    public int compareTo(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LineComparisonComputation {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Welcome to Line Comparison Computation \n");

        // Define points for the first line
        Point point1A = new Point(7, 3);
        Point point1B = new Point(5, 7);

        // Define points for the second line
        Point point2A = new Point(1, 1);
        Point point2B = new Point(4, 5);

        // Create lines
        Line line1 = new Line(point1A, point1B);
        Line line2 = new Line(point2A, point2B);


        // Calculate lengths and display
        System.out.printf("Length of Line 1: %.2f%n", line1.calculateLength());
        System.out.printf("Length of Line 2: %.2f%n", line2.calculateLength());

        // Compare the two lines
        int comparisonResult = line1.compareTo(line2);

        // Display the comparison result
        if (comparisonResult == 0) {
            System.out.println("Line 1 and Line 2 are equal in length.");
        } else if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
    }



    }
