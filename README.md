# nano-java-fundamentos

<h1>Classe, objeto e instância</h1>
O que é uma CLASSE?

Pensa numa classe como um molde, um projeto, uma forma.
➡️ Ela descreve como um objeto deve ser.
➡️ É só a ideia, o plano.

🏭 Analogia real:

A classe é como a planta de uma casa feita pelo arquiteto.
Ela define: quantos quartos vai ter, a cor das paredes, onde ficam as portas…
➡️ Mas só a planta não é a casa real!
➡️ Ainda não dá pra morar nela.


O que é um OBJETO?

O objeto é a coisa real.
➡️ Ele é criado a partir da classe.
➡️ É a "casa construída", o "carro de verdade" com cor, modelo, etc.

🏭 Na analogia:

A planta é a classe.
Quando você constrói a casa, ela vira um objeto real.
Cada casa pode ter variações: uma azul, outra vermelha…
➡️ Elas são diferentes, mas seguem o mesmo plano (classe).


O que é INSTANCIAR?

"Instanciar" é o ato de criar um objeto a partir da classe.
➡️ Você está criando uma "instância" daquela classe.
<h1>Cap 1-Orientação a objetos</h1>
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

As variáveis que armazenam uma referência a um objeto são polimórficas. Isso quer dizer que uma variável de uma superclasse pode receber qualquer objeto de suas subclasses.

O que significa "variáveis são polimórficas"? Polimorfismo é um dos pilares da orientação a objetos. A ideia é que uma variável de um tipo mais genérico (superclasse) pode apontar para objetos de tipos mais específicos (subclasses).
Essa flexibilidade é o que chamamos de polimorfismo. É como se tivesse uma caixa que pode conter tanto um cachorro quanto um gato, e você pode interagir com eles de maneira genérica, respeitando suas particularidades

quando você cria um objeto, como:
ContaCorrente cc = new ContaCorrente();
A variável cc não contém o objeto em si, mas sim uma referência para aquele objeto na memória.

"Declarar a variável do tipo Animal", significa definir o tipo da referência, ou seja, o "rótulo" que você dá para a variável no momento em que ela é criada.

Em Java, uma variável que guarda objetos funciona assim:

TipoDaVariavel nomeDaVariavel = new TipoDoObjeto();

O TipoDaVariavel pode ser:

O tipo exato da classe (Cachorro, Gato...)
Ou um tipo mais genérico, que é a superclasse (Animal)

🔵 Vamos ver isso na prática:

Exemplo simples:

Animal meuAnimal = new Cachorro();

Aqui, a variável meuAnimal é do tipo Animal.
Mas o objeto real que ela aponta é um Cachorro.

➡️ Isso significa que:
O compilador enxerga meuAnimal como um Animal.
Você pode chamar qualquer método que existe em Animal.
Mas se o método foi sobrescrito no Cachorro, ele executa a versão do Cachorro.

 Então, quando você declara a variável como Animal, está dizendo:

"Eu só me importo com o que Animal sabe fazer (ou seja, os métodos de Animal)".
"Mas por baixo dos panos, pode ser um Cachorro, um Gato ou qualquer outro Animal".

Podemos atribuir o objeto que está referenciado na variável cc a uma variável do tipo ContaCorrente, para isso é necessário realizar um cast: ContaCorrente c1= (ContaCorrente) cc;

O que é o cast?
"Cast" significa "conversão" ou "transformação" de tipos.
No caso de objetos, você está dizendo para o Java:
➡️ "Ei, Java! Eu sei que essa variável que você acha que é um Animal, na verdade é um Cachorro. Pode tratar ela como Cachorro!"
E isso permite acessar métodos e atributos específicos dessa subclasse.
Por que precisa de cast?
Quando você declara uma variável como Animal, o compilador só enxerga os métodos e atributos que a classe Animal tem.
Precisa dizer explicitamente ao compilador que você quer tratar como Cachorro.

Como escrever um cast?
A sintaxe é simples: TipoQueVocêQuer nomeDaVariavelNova = (TipoQueVocêQuer) variavelAntiga;

