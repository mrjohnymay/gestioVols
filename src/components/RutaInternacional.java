/*
 * Una ruta internacional es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen i país de destí
 */
package components;

import java.util.Scanner;


/**
 *
 * @author root
 */
public class RutaInternacional {
    
    private static Scanner dades = new Scanner (System.in);
    
    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private double distancia;
    
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaInternacional(String codi, String aeroportOri, String aeroportDes, String paisOri, String paisDes, double distancia){
        this.codi = codi;
        this.aeroportOri = aeroportOri;
        this.aeroportDes = aeroportDes;
        this.paisOri = paisOri;
        this.paisDes = paisDes;
        this.distancia = distancia;
    }

    /*
    Mètodes accessors
     */
    public String getCodi(){
        return this.codi;
    }
    public String getAeroportOri(){
        return this.aeroportOri;
    }
    public String getAeroportDes(){
        return this.aeroportDes;
    }
    public String getPaisOri(){
        return this.paisOri;
    }
    public String getPaisDes(){
        return this.paisDes;
    }
    public double getDistancia(){
        return this.distancia;
    }
    
    public void setCodi(String codi){
        this.codi = codi;
    }
    public void setAeroportOri(String aeroportOri){
        this.aeroportOri = aeroportOri;
    }
    public void setAeroportDes(String aeroportDes){
        this.aeroportDes = aeroportDes;
    }
    public void setPaisOri(String paisOri){
        this.paisOri = paisOri;
    }
    public void setPaisDes(String paisDes){
        this.paisDes = paisDes;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    
    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta internacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports països no tene per què estar formats per una única 
    paraula, per exemple, El Prat o Regne Unit.
     */
    public static RutaInternacional novaRutaInternacional() {
        System.out.println("Introdueix el codi de la ruta internacional: ");
        String codi = dades.nextLine();
        System.out.println("Introdueix l'aeroport d'origen: ");
        String aeroportOri = dades.nextLine();
        System.out.println("Introdueix l'aeroport de destí: ");
        String aeroportDes = dades.nextLine();
        System.out.println("Introdueix el pais d'origen: ");
        String paisOri = dades.nextLine();
        System.out.println("Introdueix el pais de destí: ");
        String paisDes = dades.nextLine();
        System.out.println("Introdueix la distancia: ");
        double distancia = dades.nextDouble();
        dades.nextLine();
        
        return new RutaInternacional(codi,aeroportOri,aeroportDes,paisOri,paisDes,distancia);
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
    public void modificarRutaInternacional() {
        String codi = getCodi();
        String aeroportOri = getAeroportOri();
        String aeroportDes = getAeroportDes();
        String paisOri = getPaisOri();
        String paisDes = getPaisDes();
        double distancia = getDistancia();
        
        System.out.println("El codi de la ruta internacional és: " + codi + ". Introdueix el nou codi: ");
        setCodi(dades.nextLine());
        System.out.println("L'aeroport d'origen és: " + aeroportOri + ". Introdueix el nou aeroport: ");
        setAeroportOri(dades.nextLine());
        System.out.println("L'aeroport de destí és: " + aeroportDes + ". Introdueix el nou aeroport: ");
        setAeroportDes(dades.nextLine());
        System.out.println("El pais d'origen és: " + paisOri + ". Introdueix el nou pais: ");
        setPaisOri(dades.nextLine());
        System.out.println("El pais de destí és: " + paisDes + ". Introdueix el nou pais: ");
        setPaisDes(dades.nextLine());
        System.out.println("La distància és: " + paisOri + ". Introdueix la nova distància: ");
        setDistancia(dades.nextDouble());
        dades.nextLine();
        
    }

    public void mostrarRutaInternacional() {
        System.out.println("\nLes dades de la ruta internacional amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
         System.out.println("\nPaís d'origen: " + paisOri);
        System.out.println("\nPaís de destí: " + paisDes);
        System.out.println("\nDistància: " + distancia);
    }
}
