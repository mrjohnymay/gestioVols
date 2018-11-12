/*
 * Un tripulant de cabina de passatgers (TCP) es defineix pel seu passaport, nom
 * , edat, data d’alta en la companyia, hores que porta de vol i rang
 */
package components;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author root
 */
public class TCP {

    private static Scanner dades = new Scanner(System.in);
    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private LocalTime horesVol;
    private String rang;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys dataAlta rang.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar l'atribut dataAlta amb l'hora actual del sistema.
     - Inicialitzar l'atribut rang a null, ja que quan es crea un TCP, mai té rang.
     */
    
    public TCP(String passaport, String nom, int edat, LocalTime horesVol){
        Date data = new Date();
        
        this.passaport = passaport;
        this.nom = nom;
        this.edat = edat;
        this.dataAlta =  data;
        this.horesVol = horesVol;
        this.rang = null;
    }
    

    /*
    Mètodes accessors
     */
    
    public String getPassaport(){
        return this.passaport;
    }
    public String getNom(){
        return this.nom;
    }
    public int getEdat(){
        return this.edat;
    }
    public Date getDataAlta(){
        return this.dataAlta;
    }
    public LocalTime getHoresVol(){
        return this.horesVol;
    }
    public String getRang(){
        return this.rang;
    }
    
    public void setPassaport(String passaport){
        this.passaport = passaport;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setEdat(int edat){
        this.edat = edat;
    }
    public void setDataAlta(Date dataAlta){
        this.dataAlta = dataAlta;
    }
    public void setHoresVol(LocalTime horesVol){
        this.horesVol = horesVol;
    }
    public void setRang(String rang){
        this.rang = rang;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou TCP.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom no té per què estar format per una única 
    paraula, per exemple, Pep Gómez.
    - També heu de tenir en compte que les hores de vol són de tipus LocalTime, per
    tant heu de demanar a l'usuari les hores i minuts per crear el LocalTime. En aquest
    cas es considerarà que els segons i nanosegons, sempre són  0.
     */
    public static TCP nouTCP() {
        System.out.println("Introdueix el passaport: ");
        String passaport = dades.nextLine();
        System.out.println("Introdueix el nom: ");
        String nom = dades.nextLine();
        System.out.println("Introdueix la edat: ");
        int edat = dades.nextInt();
        System.out.println("Introdueix les hores de vol");
        String hores = dades.nextLine();
        int hora = Integer.parseInt(hores.substring(0,2));
        int minuto = Integer.parseInt(hores.substring(2));
        LocalTime horesVol = LocalTime.of(hora,minuto);
        
        return new TCP(passaport,nom,edat,horesVol);
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte menys data d'alta i
     rang.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. En el cas de les hores de vol, només se li han
     de mostrar les hores i minuts.
    
     Retorn: cap
     */
    public void modificarTCP() {
        String hores;
        
        System.out.println("Aquest és el passaport: " + passaport + ". Introduexi el passaport: ");
        this.passaport = dades.nextLine();
        System.out.println("Aquest és el nom: " + nom + ". Introdueix el nom: ");
        this.nom = dades.nextLine();
        System.out.println("Aquesta és la edat: " + ". Introdueix la edat: ");
        this.edat = dades.nextInt();
        System.out.println("Aquestes son les hores de vol: " + horesVol + ". Introdueix les hores de vol: (Hores)");
        hores = dades.nextLine();
        int hora = Integer.parseInt(hores.substring(0,2));
        int minuto = Integer.parseInt(hores.substring(2));
        this.horesVol = LocalTime.of(hora,minuto);
        
        setPassaport(passaport);
        setNom(nom);
        setEdat(edat);
        setHoresVol(horesVol);
    }

    public void mostrarTCP() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + passaport + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nEdat: " + edat);
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(dataAlta));
        System.out.println("\nHores de vol: " + horesVol.getHour() + ":" + horesVol.getMinute());
        System.out.println("\nRang: " + rang);
    }

}