Se tentarmos realizar o cast e o objeto não for do tipo ou subtipo da classe que queremos forçar, o Java irá lançar a exceção ClassCastException

Conta conta = new Conta();  
ContaCorrente c2 = (ContaCorrente) conta;  // Aqui dá problema!

➡️ O que acontece:
Você criou um objeto do tipo Conta.
Depois, tentou dizer ao Java:
"Esse Conta aqui... trata ele como um ContaCorrente."

⚠️ Mas não é verdade!
Ele é um Conta puro, e não um ContaCorrente.
O Java aceita o cast na compilação, porque ele vê que ContaCorrente é uma subclasse de Conta — então pode ser possível.
Mas na hora de rodar, o Java percebe que o objeto que você criou não é um ContaCorrente, então ele lança uma exceção:

➡️ ClassCastException

java.lang.ClassCastException: Conta cannot be cast to ContaCorrente

🔷 Por que isso acontece?
Porque o Java só pode fazer um cast seguro quando o objeto real (aquele que foi instanciado com new) é da subclasse.

Mas nesse caso, o que você tem é:

Conta conta = new Conta();  // Um Conta puro e simples.

E depois tenta forçar ele a ser ContaCorrente. Mas um objeto Conta não tem as características internas de um ContaCorrente.
Ele não sabe como ser um ContaCorrente, e isso dá problema!

🔷 Como isso seria seguro?
Se você fizesse algo assim:

Conta conta = new ContaCorrente();  // Variável do tipo Conta, mas objeto é ContaCorrente.
ContaCorrente c2 = (ContaCorrente) conta;  // Agora sim! O objeto É um ContaCorrente.

Aqui funciona!
O cast é seguro porque o objeto realmente é um ContaCorrente.
O compilador não sabe disso na hora da declaração, mas em tempo de execução o Java valida e permite.

🔷 Uma analogia:
Pensa que Conta é um "carro genérico" e ContaCorrente é um "carro esportivo".
Se você tem um carro normal (Conta), ele não tem os acessórios de um carro esportivo (ContaCorrente), tipo o modo turbo.

Agora, se você comprou um carro esportivo (new ContaCorrente()), mesmo que você o chame genericamente de Conta, ele tem o modo turbo.
Basta você tratá-lo como um ContaCorrente para acessar essas funções.


➡️ Como a variável pode ser de um tipo e o objeto ser de outro?
➡️ O que isso significa?
➡️ Como funciona na prática?

Vamos por partes.

🎒 1. O que é uma variável?
Pensa que a variável é só uma etiqueta (ou uma referência) que aponta pra um objeto na memória.

Exemplo simples de etiqueta no mundo real:

Você tem uma gaveta chamada "Documentos Importantes".
Lá dentro pode ter uma carteira de identidade, um passaporte, uma escritura...
A etiqueta "Documentos Importantes" não te conta tudo o que tem dentro, mas você sabe que, em geral, só guarda documentos lá.
Em Java, a variável é essa etiqueta.

🎒 2. O que é o tipo da variável?
O tipo da variável diz:
➡️ "O que eu espero que essa variável saiba fazer."
➡️ "Que métodos posso chamar nela sem correr riscos."

Exemplo:

Animal meuAnimal = new Cachorro();

O tipo da variável é Animal.
Mas o objeto real que você criou foi um Cachorro.
O Java só deixa você enxergar o que um Animal sabe fazer.
Mesmo que o objeto real seja um Cachorro com mais funcionalidades.

🎒 3. Por que isso acontece?
Isso acontece por causa do polimorfismo.
➡️ Você pode tratar um Cachorro como se fosse um Animal.
➡️ Assim, o código que lida com vários tipos diferentes de animais pode ser genérico.

Por exemplo:
Imagina uma lista de Animal.
Dentro dela, você pode colocar:

Um Cachorro, um Gato, um Passarinho...
E tratar todos da mesma forma:

List<Animal> animais = new ArrayList<>();
animais.add(new Cachorro());
animais.add(new Gato());

