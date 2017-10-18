import java.util.ArrayList;

/**
 * Created by acer on 18/10/2017.
 */
public class VectorHelper {
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
                    tab.set(j,tab.get(j));
                    tab.set(j+1,v);
                }
            }
        }
    }
    public static ArrayList<Integer> somVect(ArrayList<Integer> tab1,ArrayList<Integer> tab2)throws TailleException
    {}
    public static void invVect(ArrayList<Integer> tab)
    {}
    public static ArrayList<Integer> extVect(ArrayList<Integer> tab)
    {}
    public static void formulVect(ArrayList<Integer> tab)
    {}
    public static int formule(int n)
    {}


    }
