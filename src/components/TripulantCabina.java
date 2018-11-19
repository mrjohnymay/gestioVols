/*
 * Un tripulant de cabina es defineix pel seu passaport, nom, edat, data d’alta 
 * en la companyia, hores que porta de vol, rang i barres
 */
package components;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class TripulantCabina {

    private final static Scanner DADES = new Scanner(System.in);

    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;//
    private  LocalTime horesVol;
    private  String rang;
    private  int barres;//

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys dataAlta i barres.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar l'atribut dataAlta amb l'hora actual del sistema.
     - Inicialitzar l'atribut barres mitjançant el mètode pertinent d'aquesta classe.
     */
    public TripulantCabina(String nouPassaport, String nouNom, int novaEdat, LocalTime novesHoresVol, String nouRang) {

        this.passaport = nouPassaport;
        this.nom = nouNom;
        this.edat = novaEdat;
        this.horesVol = novesHoresVol;
        this.rang = nouRang;
        this.dataAlta = new Date();
        assignarBarres(rang);

    }


    /*
    Mètodes accessors
     */
    public String getPassaport() {
        return this.passaport;
    }

    public String getNom() {
        return this.nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public LocalTime getHoresVol() {
        return this.horesVol;
    }

    public String getRang() {
        return this.rang;
    }

    public Date getDataAlta() {
        return this.dataAlta;
    }

    public int getBarres() {
        return this.barres;
    }

    public void setPassaport(String nouPassaport) {
        this.passaport = nouPassaport;
    }

    public void setNom(String nouNom) {
        this.nom = nouNom;
    }

    public void setEdat(int novaEdat) {
        this.edat = novaEdat;
    }

    public void setHoresVol(LocalTime novesHoresVol) {
        this.horesVol = novesHoresVol;
    }

    /*    - Si es vol modificar el rang, a l'hora de demanar-li el nou rang a l'usuari
     haurem de fer el mateix que en el mètode nouTripulantCabina, però en aquest 
     cas, si no s'introdueix un rang correcte, en lloc de no assignar-li res a 
     l'atribut rang, el que farem és no modificar el seu valor actual.*/
 /*un Enginyer de cabina pot passar a ser còpilot si té 5
     o més anys d'antiguetat, i un copilot pot passar a ser comandant, si té 15 
     o més anys d'antiguetat.
     - Si modifiquem el valor del rang, també haurem de modificar el valor de les
     barres amb el mètode adient d'aquesta classe.
    
     NOTA: 5 anys són 157788000 segons.*/
    public void setRang(String nouRang) {
        if (!nouRang.equalsIgnoreCase("C") || !nouRang.equalsIgnoreCase("CP") || !nouRang.equalsIgnoreCase("EV")) {
            System.out.print("\nEl rang introduït no és correcte...\n");

            if ((this.rang == null) || (this.rang.equals(""))) { //aixo ho fara nomes quan creem el tripulant
                                                        //aixi no modificara res quan cridi al metode modificar
                this.rang = " ";
            }
        }

        //Si volem modificar el tripulant i el rang que hem introduit es enginyer
        if (this.rang.equals("Enginyer")) {
            Date now = new Date();
            long segons = ((now.getTime()) / 1000) - (this.dataAlta.getTime() / 1000);//calculem els segons de diferencia entre la data d'avui - la data d'alta

            if (segons >= 157788000) { //i el temps es > a 5 anys
                this.rang = "Copilot";
                assignarBarres(this.rang);
            }
        }

        if (this.rang.equals("Copilot")) {
            Date now = new Date();
            long segons = ((now.getTime()) / 1000) - (this.dataAlta.getTime() / 1000);//calculem els segons de diferencia entre la data d'avui - la data d'alta

            if (segons >= 473364000) {
                this.rang = "Comandant";
                assignarBarres(this.rang);
            }
        }
        
        //Creacio
        if (nouRang.equalsIgnoreCase("C")) {
            this.rang = "Comandant";
        } else if (nouRang.equalsIgnoreCase("CP")) {
            this.rang = "Copilot";
        } else {
            this.rang = "Enginyer";
        }
    }

    public void setDataAlta(Date novaDataAlta) {
        this.dataAlta = novaDataAlta;
    }

    public void setBarres(int novesBarres) {
        this.barres = novesBarres;
    }

    public static TripulantCabina nouTripulantCabina() {

        String nouPassaport;
        String nouNom;
        int novaEdat;
        LocalTime novesHoresVol;
        String nouRang;
        int hores;
        int minuts;

        System.out.print("Introdueix el passaport: ");
        nouPassaport = DADES.nextLine();
        System.out.print("Introdueix el nom: ");
        nouNom = DADES.nextLine();
        System.out.print("Introdueix la edat:");
        novaEdat = DADES.nextInt();
        DADES.nextLine();
        System.out.print("Introdueix les hores de vol: ");
        hores = DADES.nextInt();
        DADES.nextLine();
        System.out.print("Introdueix els minuts de vol: ");
        minuts = DADES.nextInt();
        DADES.nextLine();
        novesHoresVol = LocalTime.of(hores, minuts);

        System.out.print("Introdueix el rang \n");
        System.out.print("C = Comandant \nCP = Copilot\nEV = Enginyer de vol");
        nouRang = DADES.nextLine();

        return new TripulantCabina(nouPassaport, nouNom, novaEdat, novesHoresVol, nouRang);
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte menys data d'alta.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. En el cas de les hores de vol, només se li han
     de mostrar les hores i minuts.
     - Si es vol modificar el rang, a l'hora de demanar-li el nou rang a l'usuari
     haurem de fer el mateix que en el mètode nouTripulantCabina, però en aquest 
     cas, si no s'introdueix un rang correcte, en lloc de no assignar-li res a 
     l'atribut rang, el que farem és no modificar el seu valor actual.
     - Abans de modificar el valor del rang, hem de comprovar que el nou valor 
     compleix els requisits especificats en l'enunciat de la pràctica de la UF1 
     del mòdul 5, és a dir, un Enginyer de cabina pot passar a ser còpilot si té 5
     o més anys d'antiguetat, i un copilot pot passar a ser comandant, si té 15 
     o més anys d'antiguetat.
     - Si modifiquem el valor del rang, també haurem de modificar el valor de les
     barres amb el mètode adient d'aquesta classe.
    
     NOTA: 5 anys són 157788000 segons.
    
     Retorn: cap
     */
    public void modificarTripulantCabina() {
        String nouPassaport;
        String nouNom;
        int novaEdat;
        LocalTime novesHoresVol;
        String nouRang;
        int hores;
        int minuts;

        System.out.println("Dades Actuals del tripulant de cabina: ");
        mostrarTripulantCabina();

        System.out.print("Introdueix el nou passaport: ");
        nouPassaport = DADES.nextLine();
        setPassaport(nouPassaport);
        System.out.print("Introdueix el nou nom: ");
        nouNom = DADES.nextLine();
        setNom(nouNom);
        System.out.print("Introdueix la nova edat:");
        novaEdat = DADES.nextInt();
        DADES.nextLine();
        setEdat(novaEdat);
        System.out.print("Introdueix les noves hores de vol: ");
        hores = DADES.nextInt();
        DADES.nextLine();
        System.out.print("Introdueix els nous minuts de vol: ");
        minuts = DADES.nextInt();
        DADES.nextLine();
        novesHoresVol = LocalTime.of(hores, minuts);
        setHoresVol(novesHoresVol);
        System.out.print("Introdueix el nou rang \n");
        System.out.print("C = Comandant \nCP = Copilot\nEV = Enginyer de vol");
        nouRang = DADES.nextLine();
        setRang(nouRang);

    }

    public void mostrarTripulantCabina() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + passaport + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nEdat: " + edat);
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(dataAlta));
        System.out.println("\nHores de vol: " + horesVol.getHour() + ":" + horesVol.getMinute());
        System.out.println("\nRang: " + rang);
        System.out.println("\nBarres: " + barres);
    }

    /*
     Paràmetres: rang
     Accions:
     - Se li assignarà a l'atribut barres el valor corresponent segons el rang introduït
     per paràmetre i les especificacions de l'enunciat de la UF1 del mòdul 5, és a dir, 
     en el cas del copilot, 2 barres si té menys de 1500 hores de vol i 3 si té 1500 o més, 
     en el cas del comandant sempre 4 i en el cas de l'enginyer de vol sempre 1.
     Retorn: número de barres
     */
    public void assignarBarres(String pRang) {
        switch (pRang) {
            case "Copilot":
                if (horesVol.getHour() < 1500) {
                    barres = 2;
                } else {
                    barres = 3;
                }
                break;
            case "Comandant":
                barres = 4;
                break;
            case "Enginyer":
                barres = 1;
        }
    }
}
