package lesson3;

import java.util.*;


public class Phonebook {
    private Map <String, List<String> > map = new HashMap<>();


    public void get (String name) {
        int l = 0;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey().equals(name)) {
                    System.out.println(entry.getKey() + " have number: " + entry.getValue());
                    l++;
                }
            }
        if ( l == 0 ) {
            System.out.println("Surname " + name + " not found");
        }
    }

    public void add(String name, String number){
        int l=0;
        if (map.isEmpty()) {
            map.put(name, new ArrayList<>(Collections.singletonList(number)));
        } else {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey().equals(name)) {
                    entry.getValue().add(number);
                    l++;
                }
            }
        }
        if (l == 0) {
            map.put(name, new ArrayList<>(Collections.singletonList(number)));
        }

    }



}

