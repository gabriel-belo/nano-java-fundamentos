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


No momento em que criamos uma instância da classe, três passos são executados pelo Java:
<ul>
  <li>Alocar memória para o objeto.</li>
  <li>Inicializar os atributos com os valores iniciais ou padrões.</li>
  <li>Chamar o método Construtor da classe.</li>
</ul>

Diferença dos construtores para os métodos comuns:
<ul>
  <li>Têm o mesmo nome da classe</li>
  <li>Não têm tipo de retorno(Nem mesmo void)</li>
</ul>

Toda classe tem pelo menos um construtor. Quando o construtor não é especificado, a linguagem Java fornece um construtor default(padrão).

Para diferenciar o atributo do parâmetro, utiliza-se a instrução this.

Uma classe pode ter vários construtores com diferentes tipos e quantidades de argumentos. Isso é chamada de srobrecargade métodos construtores. Dessa forma, uma classe pode ser instanciada como qualquer construtor.
Em uma classe com vários construtores podemos instânciar a classe de diversas formas, por exemplo em uma classe com um construtor vazio, outro que define saldo e outro que define saldo e agência, podemos instânciar dessas três formas:
<ul>
  <li>new Conta();</li>
  <li>new Conta(100);</li>
  <li>new Conta(10, 100);</li>
</ul>

Uma variável que armazena a referência de um objeto pode ter o valor null. Esse valor quer dizer que a variável está vazia e não faz referênciaa nenhum objeto. Devemos tomar cuidado, pois no caso de tentar acessar um atributo ou método em uma variável vazia, irá ocorrer um erro na execução do programa.

<h3>Modificadores de acesso</h3>
Os modifcadores são palavras chave que alteram as definições de uma classe, método, atributo ou construtor. Existem vários modificadores na linguagem na qual fazem parte: static, abstract e final.

O Java desponibiliza três modificadores de acesso: public, protected e private. Quando nenhum modificador é utilizado o nível de acesso padrão (default) é utilizado.

Os modificadores irão determinar quais variáveis, métodos e construtores serão visíveis a outras classes.
<table>
  <tr>
    <th>Palavra reservada</th>
    <th>Descrição</th>
  </tr>
  
  <tr>
    <td>Private</td>
    <td>Atributos, métodos e construtores- acesíveis somente dentro da própria classe.

          Atributos, métodos e construtores- acessíveis somente em classes do mesmo pacote.
    </td>
  </tr>
  
  <tr>
    <td>Protected</td>
    <td>Atributos, métodos e construtores- acessíveis na própria classe, suas subclasses e também nos métodos das classes que pertencem ao pacote.</td>
  </tr>
  
  <tr>
    <tdPublic></td>
    <td>Atributos e métodos- acessíveis em todos os métodos de todas as classes</td>
  </tr>
</table>


<h3>Java API Specification</h3>
As classes utilizadas para manipular arquivos estão dentro do pacote java.io

<h3>Cometários</h3>
Para comentar em uma linha usamos '//'

Para comentar em mais de uma linha usamos '/* */'

Para comentários de documentação, ou seja, o comentário será legível tanto para computadorews quanto para os desenvolvedores. Esse tipo de documentário é interpretado como sendo documnetação oficial que descreve o funcionamento de uma classe e seus métodos. Forma de uso '/** */'

<h3>JAVADOC</h3>
Pata criar a documentação das classes usamos o javadoc., que permite que as classes criadas sejam documentadas no formato HTML. O javadoc é uma ferramenta.
Estrutura:
/** Descrição
@tag descrição da tag
*/

Os comentários de documentação devem ser inseridos imediatamente acima do elemento que está sendo documentado

Temos várias tags, exemplos:
<ul>
  <li>@author: Nome do desenvolvedor</li>
  <li>@deprecated: Marca o método como deprecated. Algumas IDES exibirão um alerta de compilação se o método for chamado.</li>
  <li>@exception: Documenta uma exceção lançada por um método- veja também @throws</li>
  <li>@param: Define um parâmetro do método. Requerido para cada parâmetro.</li>
  <li>@return: Documenta o valor de retorno. Essa tag não deve ser usada para construtores ou métodos definidos com o tipo de retorno void.</li>
  <li>@see: Documenta uma associação a outro método ou classe.</li>
  <li>@Since: Documenta uma exceção lançada por um método. E um sinônimo para a @exception introduzida no Javadoc 1.2.</li>
  <li>@version: Exibe o número da versão de uma classe ou um método.</li>
</ul>

<h3>Javabean e encapsulamento</h3>
A especificação JavaBeans define diretrizes que ditam os nomes de suas variáveis, os nomes e tipos de retorno de seus métodos e alguns outros aspectos para que o objeto, chamado de beans, sejam reutilizáveis.

Um Java Bean é uma classe Java simples que segue algumas convenções específicas para representar objetos reutilizáveis, principalmente em frameworks e aplicações Java. Ele é usado, geralmente, para encapsular dados de uma forma padronizada. Pensa nele como uma "estrutura de dados" com regras para garantir que seja fácil de manipular e transportar dentro de aplicações Java, incluindo frameworks como Spring, Java EE e outros.
A idéia é criar pequenos componentes que possam ser reaproveitados ao máximo, simplificando o processo de deenvolvimento.

Para que serve um Java Bean?
<ul>
  <li>Transferir dados entre camadas de uma aplicação (DTOs).</li>
  <li>Facilitar a integração com frameworks que esperam objetos padronizados (por exemplo, em frameworks como Spring, Hibernate).</li>
  <li>Reutilização de código, já que eles funcionam como "blocos" de construção que você pode reaproveitar.</li>
  <li>Persistência e serialização de dados.</li>
