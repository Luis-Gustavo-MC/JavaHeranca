package Model;

public class FuncionarioTercerizado extends Funcionarios{
    private Double despesaAdicional;
//Construtor
    public FuncionarioTercerizado(String nome, Integer horasTrabalhadas, Double valorHora, Double despesaAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }
//Gets e Sets
    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

//Metodos
    public Double pagamento(){
        //Bonus + horasTrabalhadas * valorHoras
        return (despesaAdicional * 1.1) + (getHorasTrabalhadas() * getValorHora());
    }

}
