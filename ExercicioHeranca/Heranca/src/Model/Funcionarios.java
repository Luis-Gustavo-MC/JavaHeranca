package Model;

public class Funcionarios {
    private String nome;
    private Integer horasTrabalhadas;
    private Double valorHora;

//Constructor
    public Funcionarios(String nome, Integer horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    public Funcionarios() {
        }
    
    //Gets e Sets

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
//Metodos
    public Double pagamento(){
        return this.horasTrabalhadas * valorHora;
    }
    
//toString
@Override
    public String toString() {
        return "Funcionarios [Nome=" + nome + ", Horas Trabalhadas=" + horasTrabalhadas + ", Valor Hora=" + valorHora
                + "]";
    }

    
}
