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
        Studentas simonasG = new Studentas("Simonas", "Gentvilas");
        Studentas dainius = new Studentas("Dainius", "Kreivys");
        Studentas ausrine = new Studentas("Aušrinė", "Armonaitė");
        Studentas gintare = new Studentas("Gintarė", "Skaistė");
        Studentas arvydas = new Studentas("Arvydas", "Anušauskas");
        Studentas simonasK = new Studentas("Simonas", "Kairys");
        Studentas monika = new Studentas("Monika", "Navickienė");
        Studentas marius = new Studentas("Marius", "Skuodis");
        Studentas arunas = new Studentas("Arūnas", "Dulkys");
        Studentas jurgita = new Studentas("Jurgita", "Šiugždinienė");
        Studentas evelina = new Studentas("Evelina", "Dobrovolska");
        Studentas gabrielius = new Studentas("Gabrielius", "Landsbergis");
        Studentas agne = new Studentas("Agnė", "Bilotaitė");
        Studentas kestutis = new Studentas("Kęstutis", "Navickas");

        stud.add(simonasG);
        stud.add(dainius);
        stud.add(ausrine);
        stud.add(gintare);
        stud.add(arvydas);
        stud.add(simonasK);
        stud.add(monika);
        stud.add(marius);
        stud.add(arunas);
        stud.add(jurgita);
        stud.add(evelina);
        stud.add(gabrielius);
        stud.add(agne);
        stud.add(kestutis);

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
