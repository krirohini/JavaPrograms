package com.datastructure.programs.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public String getCommonManager(String empList){
        String[] emp = empList.split(",");
        HashMap<String,String> map = new HashMap<String,String>();
        for(int i=0;i<emp.length-2;i++){
            String[] relation = emp[i].split("->");
            map.put(relation[1],relation[0]);
        }
        String firstPerson = emp[emp.length-1];
        String secondPerson = emp[emp.length-2];
        String firstPersonManager = firstPerson;
        String secondPersonManager = secondPerson;
        HashSet<String> set = new HashSet<String>();
        while(map.containsKey(firstPersonManager)||map.containsKey(secondPersonManager)){
            if(map.containsKey(firstPersonManager)){
                firstPersonManager = map.get(firstPersonManager);
                if(!set.add(firstPersonManager)) return firstPersonManager;
            }
            if(map.containsKey(secondPersonManager)){
                secondPersonManager = map.get(secondPersonManager);
                if(!set.add(secondPersonManager)) return secondPersonManager;
            }
        }
        return "";
    }
    public static void main(String[] args) throws IOException {
        Main testMain = new Main();
        String ipt1 = "Frank->Mary,Mary->Sam,Mary->Bob,Sam->Katie,Sam->Pete,Bob->John,Bob,Katie";
        String ipt2 = "Sam->Pete,Pete->Nancy,Sam->Katie,Mary->Bob,Frank->Mary,Mary->Sam,Bob->John,Sam,John";
        String ipt3 = "Tom->Mary,Mary->Bob,Mary->Sam,Bob->John,Sam->Pete,Sam->Katie,Pete,Katie";
        System.out.println(testMain.getCommonManager(ipt1));
        
       /* BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        
        Main obj = new Main();
        
        while ((s = in.readLine()) != null) {
          System.out.println(obj.getCommonManager(s));
        }*/
    }
}
