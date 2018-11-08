/*
 * Una ruta intercontinental es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen i continent 
 * de destí
 */
package components;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class RutaIntercontinental {

    private static Scanner dades = new Scanner(System.in);

    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaIntercontinental(String codi, String aeroportOri, String aeroportDes, String paisOri, String paisDes, String nouContinentOri, String nouContinentDes, double distancia) {
        this.codi = codi;
        this.aeroportOri = aeroportOri;
        this.aeroportDes = aeroportDes;
        this.paisOri = paisOri;
        this.paisDes = paisDes;
        this.continentOri = nouContinentOri;
        this.continentDes = nouContinentDes;
        this.distancia = distancia;
    }

    /*
    Mètodes accessors
     */
    public String getCodi() {
        return this.codi;
    }

    public String getAeroportOri() {
        return this.aeroportOri;
    }

    public String getAeroportDes() {
        return this.aeroportDes;
    }

    public String getPaisOri() {
        return this.paisOri;
    }

    public String getPaisDes() {
        return this.paisDes;
    }

    public String getContinentOri() {
        return this.continentOri;
    }

    public String getContinentDes() {
        return this.continentDes;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public void setAeroportOri(String aeroportOri) {
        this.aeroportOri = aeroportOri;
    }

    public void setAeroportDes(String aeroportDes) {
        this.aeroportDes = aeroportDes;
    }

    public void setPaisOri(String paisOri) {
        this.paisOri = paisOri;
    }

    public void setPaisDes(String paisDes) {
        this.paisDes = paisDes;
    }

    public void setContinentOri(String nouContinentOri) {
        this.continentOri = nouContinentOri;
    }

    public void setContinentDes(String nouContinentDes) {
        this.continentDes = nouContinentDes;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta internacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaIntercontinental novaRutaInternacional() {
        System.out.print("Introdueix el codi de la ruta intercontinental: ");
        String codi = dades.nextLine();
        System.out.print("Introdueix l'aeroport d'origen: ");
        String aeroportOri = dades.nextLine();
        System.out.print("Introdueix l'aeroport de destí: ");
        String aeroportDes = dades.nextLine();
        System.out.print("Introdueix el pais d'origen: ");
        String paisOri = dades.nextLine();
        System.out.print("Introdueix el pais de destí: ");
        String paisDes = dades.nextLine();
        System.out.print("Introdueix el continent d'origen: ");
        String continentOri = dades.nextLine();
        System.out.print("Introdueix el continent de destí: ");
        String continentDes = dades.nextLine();
        System.out.print("Introdueix la distancia: ");
        double distancia = dades.nextDouble();
        dades.nextLine();

        return new RutaIntercontinental(codi, aeroportOri, aeroportDes, paisOri, paisDes, continentOri, continentDes, distancia);
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
    public void modificarRutaIntercontinental() {
        System.out.println("El codi de la ruta internacional és: " + this.codi + ".\nIntrodueix el nou codi: ");
        setCodi(dades.nextLine());
        System.out.println("L'aeroport d'origen és: " + this.aeroportOri + ".\nIntrodueix el nou aeroport: ");
        setAeroportOri(dades.nextLine());
        System.out.println("L'aeroport de destí és: " + this.aeroportDes + ".\nIntrodueix el nou aeroport: ");
        setAeroportDes(dades.nextLine());
        System.out.println("El pais d'origen és: " + this.paisOri + ".\nIntrodueix el nou pais: ");
        setPaisOri(dades.nextLine());
        System.out.println("El pais de destí és: " + this.paisDes + ".\nIntrodueix el nou pais: ");
        setPaisDes(dades.nextLine());
        System.out.println("El continent d'origen és: " + this.continentOri + ".\nIntrodueix el nou continent d'origen: ");
        setContinentOri(dades.nextLine());
        System.out.println("El continent de destí és: " + this.continentDes + ".\nIntrodueix el nou continent de destí: ");
        setContinentOri(dades.nextLine());
        System.out.println("La distància és: " + this.paisOri + ".\nIntrodueix la nova distància: ");
        setDistancia(dades.nextDouble());
        dades.nextLine();

    }

    public void mostrarRutaIntercontinental() {
        System.out.println("\nLes dades de la ruta intercontinental amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
        System.out.println("\nPaís d'origen: " + paisOri);
        System.out.println("\nPaís de destí: " + paisDes);
        System.out.println("\nContinent d'origen: " + continentOri);
        System.out.println("\nContinent de destí: " + continentDes);
        System.out.println("\nDistància: " + distancia);
    }
}
