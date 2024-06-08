package Control;
import Model.Funcionarios;
public class FuncionarioControl {
    private Funcionarios funcionario; 

//Construtor  
    public FuncionarioControl() {
        funcionario = new Funcionarios();
    }
//Gets e Sets
    public Funcionarios getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }
//Metodos
    public void adicionarFuncionario(String nome, Integer horasTrabalhadas, Double valorHora) {
        funcionario.setNome(nome);
        funcionario.setHorasTrabalhadas(horasTrabalhadas);
        funcionario.setValorHora(valorHora);
    }
    public String buscarFuncionario() {
        return "" + funcionario  + "";
    }
 
}
