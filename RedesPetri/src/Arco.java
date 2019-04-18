public class Arco {

    private int peso;
    private boolean val_arco = false;

    public Arco(int peso) {
        if (peso < 0) {
            System.out.println("VALOR INVALIDO!");
        }
        if (peso == 0) {
            this.peso = 1;
        } else {
            this.peso = peso;
        }
    }

    public int getPesoArco() {
        return peso;
    }

    public boolean validaArco(Lugar lugar) {
        int marca = lugar.getMarca();
        if (marca >= peso) {
            val_arco = true;
        } else {
          //System.out.println("TRANSIÇÃO NÃO ATIVADA!");
          return val_arco;
        }

        return val_arco;
    }

}
