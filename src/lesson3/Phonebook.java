package lesson3;

import java.util.*;


public class Phonebook {
    private Map <String, List<String> > map = new HashMap<>();


    public List<String> get (String name) {
        return map.get(name);

    }

    public void add(String name, String number){
        List<String> tell = map.getOrDefault(name, new ArrayList<>());
        tell.add(number);
        map.put(name, tell);
    }
}

