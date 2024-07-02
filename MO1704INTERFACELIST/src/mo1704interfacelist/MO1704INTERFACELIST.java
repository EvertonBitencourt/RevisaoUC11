
package mo1704interfacelist;

import java.util.List;
import java.util.Scanner;

public class MO1704INTERFACELIST {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String nomeCliente = entrada.nextLine();
       
       Comanda comanda = new Comanda(nomeCliente);
       boolean continuar = true;
       while(continuar){
           System.out.println("Digite o tipo do pedido (bebida ou lanhce): ");
           String tipoPedido = entrada.nextLine();
           System.out.println("Digite o nome do item a ser pedido: ");
           String nomePedido = entrada.nextLine();
           System.out.println("Digite o valor do item: ");
           double precoPedido = entrada.nextDouble();
           entrada.nextLine();
           Pedido pedido;
           if(tipoPedido.equalsIgnoreCase("bebida")){
               System.out.println("Digite o tipo da bebida: ");
               String tipoBebida = entrada.nextLine();
               pedido = new Bebida(tipoBebida,nomePedido, precoPedido);
           }else if(tipoPedido.equalsIgnoreCase("lanche")){
               System.out.println("Digite o tipo da bebida: ");
               String tamanho = entrada.nextLine();
               pedido = new Bebida(tamanho,nomePedido, precoPedido);
           }else{
               System.out.println("Tipo de pedido invalido. Fechando comanda");
               return;
           }
           comanda.adicionarPedido(pedido);
           System.out.println("Deseja adicionar outro produto? ");
            String resposta = entrada.nextLine();
            if(!resposta.equalsIgnoreCase("s")){
                continuar = false;
            }
       }
        
        System.out.println("Comando do cliente " + comanda.getNomeCliente()+": ");
        List<Pedido> pedidos = comanda.getPedidos();
        for(Pedido pedido : pedidos){
            if(pedido instanceof Bebida){
                System.out.println("Bebida: " + pedido.getNome() + " - Tipo: " + 
                        ((Bebida) pedido).getTipo() + " - Preço: R$" + pedido.getPreco());
            }else if(pedido instanceof Lanche) {
                System.out.println("Lanche: " + pedido.getNome() + 
                        " - Tamanho: " + ((Lanche) pedido).getTamanho() + " - Preço: R$" + pedido.getPreco());
            }
        }
        System.out.println("Total da comanda: "+ comanda.calcularTotal());
    }
        
}
