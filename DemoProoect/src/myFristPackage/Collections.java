package myFristPackage;

import java.util.HashSet;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("Mark");
        name.add("tom");
        name.add("jack");
        name.add("july");
        name.add("patrik");
        Iterator<String> itr = name.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
    }
}
