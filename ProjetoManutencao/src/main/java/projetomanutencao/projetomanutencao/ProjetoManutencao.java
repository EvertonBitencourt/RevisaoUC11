
package projetomanutencao.projetomanutencao;

import javax.swing.SwingUtilities;


public class ProjetoManutencao {
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                CadastroManutencao tela = new CadastroManutencao();
                tela.setVisible(true);
        }
    });
}
}
