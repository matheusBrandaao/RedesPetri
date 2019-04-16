import java.util.ArrayList;

public class Transicoes {

    private int id;
    private boolean transHab = false;
    private ArrayList<Lugar> lugares = new ArrayList<Lugar>();
    private ArrayList<Arco> arco = new ArrayList<>();

    public Transicoes(int id, ArrayList lugares, ArrayList arco) {
        this.id = id;
        this.lugares = lugares;
        this.arco = arco;
    }
    
    //AJUSTAR POIS ESTÁ HABILITANDO A TRANSICAO APENAS COM A ATIVACAO DE UM LUGAR/ARCO
    public void alt_trans() {
        boolean aux = false;
        for (int i = 0; i < lugares.size(); i++) {
            arco.add(lugares.get(i).getArco());
            aux = arco.get(i).validaArco(lugares.get(i));
            //aux = lugares.get(i).validaArco(lugares.get(i).getArco());        
            if (aux == true) {
                transHab = true;
                lugares.get(i).consome();
                System.out.println("TRANSIÇÃO HABILITADA");
            } else {
                System.out.println("TRANSIÇÃO NÃO HABILITADA!");
            }
        }
    }

    public void sorteio() {
        // sorteio da marca entre transições 
        // quando um lugar pode ir para uma ou outra transicao
    }

    public int getId() {
        return id;
    }

    public boolean getHabilitado() {
        return transHab;
    }

    public void add(Lugar lugar) {
        lugares.add(lugar);
    }

    public void exibe(ArrayList<Transicoes> trans) {
        int[] aux = new int[lugares.size()];
        for (int i = 0; i < lugares.size(); i++) {
            aux[i] = lugares.get(i).getMarca();
        }
        System.out.println("Quantidade de marcas");
        for (int i = 0; i < aux.length; i++) {
            System.out.println("Lugar " + lugares.get(i).getId() + " | " + aux[i]);
        }
        System.out.println("Transições Habilitadas");
        for (int i = 0; i < trans.size(); i++) {
            System.out.println("Transição " + trans.get(i).getId() + " | " + getHabilitado());
        }
    }
}
