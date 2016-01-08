package hackerrank.dictionaresandmaps;

import java.util.*;

/**
 * Created by ramon on 08-01-16.
 */
public class DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        List<String> queries = new ArrayList<String>();
        int N=in.nextInt();
        in.nextLine();
        for(int i=0;i<N;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name,phone);
            in.nextLine();
        }

        while (N>0){
            String s = in.nextLine();
            if(map.containsKey(s)){
                System.out.println(s+"="+map.get(s));
            }else{
                System.out.println("Not found");
            }
            N--;
        }

/*
        while (N>0){
            String s=in.nextLine();
            queries.add(s);
            N--;
        }

        for (String query : queries) {
            if(map.containsKey(query)){
                System.out.println(query+"="+map.get(query));
            }else{
                System.out.println("Not found");
            }
        }
*/

        }

}

