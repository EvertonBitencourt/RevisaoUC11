
package mo1704interfacelist;

import java.util.ArrayList;
import java.util.List;


public class Comanda {
    private String nomeCliente;
    private List<Pedido> pedidos;

    public Comanda(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.pedidos = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void adicionarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public double calcularTotal(){
        double total = 0.0;
        for(Pedido pedido : pedidos){
            total += pedido.getPreco();
        }
        return total;
    }
}
