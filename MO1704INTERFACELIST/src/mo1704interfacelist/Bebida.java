
package mo1704interfacelist;

public class Bebida extends Pedido{
    private String tipo;

    public Bebida(String tipo, String nome, double preco) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
