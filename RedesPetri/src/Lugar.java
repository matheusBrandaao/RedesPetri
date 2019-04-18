public class Lugar {

    private int id;
    private int marca; //necessario validar a marca
    private boolean val_arco = false; //validação do arco
    private Arco arco;

    public Lugar(int id, int marca, Arco arco) {
        this.id = id;
        if (marca < 0) {
            System.out.println("Valor invalido!");
        } else {
            this.marca = marca;
        }
        this.arco = arco;
    }

    public int getId() {
        return id;
    }

    public int getMarca() {
        return marca;
    }

    public Arco getArco() {
        return this.arco;
    }

    public void consome() {
        marca = marca - arco.getPesoArco();
    }  
    
    /*
     public boolean validaArco(Arco arco){
     int pArco = arco.getPesoArco();
     if(marca >= pArco)
     val_arco = true;
     else
     System.out.println("TRANSICAO NÃO ATIVADA!");

     return val_arco;
     }
     */
}
