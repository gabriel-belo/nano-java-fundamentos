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

Por exemplo para uma conta bancária informações relevantes poderiam ser saldo, número da conta, agência, tipo de conta entre outros. E ações importantes serião sacar, depositar, verificar o saldo entre outros.

Um objeto é uma instância de uma classe.

<h3>Atributos</h3>
Em uma classe, os atributos são definidos por variáveis, que podem ser do tipo primitivo ou do tipo de referência, no qual a variável armazena uma referência a um objeto.

Os atributos seguem o lowerCamelCase, onde a primeira letra sempre é minúscula e se houver mais de uma palavra a primeira letra da segunda palavra será maiúscula

As variáveis que definem um atributo em uma classe