for (Animal a : animais) {
    a.emitirSom();  // Eu não preciso saber se é cachorro ou gato. Só sei que é um Animal!
}
🎒 4. Como a variável pode ser de um tipo e o objeto outro?
➡️ A variável (Animal) só diz o mínimo que o objeto tem que saber fazer.
➡️ Mas o objeto real (Cachorro) pode ter coisas extras.

Você pode pensar nisso assim:
Imagina um "controle remoto universal" (a variável do tipo Animal).

Ele funciona com qualquer marca de TV (qualquer tipo de Animal).
Mas se a TV for da marca "Cachorro", ela pode ter um botão extra que o controle remoto universal não conhece.
Se você quiser usar o botão extra, você precisa pegar o controle da TV da marca Cachorro (fazer o cast).

🎒 5. Exemplo em código (com explicação de cada parte)

public class Animal {
    public void emitirSom() {
        System.out.println("Animal faz um som genérico.");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro(); // A variável é Animal, mas o objeto é um Cachorro!

        meuAnimal.emitirSom();   // Chama o método de Cachorro (polimorfismo)

        // meuAnimal.abanarRabo();  // Não funciona! O Java só "vê" um Animal aqui.

        // Se eu quiser acessar abanarRabo(), preciso fazer o cast:
        Cachorro meuCachorro = (Cachorro) meuAnimal;
        meuCachorro.abanarRabo();  // Agora sim!
    }
}

Saída:
Au Au!
Cachorro abanando o rabo!

🎒 6. Analogia Final (pra fixar de vez!)

🛴 A variável é o volante.
🚗 O objeto é o carro.

O volante pode controlar um carro simples (Animal) ou um carro esportivo (Cachorro).
Mas se você tem um volante simples (variável Animal), você não sabe se tem turbo no carro, a não ser que você verifique o que tem embaixo do capô (faça um cast).

Para verificar se o objeto é do tipo de uma classe, podemos utilizar a instrução instaceof. Essa instrução retorna true caso o objeto a esquerda do operador é do tipo (classe) especificado à direita do operador 

<h3>Sobrescrita de métodos</h3>
Sobrescrever um método é redefinir na subclasse um método existente na superclasse. Assim, quando o método retirar for chamado de um objeto do tipo Conta Corrente, o método chamado será o retirar definido na classe Conta Corrente e não da classe Conta.

A anotação @Override marca o método, identificando que o método está sobrescrevendo um método de sua superclass.

O método retirar soma a taxa de retirada (10) ao valor a ser subtraído do saldo. Como não temos acesso direto ao saldo e não podemos alterar seu valor na subclasse(não existe o método setSaldo() na classe Conta), precisamos utilizar o método retirar que está na classe Conta. A palavra super é utilizada para referenciar a superclasse, assim a instrução super.retirar(valor) está chamando o método retirar que está na classe Conta.

A palavra polimorfismo quer dizer várias formas, na orientação a objetos representa que um objeto pode ser referenciado de várias formas. Quando sobrescrevemos um método na subclasse, o que determina se o método que será chamado é da subclasse ou da superclasse é o tipo de instância do objeto.

Podemos redefinir o comportamento de uma classe em sua subclasse e assim um objeto pode comportar de maneira diferente ao invocar um método, dependendo do seu tipo de criação.

Construtores em classes estendidas

Os construtores das subclasses sempre precisam chamar um construtor da superclasse. E para isso, a instrução super é utilizada.
Antes de construir a subclasse, o Java precisa garantir que a superclasse foi construída primeiro.
o Java chama o construtor da superclasse, ele faz isso automaticamente.
➡️ Se você não escrever nada, ele chama implicitamente:

super();

O super() chama o construtor padrão (sem argumentos) da superclasse.

🔧 Se a superclasse não tiver um construtor sem argumentos, você precisa chamar explicitamente outro construtor da superclasse, passando parâmetros.

Quando usar super explicitamente?
Se a superclasse tiver um construtor com parâmetros, tipo:

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
        System.out.println("Construtor da Conta com saldo inicial");
    }
}

A subclasse ContaCorrente precisa informar ao construtor da superclasse o valor esperado:

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);  // ⬅️ chamada explícita ao construtor da superclasse
        System.out.println("Construtor da ContaCorrente");
    }
}

