
package pe.edu.tecsup.lab10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculator app = new Calculator();

        System.out.print("Ingresa el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingresa el operador (+, -, *, /): ");
        char operador = teclado.next().charAt(0);

        System.out.print("Ingresa el segundo numero: ");
        int num2 = teclado.nextInt();

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + app.add(num1, num2));
                break;
            case '-':
                System.out.println("Resultado: " + app.sub(num1, num2));
                break;
            case '*':
                System.out.println("Resultado: " + app.mul(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + app.div(num1, num2));
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operador no valido.");
        }

        teclado.close();
    }
}
