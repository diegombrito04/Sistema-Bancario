# Sistema Bancário Multithread

Este projeto é um sistema bancário desenvolvido em Java 17 que utiliza threads para simular operações de um banco, lojas, funcionários e clientes. O sistema inclui a criação de contas, processamento de pagamentos e gerenciamento de salários e investimentos.

## Entidades

- **Banco**: Intermedeia transações e garante a consistência dos saldos das contas.
- **Loja**: Possui uma conta para receber pagamentos e pagar funcionários.
- **Funcionário**: Recebe salário e investe parte em uma conta de investimentos.
- **Cliente**: Realiza compras em lojas e possui uma conta bancária.
- **Conta**: Representa uma conta bancária com métodos para depositar e sacar fundos.

## Funcionalidades

- Cada cliente realiza 4 compras (2 em cada loja) com valores aleatórios entre R$ 200,00 e R$ 500,00.
- Cada loja processa pagamentos e paga os funcionários com base nos saldos.
- Funcionários investem 20% do salário recebido em uma conta de investimentos.

## Requisitos

- JDK 17

## Configuração e Execução

1. **Clone o Repositório**

1. Clone o repositório
    ```sh
    git clone https://github.com/seuusuario/explorador-de-livros.git
    ```
2. Navegue até o diretório do projeto
    ```sh
    cd banco-sistema
    ```
3. Compile o Projeto
    ```sh
    javac -d bin src/*.java
    ```
4. Execute o Projeto
    ```sh
    java -cp bin Main
    ```

## Estrutura do Projeto

 ● src/: Contém os arquivos fonte Java.
 ● Banco.java: Classe responsável por intermediar transações.
 ● Conta.java: Classe que representa uma conta bancária.
 ● Cliente.java: Classe que representa um cliente.
 ● Funcionario.java: Classe que representa um funcionário.
 ● Loja.java: Classe que representa uma loja.
 ● Main.java: Classe principal para execução do projeto.
 ● .vscode/: Contém configurações específicas do VS Code.

## Contribuições
Sinta-se à vontade para fazer contribuições, correções e melhorias. Para contribuir, por favor, siga os seguintes passos:

1.Faça um fork deste repositório.
2.Crie uma nova branch (git checkout -b minha-branch).
3.Faça suas alterações e faça um commit (git commit -am 'Adicionei uma nova funcionalidade').
4.Envie suas alterações para o repositório remoto (git push origin minha-branch).
5.Abra um Pull Request.
