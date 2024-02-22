import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter une valeur positive");

        int nombre = Integer.parseInt(myObj.nextLine());

        try {
            EntierNaturel entierNaturel=new EntierNaturel(nombre);
            entierNaturel.decrementer();
            System.out.println("La valeur Saise -1 : " +entierNaturel.getVal());
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());;
        }finally {
            if (nombre<0) {
                NombreNegatifException nombreNegatifException = new NombreNegatifException();
                nombreNegatifException.setValnegative(nombre);
                System.out.println("La valeur négative Saise est : " + nombreNegatifException.getValnegative());
            }
        }


    }
}