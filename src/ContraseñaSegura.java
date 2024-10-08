import java.util.Scanner;

public class ContraseñaSegura {

    public static boolean esContraseñaSegura(String contraseña) {
        if (contraseña.length() < 10) {
            return false; 
        }

        boolean tieneLetra = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;

        for (char c : contraseña.toCharArray()) {
            if (Character.isLetter(c)) {
                tieneLetra = true;
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
            } else {
                tieneSimbolo = true; 
            }
        }

        return tieneLetra && tieneDigito && tieneSimbolo; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        String contraseña = scanner.nextLine();

        if (esContraseñaSegura(contraseña)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }

        scanner.close();
    }
}
