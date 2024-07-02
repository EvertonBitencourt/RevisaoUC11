
package projetomanutencao.projetomanutencao;

public class CarroManutencao {
    private String placa;
    private String kmAtual;
    private String dataManutencao;
    private String tipoManutencao;

    public CarroManutencao(String placa, String kmAtual, String dataManutencao, String tipoManutencao) {
        this.placa = placa;
        this.kmAtual = kmAtual;
        this.dataManutencao = dataManutencao;
        this.tipoManutencao = tipoManutencao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(String kmAtual) {
        this.kmAtual = kmAtual;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    @Override
    public String toString() {
        return "CarroManutencao{" + "placa=" + placa + ", kmAtual=" + kmAtual + ", dataManutencao=" + dataManutencao + ", tipoManutencao=" + tipoManutencao + '}';
    }
    
    
    
}
