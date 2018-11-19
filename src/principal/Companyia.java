/*
 * Classe que defineix una companyia. Una companyia es defineix per un codi i un 
 * nom. A més, contindrà vectors amb avions, rutes nacionals, rutes internacionals,
 * rutes intercontinentals, rutes transocèaniques, tripulants de cabina, TCPs i vols.
 */
package principal;

import components.Avio;
import components.RutaIntercontinental;
import components.RutaInternacional;
import components.RutaNacional;
import components.RutaTransoceanica;
import components.TCP;
import components.TripulantCabina;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Companyia {

    private static Scanner DADES = new Scanner(System.in);

    private int codi;
    private static int properCodi = 1; //El proper codi a assignar
    private String nom;
    private Avio[] avions;
    private int posicioAvions; //Possició actual buida del vector avions
    private RutaNacional[] rutesNacionals;
    private int posicioRutesNacionals; //Possició actual buida del vector rutesNacionals
    private RutaInternacional[] rutesInternacionals;
    private int posicioRutesInternacionals; //Possició actual buida del vector rutesInternacionals
    private RutaIntercontinental[] rutesIntercontinentals;
    private int posicioRutesIntercontinentals; //Possició actual buida del vector rutesIntercontinentals
    private RutaTransoceanica[] rutesTransoceaniques;
    private int posicioRutesTransoceaniques; //Possició actual buida del vector rutesTransoceaniques
    private TripulantCabina[] tripulantsCabina;
    private int posicioTripulantsCabina; //Possició actual buida del vector tripulantsCabina
    private TCP[] tcps;
    private int posicioTcps; //Possició actual buida del vector tcps
    private Vol[] vols;
    private int posicioVols; //Possició actual buida del vector vols

    /*
     CONSTRUCTOR
     Paràmetres: valor per l'atribut nom
     Accions:
     - Assignar a l'atribut corresponent el valor passat com a paràmetre
     - Assignar a l'atribut codi el valor de l'atribut properCodi i actualitzar
     properCodi amb el següent codi a assignar.
     - avions s'ha d'inicialtizar buit i amb una capacitat per 200 avions.
     - rutesNacionals s'ha d'inicialtizar buit i amb una capacitat per 100 rutes nacionals.
     - rutesInternacionals s'ha d'inicialtizar buit i amb una capacitat per 200 rutes internacionals.
     - rutesIntercontinentals s'ha d'inicialtizar buit i amb una capacitat per 100 rutes intercontinentals.
     - rutesTransoceaniques s'ha d'inicialtizar buit i amb una capacitat per 45 rutes transoceàniques.
     - tripulantsCabina s'ha d'inicialtizar buit i amb una capacitat per 600 tripulants de cabina.
     - tcps s'ha d'inicialtizar buit i amb una capacitat per 1000 TCPs.
     - vols s'ha d'inicialtizar buit i amb una capacitat per 700 vols.
     - posicioRutesNacionals, posicioRutesInternacionals, posicioRutesIntercontinentals, posicioRutesTransoceaniques, 
       posicioTripulantsCabina, posicioTcps i posicioVols, s'han d'inicialitzar a 0, què serà la primera posició
       buida dels vectors inicilitzats.
     */
    public Companyia(String nouNom) {
        this.nom = nouNom;
        this.codi = properCodi;
        properCodi++;
        this.avions = new Avio[200];
        this.rutesNacionals = new RutaNacional[100];
        this.rutesInternacionals = new RutaInternacional[200];
        this.rutesIntercontinentals = new RutaIntercontinental[100];
        this.rutesTransoceaniques = new RutaTransoceanica[45];
        this.tripulantsCabina = new TripulantCabina[600];
        this.tcps = new TCP[1000];
        this.vols = new Vol[700];

        this.posicioRutesNacionals = 0;
        this.posicioRutesInternacionals = 0;
        this.posicioRutesIntercontinentals = 0;
        this.posicioRutesTransoceaniques = 0;
        this.posicioTripulantsCabina = 0;
        this.posicioTcps = 0;
        this.posicioVols = 0;

    }

    /*
     Mètodes accessors    
     */
    public int getCodi() {
        return this.codi;
    }

    public int getProperCodi() {
        return properCodi;
    }

    public String getNom() {
        return this.nom;
    }

    public Avio[] getAvions() {
        return this.avions;
    }

    public int getPosicioAvions() {
        return this.posicioAvions;
    }

    public RutaNacional[] getRutesNacionals() {
        return this.rutesNacionals;
    }

    public int getPosicioRutesNacionals() {
        return this.posicioRutesNacionals;
    }

    public RutaInternacional[] getRutesInternacionals() {
        return this.rutesInternacionals;
    }

    public int getPosicioRutesInternacionals() {
        return this.posicioRutesInternacionals;
    }

    public RutaIntercontinental[] getRutesIntercontinentals() {
        return this.rutesIntercontinentals;
    }

    public int getPosicioRutesIntercontinentals() {
        return this.posicioRutesIntercontinentals;
    }

    public RutaTransoceanica[] getRutesTransoceaniques() {
        return this.rutesTransoceaniques;
    }

    public int getPosicioRutesTransoceaniques() {
        return this.posicioRutesTransoceaniques;
    }

    public TripulantCabina[] getTripulantsCabina() {
        return this.tripulantsCabina;
    }

    public int getPosicioTripulantsCabina() {
        return this.posicioTripulantsCabina;
    }

    public TCP[] getTcps() {
        return this.tcps;
    }

    public int getPosicioTcps() {
        return this.posicioTcps;
    }

    public Vol[] getVols() {
        return this.vols;
    }

    public void setCodi(int nouCodi) {
        this.codi = nouCodi;
    }

    public void setNom(String nouNom) {
        this.nom = nouNom;
    }

    public void setAvions(Avio[] avions) {
        this.avions = avions;
    }

    public void setRutesNacionals(RutaNacional[] rutesNacionals) {
        this.rutesNacionals = rutesNacionals;
    }

    public void setRutesInternacionals(RutaInternacional[] rutesInternacionals) {
        this.rutesInternacionals = rutesInternacionals;
    }

    public void setRutesIntercontinentals(RutaIntercontinental[] rutesIntercontinentals) {
        this.rutesIntercontinentals = rutesIntercontinentals;
    }

    public void setRutesTransoceaniques(RutaTransoceanica[] rutesTransoceaniques) {
        this.rutesTransoceaniques = rutesTransoceaniques;
    }

    public void setTripulantsCabina(TripulantCabina[] tripulantsCabina) {
        this.tripulantsCabina = tripulantsCabina;
    }

    public void setTcps(TCP[] tcps) {
        this.tcps = tcps;
    }

    public void setVols(Vol[] vols) {
        this.vols = vols;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova Companyia. Les dades
     a demanar són les que necessita el constructor.
     - Heu de tenir en compte que el nom de la companyia, poden ser frases, per exemple,
     Singapore Airlines.
     Retorn: La nova companyia.
     */
    public static Companyia novaCompanyia() {
        String nouNom;
        System.out.print("Inserta el nom de la nova companyia: ");
        nouNom = DADES.nextLine();

        return new Companyia(nouNom);

    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte. En aquest cas
     no es pot modificar el contingut dels vectors, només el de l'atribut nom. 
     Evidentment, tampoc podeu modificar el codi.
     - Li heu de mostrar a l'usuari els valor actual del nom de l'objecte
     actual, abans de modificar-lo.
     Retorn: cap
     */
    public void modificarCompanyia() {
        String nouNom;
        System.out.println("Dades actuals de la companyia...\n");
        mostrarCompanyia();

        System.out.print("Introdueix el nou nom de la companyia: ");
        nouNom = DADES.nextLine();
        this.setNom(nouNom);

    }

    public void mostrarCompanyia() {
        System.out.println("\nLes dades de la companyia amb codi " + codi + " són:");
        System.out.println("\nNom:" + nom);
    }

    /*
     AVIÓ
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou avió al vector d'avions de l'objecte actual (el que cridarà
     al mètode), fent servir el mètode de la classe Avio pertinent.
     - actualitza la posició del vector d'avions.
     Retorn: cap
     */
    public void afegirAvio() {
        avions[posicioAvions] = Avio.nouAvio();
        posicioAvions++;
    }

    public int seleccionarAvio() {

        System.out.println("\nCodi de l'avió?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioAvions && !trobat; i++) {
            if (avions[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA NACIONAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta nacional al vector de rutes nacionals de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaNacional pertinent.
     - actualitza la posició del vector de rutes nacionals.
     Retorn: cap
     */
    public void afegirRutaNacional() {
        rutesNacionals[posicioRutesNacionals] = RutaNacional.novaRutaNacional();
        posicioRutesNacionals++;
    }

    public int seleccionarRutaNacional() {

        System.out.println("\nCodi de la ruta nacional?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesNacionals && !trobat; i++) {
            if (rutesNacionals[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA INTERNACIONAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta internacional al vector de rutes internacionals de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaInternacional pertinent.
     - actualitza la posició del vector de rutes internacionals.
     Retorn: cap
     */
    public void afegirRutaInternacional() {
        rutesInternacionals[posicioRutesInternacionals] = RutaInternacional.novaRutaInternacional();
        posicioRutesInternacionals++;
    }

    public int seleccionarRutaInternacional() {

        System.out.println("\nCodi de la ruta internacional?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesInternacionals && !trobat; i++) {
            if (rutesInternacionals[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA INTERCONTINENTAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta intercontinental al vector de rutes intercontinental de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaIntercontinental pertinent.
     - actualitza la posició del vector de rutes intercontinental.
     Retorn: cap
     */
    public void afegirRutaIntercontinental() {
        rutesIntercontinentals[posicioRutesIntercontinentals] = RutaIntercontinental.novaRutaInternacional();
        posicioRutesIntercontinentals++;
    }

    public int seleccionarRutaIntercontinental() {

        System.out.println("\nCodi de la ruta intercontinental?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesIntercontinentals && !trobat; i++) {
            if (rutesIntercontinentals[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA TRANSOCEÀNICA
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta transoceànica al vector de rutes transoceàniques de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaTransoceanica pertinent.
     - actualitza la posició del vector de rutes transoceàniques.
     Retorn: cap
     */
    public void afegirRutaTransoceanica() {
        rutesTransoceaniques[posicioRutesTransoceaniques] = RutaTransoceanica.novaRutaTransoceanica();
        posicioRutesTransoceaniques++;
    }

    public int seleccionarRutaTransoceanica() {

        System.out.println("\nCodi de la ruta transoceànica?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioRutesTransoceaniques && !trobat; i++) {
            if (rutesTransoceaniques[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     TRIPULACIÓ CABINA
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou tripulant de cabina al vector de tripulants de cabina de 
     l'objecte actual (el que cridarà al mètode), fent servir el mètode de la classe 
     TripulantCabina pertinent.
     - actualitza la posició del vector de tripulants de cabina.
     Retorn: cap
     */
    public void afegirTripulantCabina() {
        tripulantsCabina[posicioTripulantsCabina] = TripulantCabina.nouTripulantCabina();
        posicioTripulantsCabina++;
    }

    public int seleccionarTripulantCabina() {

        System.out.println("\nCodi del tripulant de cabina?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioTripulantsCabina && !trobat; i++) {
            if (tripulantsCabina[i].getPassaport().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     TCP
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou TCP al vector de TCPs de l'objecte actual (el que cridarà 
     al mètode), fent servir el mètode de la classe TCP pertinent.
     - actualitza la posició del vector de TCPs.
     Retorn: cap
     */
    public void afegirTCP() {
        tcps[posicioTcps] = TCP.nouTCP();
        posicioTcps++;
    }

    public int seleccionarTCP() {

        System.out.println("\nCodi del tripulant de la cabina de passatgers?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioTcps && !trobat; i++) {
            if (tcps[i].getPassaport().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     VOL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou vol al vector de vols de l'objecte actual (el que cridarà 
     al mètode), fent servir el mètode de la classe Vol pertinent.
     - actualitza la posició del vector de vols.
     Retorn: cap
     */
    public void afegirVol() throws ParseException {
        vols[posicioVols] = Vol.nouVol();
        posicioVols++;
    }

    public int seleccionarVol() {

        System.out.println("\nCodi del vol?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioVols && !trobat; i++) {
            if (vols[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     Paràmetres: cap
     Accions:
     - afegeix l'avió seleccionat de la companyia al vol seleccionat, si el vol i l'avió 
     existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar els 
     avió i vol, i el mètode escaient de la classe Vol per afegir l'avió al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap avió i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi l'avió
     li mostrarem el missatge "\nNo existeix aquest avió"
     Retorn: cap
     */
    public void afegirAvioVol() {
        int vol = seleccionarVol();
        int avio = seleccionarAvio();

        if (avio > -1 && vol > -1) {
            vols[vol].setAvio(avions[avio]);
            System.out.println("Avió afegit al vol correctament\n");
        } else if (avio < 0) {
            System.out.println("\nNo existeix aquest avió");
        } else {
            System.out.println("\nNo existeix aquest vol");
        }
    }

    /*
     Paràmetres: cap
     Accions:
     - afegeix el tripulant de cabina seleccionat de la companyia al vector de
     tripulació de cabina del vol seleccionat, si el vol i el tripulant de cabina
     existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar el 
     tripulant de cabina i vol, i el mètode escaient de la classe Vol per afegir 
     el tripulant de cabina al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap tripulant de cabina i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi el tripulant de cabina
     li mostrarem el missatge "\nNo existeix aquest tripulant de cabina"
     Retorn: cap
     */
    public void afegirTripulantCabinaVol() {
        int vol = seleccionarVol();
        int tripulant = seleccionarTripulantCabina();

        if (tripulant > -1 && vol > -1) {
            vols[vol].afegirTripulantCabina(tripulantsCabina[tripulant]);
            System.out.println("Tripulant de Cabina afegit al vol correctament\n");
        } else if (tripulant < 0) {
            System.out.println("\nNo existeix aquest tripulant");
        } else {
            System.out.println("\nNo existeix aquest vol");
        }
    }

    /*
     Paràmetres: cap
     Accions:
     - afegeix el TCP seleccionat de la companyia al vector de TCPs del vol seleccionat, 
     si el vol i el TCP existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar el 
     TCP i vol, i el mètode escaient de la classe Vol per afegir el TCP al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap TCP i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi el TCP
     li mostrarem el missatge "\nNo existeix aquest tripulant de cabina de passatgers"
     Retorn: cap
     */
    public void afegirTCPVol() {
        int vol = seleccionarVol();
        int tcp = seleccionarTCP();

        if (tcp > -1 && vol > -1) {
            vols[vol].afegirTCP(tcps[tcp]);
            System.out.println("TCP afegit al vol correctament\n");
        } else if (tcp < 0) {
            System.out.println("\nNo existeix aquest tcp");
        } else {
            System.out.println("\nNo existeix aquest vol");
        }

    }

    /*
     Paràmetres: cap
     Accions:
     - Afegeix la ruta seleccionada de la companyia al vol seleccionat, si el vol 
     i la ruta existeixen en la companyia, i actualitza el tipus de ruta del vol
     amb el tipus de la ruta afegida.    
     - Heu de tenir en compte que la ruta a seleccionar ha de ser del tipus passat
     per paràmetre, és a dir, tipus 1 és ruta nacional, tipus 2 és ruta internacional,
     tipus 3 és ruta intercontinental i tipus 4 és ruta transoceànica.
     - Heu de fer servir els mètodes escaients d'aquesta classe per seleccionar 
     la ruta i el vol, i el mètode escaient de la classe Vol per afegir la ruta
     al vol seleccionat i actualitzar el tipus de ruta.
     - Si el vol no existeix, no s'afegirà cap ruta i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi la ruta
     li mostrarem el missatge "\nNo existeix aquesta ruta"    
     Retorn: cap
     */
    public void afegirRutaVol(int tipus) {
        int vol = seleccionarVol();
        int ruta;
        switch(tipus){
            case 1:
                ruta = seleccionarRutaNacional();
                break;
            case 2:
                ruta = seleccionarRutaInternacional();
                break;
            case 3:
                ruta = seleccionarRutaIntercontinental();
                break;
            case 4: 
                ruta = seleccionarRutaTransoceanica();
                break;
            default:
                ruta = -1;
        }

        if (ruta > -1 && vol > -1) {
            vols[vol].setTipusRuta(tipus);
            System.out.println("Ruta afegida al vol correctament\n");
        } else if (ruta < 0) {
            System.out.println("\nNo existeix aquesta ruta");
        } else {
            System.out.println("\nNo existeix aquests vol");
        }
    }

}
