import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by acer on 18/10/2017.
 */
public class VectorHelper
{
    import java.util.ArrayList;

    public class VectorHelper
    {
        public static void triVect(ArrayList<Integer> tab)
        {}

        public static ArrayList<Integer> somVect(ArrayList<Integer> tab1,ArrayList<Integer> tab2)throws TailleException
        {}

        public static void invVect(ArrayList<Integer> tab)
        {
            int i,v,j=tab.size()-1;
            for(i=0;i<tab.size()/2;i++)
            {
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
}
