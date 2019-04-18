public class Arco {

    private int peso;
    private boolean val_arco = false;
    private boolean tipo_arco = true; //arco entrada = true. Arco saida = false

    public Arco(int peso, boolean tipo_arco) {
        if (peso < 0) {
            System.out.println("VALOR INVALIDO!");
        }
        if (peso == 0) {
            this.peso = 1;
        } else {
            this.peso = peso;
        }
        this.tipo_arco = tipo_arco;
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
    
    public boolean getTipo(){
        return tipo_arco;
    }

}
