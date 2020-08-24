import java.util.Scanner;

public class Triangle {
    Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1 &&
                side1 <= 0 && side2 <= 0 && side3 <= 0)
            throw new IllegalTriangleException("Khong phai la 1 tam giac");
        else {
            throw new IllegalTriangleException("La 1 tam giac");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhap 3 canh cua 1 tam giac:");
            System.out.println("Canh a:");
            double side1 = sc.nextDouble();
            System.out.println("Canh b:");
            double side2 = sc.nextDouble();
            System.out.println("Canh c:");
            double side3 = sc.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.errorMessage);
        }


    }

}

class IllegalTriangleException extends Exception {
    String errorMessage;

    public IllegalTriangleException(String inErrorMessage) {
        errorMessage = inErrorMessage;
    }

}
