
package mo1704interfacelist;


public class Lanche extends Pedido {
    private String tamanho;

    public Lanche(String tamanho, String nome, double preco) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
