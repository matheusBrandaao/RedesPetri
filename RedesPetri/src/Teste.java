import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    private ArrayList<Lugar> lugares = new ArrayList<>();
    private ArrayList<Transicoes> trans = new ArrayList<>();

    public void leitura_iterativa() {

    }

    public void leitura_arquivo() {

    }

    public static void main(String[] args) {

        Arco a1 = new Arco(1);
        Arco a2 = new Arco(3);

        Lugar l1 = new Lugar(1, 1, a1);
        Lugar l2 = new Lugar(2, 3, a2);

        ArrayList<Lugar> l = new ArrayList<>();
        ArrayList<Arco> a = new ArrayList<>();
        ArrayList<Transicoes> t = new ArrayList<>();

        l.add(l1);
        l.add(l2);

        a.add(a1);
        a.add(a2);

        Transicoes t1 = new Transicoes(1, l, a);
        
        t.add(t1);

        t1.alt_trans();
        t1.exibe(t);

        System.out.println(a1.getPesoArco());

    }
}
