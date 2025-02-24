# nano-java-fundamentos

<p>A hierarquia de diretórios para a organização dos arquivos de um programa em Java é denominada Pacotes </p>
<p>Para garantir um nome de pacote único, é recomendado utilizar o nome de domínio da empresa escrito ao contrário. </p>
Exemplo:
<p>Domínio da fiap é fiap.com.br então o pacote será definido br.com.fiap.ecommerce</p>

<p>Os arquivos/classe pública devem iniciar com uma letra, depois podem conter qualquer combinações entre letras e dígitos.</p>
<p>O padrão para atribuir nomes a classes é utilizar substantivos que iniciam com uma letra naiúscula. Se o nome tiver mais de uma palavra deve ser usada a notação camel</p>

<p>Os nomes das variáveis podem começar com uma letra, um caractere de sublinhado(_) ou $. O camelCase também é usado para variáveis.</p>

<p>Tipos de variáveis de número inteiro:</p>
<ul>
  <li>int: 4 bytes</li>
  <li>short: 2 bytes</li>
  <li>long: 8 bytes</li>
  <li>byte: 1 byte</li>
</ul>

<p>Tipos de variáveis de número flutuante</p>
<ul>
  <li>float: 4 bytes</li>
  <li>double: 8 bytes</li>
</ul>
<p>O tipo double é duas vezes mais preciso que o tipo float.</p>
<p>O tipo char é utilizado para armazenar caracteres individuais, como letras, algarismos, sinais de pontuação.</p>
<p>O tipo boolean, possui somente valores verdadeiro (true) ou falso (false)</p>

Não perdemos infprmações de byte -> short, short -> int, char -> int, int -> long, int -> double
Podemos perder de long-> float e  int -> float

<p>Operadores de atribuição</p>


<table>
  <tr>
    <th>Expressão</th>
    <th>Significado</th>
  </tr>
  <tr>
    <td>x+= y</td>
    <td>x= x + y</td>
  </tr>
  <tr>
    <td>x-= y</td>
    <td>x= x - y</td>
  </tr>
  <tr>
    <td>x*= y</td>
    <td>x= x * y</td>
  </tr>
  <tr>
    <td>x/= y</td>
    <td>x= x / y</td>
  </tr>
</table>


<p>Operadores incremento(a++) e decremento(a--)</p>

<p>operadores de igualdade</p>
<table>
  <tr>
    <th>Operador de igualdade</th>
    <th>Exemplo</th>
    <th>Significado</th>
  </tr>

  <tr>
    <td>==</td>
    <td>x==y</td>
    <td>x é igual a y</td>
  </tr>

  <tr>
    <td>!=</td>
    <td>x != y</td>
    <td> x é diferente de y</td>
  </tr>
  
</table>


<p>Operadores relacionais</p>
<table>
  <tr>
    <th>Operador relacional</th>
    <th>Exemplo</th>
    <th>Significado</th>
  </tr>

  <tr>
    <td>></td>
    <td>x > y</td>
    <td>x é maior que y</td>
  </tr>

  <tr>
    <td><</td>
    <td>x < y</td>
    <td>x é menor que y</td>
  </tr>

  <tr>
    <td>>=</td>
    <td>x >= y</td>
    <td>x maior ou igual a y</td>
  </tr>
  
  <tr>
    <td><=</td>
    <td>x <= y</td>
    <td>x é menor ou igual a y</td>
  </tr>
</table>

<p>Operadores lógicos</p>
<ul>
  <li>e (and)= &&</li>
  <li>ou (OR)= ||</li>
  <li>XOR= ^ (A combinação resulta em em um valor verdadeiro(true) somente se as duas expressões tiverem os valores opostos)</li>
  <li>NOT = !</li>
</ul>


<p>Entrada e saída de dados</p>
Para a saída de dados precisamos da classe Scaner
Exemplo:
Scanner sc= new Scanner(System.in);

O valor System.in especifica que queremos ler os valores digirados pelo usuário.

<h1>Cap 2- Classe, métodos e atributos</h1>
Uma classe possui o modelo ou estrutura a partir do qual os objetos serão criados.

<h5>Explicação deInstancia:</h5>
Pense em uma fábrica de carros. A fábrica tem um projeto (a classe) que define como um carro deve ser feito: modelo, cor, ano, motor, etc. No entanto, até que alguém peça um carro, ele não existe fisicamente — é apenas um conceito.
Agora, quando você faz um pedido, a fábrica usa esse projeto para fabricar um carro específico. Esse carro é uma instância (um objeto real baseado na classe/projeto). Cada carro encomendado pode ter cores ou modelos diferentes, mas todos seguem o mesmo projeto.
Então, instanciar uma classe é o processo de criar um objeto real a partir de um modelo (classe)

