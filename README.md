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
