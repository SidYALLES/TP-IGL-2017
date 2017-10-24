/**
 * Creer par Yalles and Kaci on 19/10/2017.
 * c'est une classe qui gére l'exeption "La taille des deux vecteurs est differentes,impossible de faire la somme"
 * @version 1.0.1
 */
public class TailleException extends Exception {
    public TailleException(){
        super("La taille des deux vecteurs est differentes,impossible de faire la somme");
    }
}
