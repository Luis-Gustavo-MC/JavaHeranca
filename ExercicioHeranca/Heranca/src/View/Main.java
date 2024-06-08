package View;

import Control.FuncionarioControl;

public class Main {
    public static void main(String[] args) throws Exception {
        FuncionarioControl funcionarioA = new FuncionarioControl();
        funcionarioA.adicionarFuncionario("Jao", 10, 200.00);
        System.out.println(funcionarioA.buscarFuncionario());
    }
}
