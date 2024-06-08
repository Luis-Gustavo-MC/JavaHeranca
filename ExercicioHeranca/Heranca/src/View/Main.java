package View;

import Control.FuncionarioControl;
import Control.TercerizadoControl;

public class Main {
    public static void main(String[] args) throws Exception {
        FuncionarioControl funcionarioA = new FuncionarioControl();
        TercerizadoControl funcionarioB = new TercerizadoControl();
        funcionarioA.adicionarFuncionario("Jao", 10, 200.00);
        funcionarioB.adicionarFuncionario("testeB", 20, 12.0, 30.00);
        System.out.println(funcionarioB.buscarFuncionario());
    }
}