Casos em que você usa o super de forma explícita:
1. Quando a superclasse só tem construtores com parâmetros
Se a superclasse não tem um construtor sem parâmetros, o compilador do Java obriga você a chamar um dos construtores existentes com super(...).

public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super(100);  // ⚠️ OBRIGATÓRIO! A superclasse só tem esse construtor
        System.out.println("Construtor da ContaCorrente");
    }
}

2. Quando você quer inicializar atributos da superclasse no momento da construção
Você pode querer passar informações da subclasse para a superclasse durante a construção do objeto.

🔹 Exemplo:

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Criando Pessoa: " + nome);
    }
}

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome);  // Aqui você inicializa o nome herdado
        this.cargo = cargo;
        System.out.println("Criando Funcionario: " + cargo);
    }
}


3. Quando você quer chamar métodos ou construtores específicos da superclasse por necessidade lógica
Às vezes você tem sobrecargas na superclasse e precisa decidir qual construtor faz mais sentido ser chamado.

🔹 Exemplo com vários construtores na superclasse:

public class Conta {
    private double saldo;

    public Conta() {
        this(0);  // Chama outro construtor da mesma classe
    }

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
}
Na subclasse:

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);  // Quero que a ContaCorrente comece com um saldo inicial específico
    }
}
➡️ Mesmo que haja outros construtores disponíveis, você decide chamar aquele que te interessa.

As classes Conta e ContaCorrente possuem construtores padrão(sem argumentos) que são fornecidos pelo Java. O construtor padrão chama o construtor da superclasse direita, ou seja, o construtor da classe ContaCorrente chama o construtor da classe Conta e o construtor da classe conta chama o construtor da classe Object

Outras duas regras dos construtores são:
1) Não são herdados.
2) A chamada do construtor da superclasse deve ser sempre feita na primeira linha do construtor da subclasse.

<h1>Cap 4- Estruturas de repetição, arrays, strings e coleções</h1>
<h3>Estrutras de repetição</h3>
No Java existem três estruturas de repetição que veremos a seguir: While, Do-While e For.

<h4>While</h4>
while(<condição>){
  <instrução>
}

<h4>Do-while</h4>
Esse loop primeiramente irá executar todo o bloco de código para depois testar a condição, e assim verificar se repete novamente o bloco de código.

do{
  <instruções>
}while(<condição>)

<h4>For</h4>
O loop for é uma estrutura de repetição controlada por uma variável de contador que será atualizada depois de cada iteração.
for(<inicialização>;<condição lógica>;<incremento ou decremento>){
  <Instruções>
}

O valor de (<inicialização>) da estrutura for normalmente é utlizado para inicializar a variável de contador. A condição lógica verifica se o loop deve repetir ou não, e o incremento (ou decremento) é a atualização da variável de controle, a cada iteração

<h4>Arrays</h4>
Um array é uma estrutura de dados que armazena uma coleção de itens do mesmo tipo, que pode ser um tipo primitivo ou um objeto. Cada item no vetor possui o seu próprio local numerado, chamado índice. O índice é utilizado para acessar um elemento no vetor e, assim, recuperar ou atribuir uma informação naquele índice.

Em um array o índice inicia a partir de 0.

Um array possui um comprimento fixo e que não pode ser alterado, ou seja, será definido um valor para o array e esse deve permanecer.

Um array em java é um objeto. Dessa forma podemos utlizar o operador new para criar uma nova instância de um array.

Para declarar uma variável para armazenar um array, primeiro precisamos especificar o tipo do array, acrescentar colchetes [] e definir o nome da variável, exemplo: 
int[] notas; 

ou

int notas [];

As duas formas produzem o mesmo resultado.
No momento da dlecaração, precisamos definir entre os colchetes o comprimento do array, no exemplo abaixo criamos um array de 40 números inteiros.
int notas []= new int[40];

Um array de boolean é inicializado com false e um array de objeto é inicializado com null.

Existem duas formas de declarar um vetor com suas posições preenchidas com valores pré-determinados:
A primeira, consiste em atribuir os valores entre chave{} e separado por vírgula:
int notas[]= {10, 9, 8, 2};

