package studentaind;

import java.util.ArrayList;
import java.util.List;

public class Studentas {

    private String vardas;
    private String pavarde;
    private int pazymys;
    private ArrayList[] pazymiai;
    private ArrayList pazymiuListas = new ArrayList();


    public Studentas(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pazymys = 0;
        this.pazymiuListas = pazymiuListas;

    }



    public String arTuriPazymi(Object sk) {
        String name = " ";
        for (int i = 0; i < pazymiuListas.size(); i++) {
            if (sk == getPazymiuListas().get(i)) {
                name = this.pavarde;
            }
        }
        return name;
    }

    public ArrayList[] addPazymiusILista(int pazymys) {
        pazymiuListas.add(pazymys);
        return this.pazymiai;
    }

    public ArrayList getPazymiuListas() {
        return pazymiuListas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getPazymys() {
        pazymys = (int) (Math.random() * 10 + 1);
        return pazymys;
    }

    public ArrayList[] getPazymiai() {
        return pazymiai;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde + " su pažymiais: " + this.pazymiuListas;
    }
    
    

}
