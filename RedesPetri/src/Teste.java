import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Arco a1 = new Arco(1, true);
        Arco a2 = new Arco(3, true);
        
        Arco a3 = new Arco(1, false);
        Lugar nl = new Lugar(3, 0, a3);
        
        Lugar l1 = new Lugar(1, 3, a1);
        Lugar l2 = new Lugar(2, 9, a2);

        ArrayList<Lugar> l = new ArrayList<>();
        ArrayList<Arco> a = new ArrayList<>();
        ArrayList<Transicoes> t = new ArrayList<>();
        
        l.add(l1);
        l.add(l2);
        
        l.add(nl);

        a.add(a1);
        a.add(a2);
        
        a.add(a3);

        Transicoes t1 = new Transicoes(1, l, a);
        
        
        t.add(t1);
        t1.alt_trans();
        t1.exibe(t);

        

    }
    
    public void leitura_iterativa() {

    }

    public void leitura_arquivo() {

    }
}