A outra forma tem o mesmo princípio da primeira, diferenciando pela adição do operador new na declaração:
int notas[]= new int[]{10, 9, 8, 2};

Podemos criar um array de qualquer tipo de dado no Java.
Exemplos:
byte bytes[]= new byte[4];
short shots[]= new short[8];
double doubles[]= new double[7];
float floats[]= new float[3];
String strings[]= new String[10];
Carro carros[]= new Carro[15];

É possível criar um array para armazenar objetos, que são os arrays de referência ou o "array de objetos". Neste array é possível armazenar várias referências a um tipo de objeto. Neste exemplo, estamos definindo um array com 5 posições para armazenar as referências de objetos do tipo Carro.Exemplo:
Carro[]= new Carro[5];

Até esse momento, nenhum objeto Carro foi criado. O array foi criado para armazenar as referências de 5 Carros, e por enquanto as posições de vetor estão vazias (null).

Para recuperar o valor do modelo do carro que está armazenado na primeira posição do vetor, podemos escrever o seguinte código:
String modelo= carros[0].getModelo();
System.out.println(modelo);

Usando o coando for-each, não necessitamos manter uma variável de controle para indicar a posição do elemento no vetor.
for(<Tipo> <variável> : <Array>){

}

O primeiro parâmetro é o tipo do array. O segundo é o nome para a variável que vai receber cada um dos itens do vetor. O último parâmetro, que está após os dois pontos(:) é o array que queremos percorrer. Exemplo:
for(Carro carro: carros){
  System.out.println(carro.getModelo());
}

O tipo de vetor é Carro, a variável que vai receber cada um dos itens do vetor é o carro e o array que queremos percorrer é o vetor de carros.

Arrays multidimensionais ou matrizes. As matrizes nada mais são que arrays de arrays. Dessa forma, cada posição do array armazena outro array. Esses arrays também podem conter arrays, e assim por diante, ou seja, quantas dimensões que o desenvolvedor desejar.

Imagine agora que as notas dos alunos devem ser armazenadas por disciplinas. O curso tem 9 disciplinas com 40 alunos cada. Dessa forma, podemos criar um array com 9 posições e em cada posição armazenar um outro array com 40 elementos:
int[][] notas= new int [9][40]

Para armazenar um valor para o primeiro aluno na primeira disciplina:
notas[0][0]= 10;

É possível também criar um array de array de array ou em quantas dimensões forem necessárias:
int[][][] notas= new int[10][50][10];


<h4>Strings</h4>
Vamos aprender a manipular strings.

O Java não tem um tipo de dado primitivo como int ou double para armazenar uma string. Ao invés, podemos utilizar a biblioteca padrão Java que contém uma classe predefinida chamada string. Essa classe é projetada para manipular textos e oferece uma variedade de métodos para realizar operações, como concatenação, comparação de Strings. Portanto, para trabalhar com textos em Java, sempre usamos a classe String em vez de um tipo de dado primitivo.

Os objetos strings são imutáveis, isto é, seu conteúdo de caracteres não pode ser alterado após a sua inicialização. Dessa forma, é impossível alterar o valor da string. Porém, é possível armazenar outra string no lugar da string original.
Exemplo:
String saudacao= "Olá";
saudacao="Oi"
Isso não altera "Olá", apenas cria uma nova string

Quando você atribui uma nova string a uma variável que já tinha um valor, o que acontece é:
  1.Um novo objeto String é criado na memória com o novo valor.
  2.A variável passa a referenciar esse novo objeto.
  3.O objeto antigo (se não houver mais referências para ele) se torna inacessível e pode ser coletado pelo Garbage Collector (coletor de lixo).

Exemplo:
O que acontece internamente:
    1."Olá" é criado e a variável texto aponta para ele.
    2."Mundo" é criado e texto agora aponta para ele.
    3."Olá" não tem mais referências e pode ser coletado pelo Garbage Collector.


Se precisar modificar strings frequentemente, é melhor usar StringBuilder ou StringBuffer, pois eles permitem alteração sem criar novos objetos constantemente.

