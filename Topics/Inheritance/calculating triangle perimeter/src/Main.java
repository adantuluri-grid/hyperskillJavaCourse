import java.util.Scanner;

public class Main {

    static class Polygon {
        private int sideLength;

        public void setSideLength(int sideLength) {
            this.sideLength = sideLength;
        }

        public int getSideLength() {
            return sideLength;
        }
    }

    static class Square extends Polygon {
        public int calculateArea() {
            int length = getSideLength();
            return length * length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int inputSide = scanner.nextInt();

            Square mySquare = new Square();
            mySquare.setSideLength(inputSide);

            System.out.println(mySquare.calculateArea());
        }
        scanner.close();
    }
}