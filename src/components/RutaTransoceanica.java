/*
 * Una ruta transoceànica es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen, continent 
 * de destí i oceà que sobrevola.
 */
package components;

/**
 *
 * @author root
 */
import java.util.Scanner;
public class RutaTransoceanica {

    private static Scanner dades = new Scanner (System.in);
    
    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private String ocea;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    
    public RutaTransoceanica(String codi, String aeroportOri, String aeroportDes, String paisOri, String paisDes, String continentOri, String continentDes, String ocea, double distancia){
        this.codi = codi;
        this.aeroportOri = aeroportOri;
        this.aeroportDes = aeroportDes;
        this.paisOri = paisOri;
        this.paisDes = paisDes;
        this.continentOri = continentOri;
        this.continentDes = continentDes;
        this.ocea = ocea;
        this.distancia = distancia;
    }
    
    
    /*
    Mètodes accessors
    */
    
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
    public void setContinentOri(String continentOri){
        this.continentOri = continentOri;
    }
    public void setContinentDes(String continentDes){
        this.continentDes = continentDes;
    }
    public void setOcea(String ocea){
        this.ocea = ocea;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    
    
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
    public String getContinentOri(){
        return this.continentOri;
    }
    public String getContinentDes(){
        return this.continentDes;
    }
    public String getOcea(){
        return this.ocea;
    }
    public double getDistancia(){
        return this.distancia;
    }
    
    
   /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta transcoceanica.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaTransoceanica novaRutaTransoceanica() {
        System.out.println("Introdueix el codi");
        String codi = dades.nextLine();
        System.out.println("Introdueix l'aeroport d'origen: ");
        String aeroportOri = dades.nextLine();
        System.out.println("Introdueix l'aeroport de destí: ");
        String aeroportDes = dades.nextLine();
        System.out.println("Introdueix el pais d'origen: ");
        String paisOri = dades.nextLine();
        System.out.println("Introdueix el pais de destí: ");
        String paisDes = dades.nextLine();
        System.out.println("Introdueix el continent d'origen: ");
        String continentOri = dades.nextLine();
        System.out.println("Introdueix el continent de destí: ");
        String continentDes = dades.nextLine();
        System.out.println("Introdueix l'oceà: ");
        String ocea = dades.nextLine();
        System.out.println("Introdueix la distància: ");
        double distancia = dades.nextDouble();
        
        return new RutaTransoceanica(codi,aeroportOri,aeroportDes,paisOri,paisDes,continentOri,continentDes,ocea,distancia);
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
    public void modificarRutaTransoceanica() {
        String codi = getCodi();
        String aeroportOri = getAeroportOri();
        String aeroportDes = getAeroportDes();
        String paisOri = getPaisOri();
        String paisDes = getPaisDes();
        String continentOri = getContinentOri();
        String continentDes = getContinentDes();
        String ocea = getOcea();
        double distancia = getDistancia();
        
        System.out.println("Aquest és el codi: " + codi + ". Introdueix el nou codi.");
        codi = dades.nextLine();
        System.out.println("Aquest és el codi: " + aeroportOri + ". Introdueix el nou codi.");
        aeroportOri = dades.nextLine();
        System.out.println("Aquest és el codi: " + aeroportDes + ". Introdueix el nou codi.");
        aeroportDes = dades.nextLine();
        System.out.println("Aquest és el codi: " + paisOri + ". Introdueix el nou codi.");
        paisOri = dades.nextLine();
        System.out.println("Aquest és el codi: " + paisDes + ". Introdueix el nou codi.");
        paisDes = dades.nextLine();
        System.out.println("Aquest és el codi: " + continentOri + ". Introdueix el nou codi.");
        continentOri = dades.nextLine();
        System.out.println("Aquest és el codi: " + continentDes + ". Introdueix el nou codi.");
        continentDes = dades.nextLine();
        System.out.println("Aquest és el codi: " + ocea + ". Introdueix el nou codi.");
        ocea = dades.nextLine();
        System.out.println("Aquest és el codi: " + distancia + ". Introdueix el nou codi.");
        distancia = dades.nextDouble();
        
        setCodi(codi);
        setContinentOri(continentOri);
        setContinentDes(continentDes);
        setAeroportOri(aeroportOri);
        setAeroportDes(aeroportDes);
        setPaisOri(paisOri);
        setPaisDes(paisDes);
        setOcea(ocea);
        setDistancia(distancia);
    }

    public void mostrarRutaTransoceanica() {
        System.out.println("\nLes dades de la ruta transoceànica amb codi " + codi + " són:");
        System.out.println("\nAeroport d'origen: " + aeroportOri);
        System.out.println("\nAeroport de destí: " + aeroportDes);
        System.out.println("\nPaís d'origen: " + paisOri);
        System.out.println("\nPaís de destí: " + paisDes);
        System.out.println("\nContinent d'origen: " + continentOri);
        System.out.println("\nContinent de destí: " + continentDes);
        System.out.println("\nOceà que sobrevola: " + ocea);
        System.out.println("\nDistància: " + distancia);
    }
}

