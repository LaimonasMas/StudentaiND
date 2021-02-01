/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentaind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Laimonas
 */
public class StudentaiND {

    public static void main(String[] args) {

        ArrayList<Studentas> stud = new ArrayList();

        Map map = new HashMap();

        stud.add(new Studentas("Simonas", "Gentvilas"));
        stud.add(new Studentas("Dainius", "Kreivys"));
        stud.add(new Studentas("Aušrinė", "Armonaitė"));
        stud.add(new Studentas("Gintarė", "Skaistė"));
        stud.add(new Studentas("Arvydas", "Anušauskas"));
        stud.add(new Studentas("Simonas", "Kairys"));
        stud.add(new Studentas("Monika", "Navickienė"));
        stud.add(new Studentas("Marius", "Skuodis"));
        stud.add(new Studentas("Arūnas", "Dulkys"));
        stud.add(new Studentas("Jurgita", "Šiugždinienė"));
        stud.add(new Studentas("Evelina", "Dobrovolska"));
        stud.add(new Studentas("Gabrielius", "Landsbergis"));
        stud.add(new Studentas("Agnė", "Bilotaitė"));
        stud.add(new Studentas("Kęstutis", "Navickas"));

        for (int i = 0; i < stud.size(); i++) {
            for (int j = 1; j <= 5; j++) {
                stud.get(i).addPazymiusILista(stud.get(i).getPazymys());
            }
        }
        System.out.println(stud);
        
        for (int j = 1; j <= 10; j++) {
            System.out.println(" ");
            System.out.println(j + "-tą turi: ");
            System.out.println(" ");
            for (int i = 0; i < stud.size(); i++) {
                if (stud.get(i).getPavarde() == stud.get(i).arTuriPazymi(j)) {
                    map.put(j, stud.get(i).getPavarde());
                    System.out.println(map.get(j));                      
                }                
            }                        
        }
        


    }
}
