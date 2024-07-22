import java.util.Scanner;
                                               //TABUADA
public class App {
    public static void main(String[] args) throws Exception {
        int numero, contador;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        for (contador = 1; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
        }
    }
}
                                             //DIVISIVEL
/* import java.util.Scanner;

    public class App {
    public static void main(String[] args) throws Exception {
        int numero, contador;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        for (contador = 1; contador <= numero; contador++) {
            if(numero%contador == 0)
            System.out.println(numero + " e divisivel por " + contador);
        } 
    }
}*/