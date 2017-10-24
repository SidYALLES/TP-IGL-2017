import java.util.ArrayList;


public class VectorHelper {
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
    public static ArrayList<Integer> somVect(ArrayList<Integer> tab1,ArrayList<Integer> tab2)throws
            TailleException
    {
        ArrayList<Integer> tab=new ArrayList<Integer>();
        if(tab1.size()!=tab2.size()){
            throw new TailleException();
            
        }
        else{
            int i;
            for( i=0;i<tab1.size();i++){
                tab.add(tab1.get(i)+tab2.get(i));
            }
        }
        return tab;
    }
    public static int formule(int n)
    {
        return n*n;
    }

    }
