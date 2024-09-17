public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Conta contaBanco = new Conta(0);
        Conta contaLoja1 = new Conta(0);
        Conta contaLoja2 = new Conta(0);

        Loja loja1 = new Loja(contaLoja1, new Funcionario[2]);
        Loja loja2 = new Loja(contaLoja2, new Funcionario[2]);

        Funcionario[] funcionariosLoja1 = new Funcionario[2];
        Funcionario[] funcionariosLoja2 = new Funcionario[2];
        
        for (int i = 0; i < 2; i++) {
            funcionariosLoja1[i] = new Funcionario(new Conta(0), new Conta(0));
            funcionariosLoja2[i] = new Funcionario(new Conta(0), new Conta(0));
        }

        for (int i = 0; i < 10; i++) {
            new Cliente(banco, new Conta(2000), contaLoja1, contaLoja2).start();
        }
        
        loja1.pagarFuncionarios();
        loja2.pagarFuncionarios();
    }
}
