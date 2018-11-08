/*
 * Una ruta nacional es defineix pel seu codi, aeroport d’origen, aeroport de 
 * destí, distància i país
 */
package components;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class RutaNacional {

    private String codi;
    private String pais;
    private String aeroportOri;
    private String aeroportDes;
    private double distancia;

    private static final Scanner dades = new Scanner(System.in);

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaNacional(String nouCodi, String nouPais, String nouAeroportOri, String nouAeroportDes, double nouDistancia) {
        this.codi = nouCodi;
        this.pais = nouPais;
        this.aeroportOri = nouAeroportOri;
        this.aeroportDes = nouAeroportDes;
        this.distancia = nouDistancia;
    }

    /*
    Mètodes accessors
     */
    public String getCodi() {
        return this.codi;
    }

    public void setCodi(String nouCodi) {
        this.codi = nouCodi;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String nouPais) {
        this.pais = nouPais;
    }

    public String getAeroportOri() {
        return this.aeroportOri;
    }

    public void setAeroportOri(String nouAeroportOri) {
        this.aeroportOri = nouAeroportOri;
    }

    public String getAeroportDes() {
        return this.aeroportDes;
    }

    public void setAeroportDes(String nouAeroportDes) {
        this.aeroportDes = nouAeroportDes;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double nouDistancia) {
        this.distancia = nouDistancia;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta nacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports no tene per què estar formats per una única 
    paraula, per exemple, El Prat.
     */
    public static RutaNacional novaRutaNacional() {
        String nouCodi;
        String nouPais;
        String nouAeroportOri;
        String nouAeroportDes;
        double nouDistancia;

        System.out.print("Introdueix codi de la nova ruta nacional: ");
        nouCodi = dades.nextLine();
        System.out.print("Introdueix pais de la nova ruta nacional: ");
        nouPais = dades.nextLine();
        System.out.print("Introdueix aeroport d'origen de la nova ruta nacional: ");
        nouAeroportOri = dades.nextLine();
        System.out.print("Introdueix aeroport de desti de la nova ruta nacional: ");
        nouAeroportDes = dades.nextLine();
        System.out.print("Introdueix la distancia de la nova ruta nacional: ");
        nouDistancia = dades.nextInt();
        dades.nextLine();

        return new RutaNacional(nouCodi, nouPais, nouAeroportOri, nouAeroportDes, nouDistancia);
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los.
    
     Retorn: cap
     */
    public void modificarRutaNacional() {

        System.out.print("El codi de la ruta nacional és: " + this.codi + ". Introdueix el nou codi: ");
        setCodi(dades.nextLine());
        System.out.print("L'aeroport d'origen és: " + this.aeroportOri + ". Introdueix el nou aeroport: ");
        setAeroportOri(dades.nextLine());
        System.out.print("L'aeroport de destí és: " + this.aeroportDes + ". Introdueix el nou aeroport: ");
        setAeroportDes(dades.nextLine());
        System.out.print("El pais d'origen és: " + this.pais + ". Introdueix el nou pais: ");
        setPais(dades.nextLine());
        System.out.print("La distància és: " + this.pais + ". Introdueix la nova distància: ");
        setDistancia(dades.nextDouble());
        dades.nextLine();

    }

    public void mostrarRutaNacional() {
        System.out.println("\nLes dades de la ruta nacional amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
        System.out.println("\nDistància: " + distancia);
    }
    /*
    public static void main(String[] args) {
           
        RutaNacional R = new RutaNacional("2","3","4","5",5);
        
        R.mostrarRutaNacional();
        R.modificarRutaNacional();
        R.mostrarRutaNacional();
        
        RutaNacional a = RutaNacional.novaRutaNacional();
        a.mostrarRutaNacional();
    }*/
}