Por exemplo para uma conta bancária informações relevantes poderiam ser saldo, número da conta, agência, tipo de conta entre outros. E ações importantes serião sacar, depositar, verificar o saldo entre outros.

Um objeto é uma instância de uma classe. Esse processo de criação de um objeto a partir de uma classe é chamado de instanciação.

<h3>Atributos</h3>
Depois de instaciar a classe, os atributos serão utilizados para armazenar informações do objeto

Em uma classe, os atributos são definidos por variáveis, que podem ser do tipo primitivo ou do tipo de referência, no qual a variável armazena uma referência a um objeto.
Um exemplo seria:  Uma classe Pessoa que possui um atributo do tipo Endereco, que é outra classe.

Os atributos seguem o lowerCamelCase, onde a primeira letra sempre é minúscula e se houver mais de uma palavra a primeira letra da segunda palavra será maiúscula

As variáveis que definem um atributo em uma classe são chamadas de variáveis de instância, pois só é possível armazenar informações nessa variábel após a instanciação da Classe.

<h3>Métodos</h3>
os métodos definem os comportamentos que o objeto possui. O comportamento pode ser entendido como uma ação ou serviço, um objeto Conta possui comportamentos como recuperar o saldo, depositar e retirar dinheiro da conta.

Podemos definir um método como um comportsmento específico, residente no objeto, que define como ele deve agir quando exigido, definindo assim as habilidades do objeto.

Por convenção o nome dos métodos devem sempre ser escritos em lowerCamelCase, e geralmente utilizamos verbos para os nomes

Precisamos definir o tipo de retorno que o método deve devolver.  Caso o método não precise retornar nenhum valor, podemos definir o retorno como void

Os métodos podem receber valores como é o caso do método depositar. Os parâmetros dos métodos são declarados pela [lista de argumentos] que são um conjunto de declarações de variáveis que são separados por vírgulas e definidas dentro de parênteses. Esses parâmetros se tornam variáveis locais no método, recebendo seus valores quando o método for chamado

<h3>Construtor</h3>
Os construtores são métodos especiais,que são executados automaticamente quando os objetos dessa classe são criados. Esses métodos auxiliam na construção do objeto, podendo ser utilizado para inicializar os atributos com valores-padrão ou valores informados e chamar métodos em outros objetos.

Exemplos:
<h3>Exemplo 1: Construtor Simples( O construtor Carro(String modelo, int ano) inicializa os atributos do objeto automaticamente.)</h3>
"inicializar", quer dizer atribuir valores iniciais aos atributos do objeto no momento em que ele é criado.

class Carro {
    String modelo;
    int ano;

    // Construtor para inicializar os atributos
    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro e chamando o construtor automaticamente
        Carro meuCarro = new Carro("Ferrari", 2023);
        meuCarro.exibirInfo(); // Saída: Modelo: Ferrari, Ano: 2023
    }
}

<h3> Exemplo 2: Sobrecarga de Construtores (Podemos ter vários construtores para permitir diferentes formas de criação de objetos.)</h3>
<ul>
  <li>Se nenhum argumento for passado, o segundo construtor (Carro()) define valores padrão.</li>
  <li>Se argumentos forem passados, o primeiro construtor (Carro(String, int)) é chamado.</li>
</ul>


class Carro {
    String modelo;
    int ano;

    // Construtor 1 (com parâmetros)
    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Construtor 2 (sem parâmetros - valores padrão)
    Carro() {
        this.modelo = "Desconhecido";
        this.ano = 2000;
    }

    void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Lamborghini", 2024); // Usando o construtor com parâmetros
        Carro carro2 = new Carro(); // Usando o construtor sem parâmetros

        carro1.exibirInfo(); // Saída: Modelo: Lamborghini, Ano: 2024
        carro2.exibirInfo(); // Saída: Modelo: Desconhecido, Ano: 2000
    }
}


<h3>Exemplo 3: Chamando um Construtor dentro de Outro (this())</h3>
O construtor Carro() chama o outro construtor Carro(String, int) com valores padrão.
Podemos chamar um construtor dentro de outro para evitar duplicação de código:

class Carro {
    String modelo;
    int ano;

    // Construtor principal
    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Construtor secundário chamando o principal
    Carro() {
        this("Genérico", 2000); // Chama o outro construtor
    }

    void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", 2022);
        Carro carro2 = new Carro(); // Usa o construtor secundário

        carro1.exibirInfo(); // Saída: Modelo: Porsche, Ano: 2022
        carro2.exibirInfo(); // Saída: Modelo: Genérico, Ano: 2000
    }
}
