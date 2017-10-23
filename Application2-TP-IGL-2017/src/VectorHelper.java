import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;

public class VectorHelper
{
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

        public static void formulVect(ArrayList<Integer> tab)
        {
            int size=tab.size();
            for(int i=0;i<size;i++)
            {
                tab.set(i,formule(tab.get(i)));
            }
        }

        public static int formule(int n)
        {
            return n*n-1;
        }
}
