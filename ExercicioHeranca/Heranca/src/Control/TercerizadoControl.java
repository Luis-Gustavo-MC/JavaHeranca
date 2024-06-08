package Control;

import Model.FuncionarioTercerizado;

public class TercerizadoControl {
    private FuncionarioTercerizado tercerizado;
//Construtor
    public TercerizadoControl() {
        tercerizado = new FuncionarioTercerizado();
    }
//Gets e Sets
    public FuncionarioTercerizado getTercerizado() {
        return tercerizado;
    }

    public void setTercerizado(FuncionarioTercerizado tercerizado) {
        this.tercerizado = tercerizado;
    }
//Metodos 

public void adicionarFuncionario(String nome, Integer horasTrabalhadas, Double valorHora, Double despesaAdicional) {
    tercerizado.setNome(nome);
    tercerizado.setHorasTrabalhadas(horasTrabalhadas);
    tercerizado.setValorHora(valorHora);
    tercerizado.setDespesaAdicional(despesaAdicional);
}
public String buscarFuncionario(){
    return "" + tercerizado + "";
}
    
}
