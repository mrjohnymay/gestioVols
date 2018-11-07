/*
 * Un avió es defineix pel seu codi, fabricant, model, capacitat i un vector amb 
 * les seves classes.
 */
package components;

/**
 *
 * @author root
 */
import java.util.Scanner;
public class Avio {
    
    private static Scanner dades = new Scanner (System.in);

    private String codi;
    private String fabricant;
    private String model;
    private int capacitat;
    private Classe[] classes;
    private int posicioClasses; //Atribut que controla la primera posició vuida del vector

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys classes i posicioClasses.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar el vector classes com a buit i una longitud de 4.
     - Inicialitzar l'atribut possicioClasses a 0.
     */
    
    public Avio (String codi, String fabricant, String model, int capacitat){
        this.codi = codi;
        this.fabricant = fabricant;
        this.model = model;
        this.capacitat = capacitat;
        this.classes = new Classe[4];
        this.posicioClasses = 0;
    }

    /*
    Mètodes accessors
     */
    
    public String getCodi(){
        return this.codi;
    }
    
    public String getFabricant(){
        return this.fabricant;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public int getCapacitat(){
        return this.capacitat;
    }
    
    public Classe[] getClasses(){
        return this.classes;
    }
    
    public int getPosicioClasses(){
        return this.posicioClasses;
    }
    
    public void setCodi(String codi){
        this.codi = codi;
    }
    
    public void setFabricant(String fabricant){
        this.fabricant = fabricant;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setCapacitat(int capacitat){
        this.capacitat = capacitat;
    }
    
    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou avió.
    Les dades a demanar són les que necessita el constructor.
    - També heu de tenir en compte que el fabricant o model, no tenen perquè estar 
    formats per una única paraula, per exemple, Airbus Company o Boing 777
    Retorn: El nou avió.
     */
    public static Avio nouAvio() {
        
        System.out.println("Introdueix el codi del avió: ");
        String codi = dades.nextLine();
        System.out.println("Introdueix el fabricant del avió: ");
        String fabricant = dades.nextLine();
        System.out.println("Introdueix el model del avió: ");
        String model = dades.nextLine();
        System.out.println("Introdueix la capacitat del avió: ");
        int capacitat = dades.nextInt();
        
        return new Avio(codi,fabricant,model,capacitat);
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los
     Retorn: cap
     */
    public void modificarAvio() {
        String codi = getCodi();
        String fabricant = getFabricant();
        String model = getModel();
        int capacitat = getCapacitat();
        
        System.out.println("El codi de l'avió és: " + codi + ". Introdueix el nou codi.");
        codi = dades.nextLine();
        System.out.println("El fabricant de l'avió és: " + fabricant + ". Introdueix el nou fabricant.");
        fabricant = dades.nextLine();
        System.out.println("El model de l'avió és: " + model + ". Introdueix el nou model.");
        model = dades.nextLine();
        System.out.println("La capacitat de l'avió és: " + capacitat + ". Introdueix la nova capacitat.");
        capacitat = dades.nextInt();
        dades.nextLine();
        
        setCodi(codi);
        setFabricant(fabricant);
        setModel(model);
        setCapacitat(capacitat);
        
    }

    public void mostrarAvio() {
        System.out.println("\nLes dades de l'avió amb codi " + codi + " són:");
        System.out.println("\nFabricant: " + fabricant);
        System.out.println("\nModel: " + model);
        System.out.println("\nCapacitat: " + capacitat);
    }

    /*
     Paràmetres: cap
     Accions:
     - Afegeix una nova classe al vector de classes de l'avió actual si aquesta encara 
     no s'ha afegit. S'ha de comprovar si s'ha afegit fent servir el mètode pertinent 
     d'aquesta classe, i actualitzar la posició del vector de classes.
     - Abans d'afegir la classe, també heu de comprovar que la seva capacitat sumada
     a la capacitat de les altres classes de l'avió, no superi la capacitat total
     de l'avió.
     - Si l'ingredient ja s'havia afegit o bé la seva capacitat sumada a les capacitats 
     de les altres classes supera la capacitat total de l'avió, no s'afegirà de nou i 
     li mostrarem a l'usuari el missatge "\nLa classe no s'ha pogut afegir".
     Retorn: cap
     */
    public void afegirClasse() {
        
    }

    public int seleccionarClasse(String nom) {

        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioClasses && !trobat; i++) {
            if (classes[i].getNom().equals(nom)) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }
}
