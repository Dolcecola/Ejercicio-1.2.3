import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        String cad;
        System.out.println("Escribe una palabra: ");
        Scanner entrada = new Scanner(System.in);
        cad = entrada.next();

        for(int i=cad.length()-1;i>-1;i--)
        {
            System.out.print(cad.charAt(i));
        }
        System.out.println();

        for(int i=0;i<cad.length();i++)
        {
            if(cad.charAt(i) == 'a' || cad.charAt(i) == 'e' || cad.charAt(i) == 'i' || cad.charAt(i) == 'o' || cad.charAt(i) == 'u')
            {
                continue;
            }
            System.out.print(cad.charAt(i));
        }

        System.out.println();
        System.out.println("La palabra tiene " + cad.length() + " letras");
    }
}