
#🧮Calculadora em Java

Este é um projeto simples de calculadora de terminal desenvolvida em Java, que permite realizar operações matemáticas básicas com tratamento de erros e repetição interativa.

🚀 Funcionalidades

A calculadora realiza as seguintes operações:

➕ Soma

➖ Subtração

✖️ Multiplicação

➗ Divisão (com verificação de divisão por zero)

Também possui:

Tratamento de exceções para entradas inválidas (InputMismatchException);

Opção de repetir novas operações sem reiniciar o programa;

Interface de texto simples e intuitiva no console.

🧠 Lógica do Programa

O programa utiliza:

Estrutura de repetição while para permitir várias operações seguidas;

Bloco try-catch para capturar erros de entrada;

Um switch para selecionar a operação desejada.

Fluxo básico:

O usuário escolhe a operação (1 a 4).

Digita dois números inteiros.

O resultado é exibido com duas casas decimais.

O usuário decide se quer continuar.

🛠️ Tecnologias Utilizadas

Java SE (versão 8 ou superior)

Scanner (para entrada de dados via console)

Tratamento de exceções com InputMismatchException

💻 Como Executar o Projeto
Pré-requisitos:

Ter o Java JDK instalado (versão 8+)

Um editor de código ou IDE (por exemplo, VS Code, IntelliJ ou Eclipse)

Passos:

Clone ou copie o código para seu ambiente local.

Salve o arquivo como Calculadora.java.

Compile o programa:

javac Calculadora.java


Execute o programa:

java Calculadora

🧩 Exemplo de Uso
=== Calculadora ===
Escolha a operação:
1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
Digite o número da operação: 1
Digite o valor 1: 10
Digite o valor 2: 5
A soma de 10 e 5 é 15.00

Deseja realizar outra operação? (s para sim): s

⚠️ Tratamento de Erros

Caso o usuário digite letras ou símbolos, o programa exibirá:

Erro: digite apenas números inteiros.


Se tentar dividir por zero:

Erro: divisão por zero não é permitida.

🧑‍💻 Autor

Rosa Maria
💡 Projeto criado para fins de estudo e prática de programação em Java.

📝 Licença

Este projeto é de uso livre para fins educacionais.