</ul>


Regras para que a classe seja um Java Bean são:
<ul>
  <li>Precisa ter um construtor padrão, sem argumentos.</li>
  <li>Encapsular os seus atributos, provendo métodos para o acesso a eles em outras classes.</li>
  <li>É uma bá prática a implementação da interface java.io.Seriazable</li>
</ul>

*Encapsular atributos é: proteger os dados de um objeto, controlando como eles são acessados e modificados. É como se você colocasse suas informações dentro de uma caixa e só deixasse as pessoas usarem essas informações do jeito que você permitir.

Uma classe bean pode conter construtores com argumentos, porém ela dev ter também um construtor sem argumentos.

É uma boa prática a implementação da interface Serializable, que permite a serialização de objetos.

*Serialização de objetos é basicamente o processo de transformar um objeto em uma sequência de bytes, para que ele possa ser salvo em disco, enviado pela rede ou armazenado de uma forma que possa ser reconstruído depois.
É tipo tirar um "raio-x" do objeto, converter ele em um formato que pode ser transportado ou guardado, e depois você pode "reconstruir" o mesmo objeto de volta quando quiser.


Para encapsular um método, devemos utilizar o acesso mais restritivo quando desejamos que as outras classes não tenham acesso a o método. Permitindo assim o uso somente de dentro da própria classe.

Sempre marcamos os atributos de uma classe com o nível mais restritivo(private), a não ser que exista um bom motivo para deixá-la com outro nível de acesso. Permitir o aceso total a uma atributo não é uma boa prática, pois qualquer mudança na estrutura interna da classe acarretaria em mudanças nas outras classes que a utilizam, limitando a flexibilidade de mudança do código.

Outros benefícios do encapsulamento são:
<ul>
  <li>Esconder a implementação de uma classe: Para utilizar uma classe que envia e-mail, precisamos saber somente os valores que a classe precisa receber para realizar o envio, não precisamos saber como ela o faz.</li>
  <li>Definir o modo de acesso aos dados: escrita, leitura, escrita e leitura.</li>
  <li>Proteger os dados que estão dentro dos objetos: evitando-se que eles estejam alterados erroneamente.</li>
</ul>

O uso de métodos de leitura (get) e escrita (set) visam desacoplar os atributos de uma classe dos clientes que a utilizam

A convenção de nome para métodos que alteram o valor do atributo é adicionar a palavra set antes do nome do atributo. Para os métodos que recuperam a informação, utiliza-se a palavra get seguida do nome do atributo. Para atributos do tipo boolean, também é possível utilizar a palavra is antes do atributo.

Função super(): é destinada a chamar o construtor de uma classe pai, sendo essencial quando estamos utilizando herança para definir classes. Ela também pode ser usada antes de colocarmos o this rm uma função evitando erro de referência. Devido a sua importância, ela termina sendo chamada sempre que construímos uma classe mesmo que não esteja explicita.

<h4>O que é um construtor de uma classe?</h4>
Um construtor é um método especial de uma classe que é chamado automaticamente quando você cria um novo objeto. Ele serve para inicializar o objeto, ou seja, definir valores iniciais para os atributos ou executar algum código de configuração quando o objeto nasce.

Pensa assim:

Quando você cria um objeto com new, tipo:
Pessoa p = new Pessoa();

O que está acontecendo nos bastidores é: o construtor da classe Pessoa está sendo chamado.

Características do Construtor:
<ul>
  <li>Tem o mesmo nome da classe</li>
  <li>Não tem tipo de retorno (nem void)</li>
  <li>Pode receber parâmetros (ou não)</li>
  <li>Você pode ter vários construtores na mesma classe (sobrecarga)</li>
</ul>

<h1>Cap 3- Herança</h1>
Uma classe que herda de outra classe é chamada de subclasse, já a classe herdada é chamada de superclasse.

A herança é utilizada como forma de reutilizar os atributos e métodos de classes já definidas, permitindo assim derivar uma nova nova classe mais espcializada a partir de outra classe mais genérica existente.

Uma classe só pode ter uma superclasse, ou seja, não é possível ter herança múltipla. Porém, uma classe pode ter um número ilimitado de subclasses.

Dessa forma, uma subclasse recebe todas as características da superclasse e de todas as outras classes acima dela. A hierarquia de classes se inicia com a classe Object, isto é, todas as classes a herdam direta ou indiretamente.

A palavra-chave extends é utilizada na declaração de uma classe para determinar a sua superclasse. Caso a classe não tenha essa palavra-chave em sua declaração,a herança que existe é diretamente da classe Object.

A classe Object em Java é a superclasse de todas as classes. Ou seja, todas as classes em Java herdam, direta ou indiretamente, dessa classe. Ela está no pacote java.lang, que é automaticamente importado. Basicamente, a Object fornece métodos fundamentais que qualquer objeto em Java possui.

Sintaxe: [public] class <subclasse> extends <superclasse>

Para calcular o saldo da conta nós precisamos dos valor do cheque especial e do saldo porém o saldo esta como privado na classe pai (conta) então nós chamamos o método getSaldo que retorna o valor do saldo, como vemos no exemplo: 
public double getSaldoDisponível(){
      return getSaldo() + this.chequeEspecial;
}

Uma forma de descobrir se a herança é adequada para as suas classes é seguir a regra do 'é um', que afirma que cada objeto da subclasse é um objeto da superclasse. Por exemplo, uma Conta Corrente é uma Conta, o que significa que a herança deve ser utilizada nesta situação.

