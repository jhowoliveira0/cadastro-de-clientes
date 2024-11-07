
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        final String BR = "Brasil";
        String primeiroNome;
        String segundoNome;
        boolean m = true ;

        System.out.println ("Olá, digite seu primeiro nome:");
        primeiroNome = scanner.nextLine();

        System.out.println ("Olá, digite seu segundo nome:");
        segundoNome = scanner.nextLine();

        System.out.println ("Olá, " + nomeCompleto(primeiroNome, segundoNome));

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
        //return primeiroNome + " " + segundoNome;
    }
}
