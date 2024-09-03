package org.ciaf.jorge;

import java.util.Scanner;

public class validacioncontraseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una contraseña
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        // Verificar si la contraseña cumple con los criterios de seguridad
        if (isValidPassword(password)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida. Debe tener al menos 8 caracteres, "
                    + "una letra mayúscula, una letra minúscula y un número.");
        }

        scanner.close();
    }

    // Método para verificar si la contraseña es válida
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }

            // Si todos los criterios se cumplen, podemos dejar de verificar
            if (hasUpperCase && hasLowerCase && hasDigit) {
                return true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit;
    }
}