O StringBuilder é bom para quando precisamos modificar textos com frequência. Modifica o mesmo objeto em memória (mais rápido que String), melhor para concatenações dentro de loops, usa menos memória.
O StringBuffer é igual ao StringBuilder, mas com uma diferença importante:Ele é thread-safe (seguro para múltiplas threads). É sincronizado, assim garantimos a consistência do código quando há diversas threads lendo ou modificando a mesma String. No entanto, é mais lento que StringBuilder devido à sincronização.
A diferença?
<ul>
  <li>StringBuilder: Melhor performance (sem sincronização). </li>
  <li>StringBuffer: Segurança em múltiplas threads.</li>
</ul>

O operador '+' deve ser usado para quando vamos juntar uma String enorme para facilitar a legibilidade do código, sem a necessidade de criação de um novo objeto, ou mais conhecido por 'multi-line Strings'

<h4>Java threads</h4>
As Threads são subdivisões dos processos. Um exemplo são os computadores, quando estamos ouvindo música e olhando um site ao mesmo tempo, estamos realizando um processamento paralelo, mesmo que de forma transparente para o usuário.
Um exemplo prático é um procedimento que consome muito tempo de processador, como um calculo que faz consultas a um Web Service(que pode demorar muito a responder)
O procedimento é simples, recebe uma lista depois pega o valor de cada registro e soma. Após isso, captura um valor para reajuste em porcentagem , e recalcula o valor somando. Por fim retorna o resultado via WebService.

Não podemos parar toda a aplicação para executar o procedimento acima. Pois imagina se o usuário está fazendo um cadastro simples e tem que esperar 4 minutos para terminar o processamento acima.
A solução então é fazer com que esse procedimento seja executado concorrentemente, ou seja, ao mesmo tempo em que o usuário está realizando o cadastro, o procedimento acima também é executado, e provavelmente quando ele terminar o cadastro, o procedimento também já terminou, de forma imperceptível para o usuário.

Vamos usar o mesmo código porém usando o conceito de Threads. Iremos criar uma Thread para um bloco específico de código, através da Classe java.lang.Thread

Existe uma interface chamada Runnable que possui o método run. Dentro do método run devem ficar os procedimentos que que desejamos executar paralelamente, sendo assim vamos colocar todo o código acima dentro de um método run. Como Runnable é apenas um contrato, precisamos de alguma classe que a implemente e faça o trabalho da "paralização", que é a classe Thread

#######################################################################################################################################################################################


Uma string deve ser declarada, instanciada e inicializada.
1. Declarar: significa informar ao Java que desejamos criar uma variável que irá armazenar uma string.
2. Instanciar: cria um novo objeto da classe String. Isso estabelece a estrutura que irá conter os dados da string.
3. Inicializar: Aqui, atribuimos um valor à string, ou seja, define qual texto será armazenado naquela variável.

Portanto uma string precisa ser declarada como uma variável, transformada em um objeto da classe String e receber um valor para ser utilizada corretamente

Exemplo:
1.Declaração
String frase;

2.Instanciação e Inicialização frase = new String("Olá, mundo!");

Nesse exemplo:
-A string é declarada na primeira linha, criando uma variável chamada frase.
-Na segunda linha a string é instanciada através do uso do operador new e inicializada com o valor "Olá, mundo!".

 É possível também atribuir um valor a uma string sem instanciá-la, exemplo:
 String nome= "FIAP";

 Dessa forma, a string será armazenada em um pool de strings, uma área utilizada pelo Java como cache.
 Quando criamos uma string em Java utilizando a notação simples(String frase= "Olá, Mundo!";) essa string é armazenada em uma área especial chamada "pool strings". O pool strings funciona como um tipo de armazenamento temporário onde o Java mantém strings que já foram criadas. A vantagem desse método é que, se você criar outra string com o mesmo conteúdo, em vez de criar uma nova cópia, o Java pode utilizar a string já existente no pool. Isso economiza memória e melhora o desempenho da aplicação. Portanto, o pool de strings ajuda a gerenciar de forma eficiente as sequências de caracteres no Java.
Resumindo o pool strings é como um "depósito".

