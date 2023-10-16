package org.estoutic.solution_two.coordinates;

class Tester {
    public static void main(String[] args) {
        Point point1 = new Point(2.0, 3.0);
        Point point2 = new Point(5.0, 7.0);

        Circle circle1 = new Circle(point1, 4.0);
        Circle circle2 = new Circle(point2, 2.5);

        Circle[] circles = new Circle[]{circle1, circle2};

        for (int i = 0; i < circles.length; i++) {
            System.out.printf("Circle %d \n", (i + 1));
            System.out.printf("Center: (%.2f, %.2f)\n", circles[i].getCenter().getX(), circles[i].getCenter().getY());
            System.out.printf("Radius: %.2f\n\n", circles[i].getRadius());

        }
    }
}