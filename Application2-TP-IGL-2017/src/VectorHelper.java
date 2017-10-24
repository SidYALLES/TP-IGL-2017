import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Creer par Yalles and Kaci on 18/10/2017.
 * c'est une classe utilitaire qui offre quelques méthodes pour traiter les tableaux
 * @version 1.0.1
 */
public class VectorHelper
{
    /**
     * trier un vecteur donné en parametre selon la méthode des bulles
     * @param tab vecteur
     */
    public static void triVect(ArrayList<Integer> tab)
    {
        int i,j,v;
        for(i=0;i<tab.size()-1;i++){
            for(j=0;j<tab.size()-1-i;j++){
                if(tab.get(j)>tab.get(j+1)){
                    v=tab.get(j);
                    tab.set(j,tab.get(j+1));
                    tab.set(j+1,v);
                }
            }
        }
    }

    /**
     *
     * @param tab1 premier vecteur
     * @param tab2 deuxiéme vecteur
     * @return tab vecteur contenant la somme des deux vecteurs
     * @throws TailleException renvoi une exception si les tailles des deux vecteurs sont différentes
     */
    public static ArrayList<Integer> somVect(ArrayList<Integer> tab1,ArrayList<Integer> tab2) throws TailleException
    {
        ArrayList<Integer> tab=new ArrayList<Integer>();
        if(tab1.size()!=tab2.size()){
            throw new TailleException();
        }
        else{
            for(int i=0;i<tab1.size();i++){
                tab.add(tab1.get(i)+tab2.get(i));
            }
        }
        return tab;
    }

    /**
     * inverser les élements d'un vecteur
     * @param tab vecteur
     */
    public static void invVect(ArrayList<Integer> tab)
    {
        int i,v,j=tab.size()-1;
        for(i=0;i<tab.size()/2;i++){
            v=tab.get(i);
            tab.set(i,tab.get(j));
            tab.set(j,v);
            j--;
        }
    }

    /**
     * renvoie les extremums d'un vecteur ( min et max)
     * @param tab vecteur
     * @return extremum un vecteur contenant le min(dans la 1 case) et le max (dans la 2 case)
     */
     public static ArrayList<Integer> extVect(ArrayList<Integer> tab)
        {
            int max=0,min=0;
            ArrayList<Integer> extremums=new ArrayList<Integer>();
            int entier;
            if(tab.size()>0)
            {
                max=tab.get(0);
                min=tab.get(0);
                Iterator<Integer> it=tab.iterator();
                while (it.hasNext())
                {
                    entier=it.next();
                    if (entier>max) max=entier;
                    if (entier<min) min=entier;
                }
                extremums.add(0,min);
                extremums.add(1,max);
                return extremums;
            }
            else
            {
                return null;
            }
        }

    /**
     *
     *Applique une formule x^2-1 sur les élements d'un vecteur
     * @param tab vecteur donné en parametre
     */
        public static void formulVect(ArrayList<Integer> tab)
        {
            int size=tab.size();
            for(int i=0;i<size;i++)
            {
                tab.set(i,formule(tab.get(i)));
            }
        }

        public static int formule(int n,int m)
        {
            int a=0 ;
            m=a+5;
            n=a-3;
            return m*n;
        }
}