Quando falamos sobre uma string que é um atributo de uma classe(ou seja, parte de uma instância de um objeto), é importante que essa string seja criada ou atribuida um valor antes de ser usada. Isso ocorre, pois por padrão todos os atributos que não foram inicializados em Java são atribuídos o valor especial null e se tentarmos usar um método em uma string que ainda está com null, o Java não saberá como proceder e gerará um erro.

Para não ter esse erro é preciso instanciar ou inicializar uma string:

Declaração e Instanciação: String nome= new String();

Declaração e Inicialização: String nome= "FIAP";


<table>
  <thead>
    <tr>
      <th>Sequeência de Escape</th>
      <th>Descrição</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>\n</td>
      <td>Nova linha. Posiciona o cursor no início da próxima linha.</td>
    </tr>
    <tr>
      <td>\t</td>
      <td>Tabulação horizontal. Move o cursor para apróxima posição da tabulação horizontal.</td>
    </tr>
    <tr>
      <td>\\</td>
      <td>Barras invertidas. Utilizada para gerar um caractere de barra invertida(\)</td>
    </tr>
    <tr>
      <td>\"</td>
      <td>Aspas duplas. Utilizada para gerar um caractere de aspas duplas.</td>
    </tr>
    <tr>
      <td>\'</td>
      <td>Aspas simples. Utilizada para gerar um caractere de aspas simples.</td>
    </tr>
    
  </tbody>
</table>

Concatenação de strings nada mais é do que juntar duas ou mais strings para criar uma nova string.

A forma mais fácil de concatenar uma string é utilizar o operador de soma (+)

Utilizando o operador (+=) para strings, dessa forma vamos concatenando strings e atribuindo o resultado para a mesma variável

Além do operado + e +=, podemos concatenar strings utilizando o método concat

Também é possível misturar as técnincas apresentadas para realizar a concatenação de strings.

<h5>Comparação de Strings</h5>
A comparação de strings deve ser realizada através de métodos, cujos principais métodos oara comparação são:
<ul>
  <li>Equals(string): verifica a igualdade do valor das strings.</li>
  <li>EqualsIgnoreCase(string): verifica a igualdade do valor das strings sem diferenciar as letras maiúsculas e minúsculas.</li>
</ul>

Duas variáveis tem o mesmo valor, porém estão alocadas em endereços de memória diferentes. Dessa forma, o resultado será que não são iguais, pois o perador == compara o endereço de memória e não o valor.

Agora se inicializar as strings sem instância-las, os valores serão alocados em um pool de strings. Dessa forma, se os valores forem iguais, elas vão compartilhar o mesmo espaço de memória no pool, fazendo com que o operador == funcione.

Para verificar se uma string inicia com uma sequência de caracteres podemos usar o método startsWith() com a palavra a ser procurada e para verificar se termina com uma palavra podemos usar o método endsWith()

Podemos usar length para retornar a quantidade de caracteres em uma string

<h4>Collections Framework (coleções)</h4> 
Os arrays possuem muitas limitações por isso a plataforma Java tem um conjunto de classes e interfaces conhecidos como Collection Framework, que representamestruturas de dados avançadas.

Collections Framework ou Coleções são estruturas de dados utilizadas para armazenar e organizar objetos de maneira eficiente e prática. Podem ser utilizadas para representar estruturas como vetores, listas pilhas, filas, mapas, conjuntos e outras estruturas de dados.

Coleções são muito comuns nas aplicações Java, rpincipalmente para o acesso ao banco de dados, principalmente no resultado de buscas. Assim podemos armazenar os clientes, livros, endereços em nossas aplicações.

As coleções são definidas por meio de interfaces. As interfaces determinam o que a estrutura deve fornecer de funcionalidade, ou seja, fornecem um contrato para que a classe concreta as implemente. 

No Java, as coleções podem ser classificadas em duas categorias: as que implementam a interfacde Collection e as que implementam a interface Map.

As principais subinterfaces de Collection são:
<ul>
  <li>List: representa uma lista de objetos, a implementação mais utilizada é o ArrayList</li>
  <li>Set: Representa um conjunto de objetos únicos, e os objetos não se repetem; a implementação mais utilizada é a HashSet</li>
</ul>
