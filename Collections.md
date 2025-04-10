<h2>Collections Framework (coleções)</h2> 
Os arrays tem tamanho fixo e só podemos buscar elementos nele através do índice se quisermos buscar por um valor temos que percorrer a lista inteira.

Quando criamos um array, nós determinamos seu tamanho. Porém, não é possível determinar de uma forma simples a quantidade de posições que foram preenchidas.

Os arrays possuem muitas limitações por isso a plataforma Java tem um conjunto de classes e interfaces conhecidos como Collection Framework, que representam estruturas de dados avançadas.

Collections Framework ou Coleções são estruturas de dados utilizadas para armazenar e organizar objetos de maneira eficiente e prática. Podem ser utilizadas para representar estruturas como vetores, listas pilhas, filas, mapas, conjuntos e outras estruturas de dados.

Coleções são muito comuns nas aplicações Java, pincipalmente para o acesso ao banco de dados, principalmente no resultado de buscas. Assim podemos armazenar os clientes, livros, endereços em nossas aplicações.

As coleções são definidas por meio de interfaces. As interfaces determinam o que a estrutura deve fornecer de funcionalidade, ou seja, fornecem um contrato para que a classe concreta as implemente. 

<h3>O que é uma interface e contrato?</h3>

As interfaces definem contratos de métodos que devem ser implementados pelas classes que as utilizam. A interface List define operações típicas de listas, e a classe ArrayList é uma implementação concreta que segue esse contrato, implementando as interfaces Collection e List.

 Os métodos definidos na interface são o contrato
 O que isso quer dizer?
 <ul>
   <li>A interface define nomes de métodos, assinaturas (tipo de retorno, parâmetros) e a intenção.</li>
   <li>Ela não define o corpo (a lógica) dos métodos.</li>
   <li>Quem implementa a interface é obrigado a fornecer a implementação (o comportamento) desses métodos.</li>
 </ul>

Exemplo direto:
interface OperacaoMatematica {
    int somar(int a, int b);
    int subtrair(int a, int b);
}

Esse é o contrato da interface: "Se você quiser ser considerado uma OperacaoMatematica, você tem que implementar os métodos somar() e subtrair()."

🛠️ Exemplo de implementação:
class CalculadoraSimples implements OperacaoMatematica {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }
}

Se essa classe deixar de implementar um dos métodos, o compilador vai gerar erro, porque ela não cumpriu o contrato.

O Java já tem classes prontas que implementam esse contrato de List e Collections por exemplo.

Em Java, interface é um tipo especial de estrutura que define um conjunto de métodos que uma classe deve obrigatoriamente implementar, mas não define o que esses métodos fazem.

É como um contrato: “Se você assinar esse contrato (implementar essa interface), você tem que fornecer essas funcionalidades.”

🔹Analogia com o mundo real (pra facilitar):

Pensa numa tomada na parede (a interface).
Ela define o formato que um plugue deve ter para funcionar ali:
Dois pinos? Três pinos? Posição? Tensão?

O contrato é: “Se você quiser que seu aparelho funcione aqui, ele tem que seguir esse padrão de tomada.”
Não importa se é um carregador de celular, um liquidificador ou um videogame — todos precisam encaixar na tomada (interface).

No Java, as coleções podem ser classificadas em duas categorias: as que implementam a interfacde Collection e as que implementam a interface Map.

<h4>Criação de listas genéricas vs definida</h4>

<h5>Genérica:</h5>
ArrayList listaCompras = new ArrayList();

🔍 O que está acontecendo aqui?
<ul>
  <li>Você está criando uma lista do tipo ArrayList sem genéricos.</li>
  <li>Isso significa que qualquer tipo de objeto pode entrar nessa lista.</li>
  <li>Você perde segurança de tipo.</li>
  <li>É necessário fazer casting manual ao acessar os elementos.</li>
</ul>

<h5>Definida:</h5>

List<String> carrinho = new ArrayList<String>();

✅ Aqui temos várias vantagens:

    1.Uso de interface (List) como tipo:
      <ul>
        <li>Isso permite trocar facilmente a implementação (ArrayList, LinkedList, etc.), sem mudar o restante do código.</li>
        <li>Usa o princípio da programação voltada à abstração.</li>
      </ul>

    2.Uso de genéricos (<String>):
      <ul>
        <li>A lista só aceita Strings — se você tentar adicionar outro tipo, o compilador já avisa.</li>
        <li>Você não precisa de cast para pegar os itens.</li>
      </ul>

As principais subinterfaces de Collection são:
<ul>
  <li>List: representa uma lista de objetos, a implementação mais utilizada é o ArrayList</li>
  <li>Set: Representa um conjunto de objetos únicos, e os objetos não se repetem; a implementação mais utilizada é a HashSet</li>
</ul>

A interface Map representa uma tabela Hash que armazena valores compostos por chave: valor.

A interface List armazena uma sequência de elementos ordenados pela inserção, não é necessário definir seu tamanho

A interface Set e a classe HashSet contém somente os métodos herdados da interface collection
<table>
  <thead>
    <tr>
      <th>Método</th>
      <th>Descrição</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>add</td>
      <td>Adiciona um objeto no Set</td>
    </tr>
    <tr>
      <td>clear</td>
      <td>Remove todos os objetos do Set</td>
    </tr>
    <tr>
      <td>contains</td>
      <td>Verifica se o objeto possui um objeto determinado</td>
    </tr>
    <tr>
      <td>isEmpty</td>
      <td>Verifica se o Set esta vazio</td>
    </tr>
    <tr>
      <td>remove</td>
      <td>Remove um objeto do Set</td>
    </tr>
    <tr>
      <td>size</td>
      <td>Retorna a quantidade de objeto no Set</td>
    </tr>
    <tr>
      <td>toArray</td>
      <td>Retorna uma array contendo os objetos do Set</td>
    </tr>
  </tbody>
</table>

Métodos herdados da interface Map 
<table>
  <thead>
    <tr>
      <th>Método</th>
      <th>Descrição</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>clear</td>
      <td>Remove todos os mapeamentos</td>
    </tr>
    
    <tr>
      <td>containsKey</td>
      <td>Verifica se uma chave já está presente no mapeamento</td>
    </tr>
    
    <tr>
      <td>containsValue</td>
      <td>Verifica se um valor já está presente no mapeamento</td>
    </tr>
    
    <tr>
      <td>get</td>
      <td>Retorna o valor associado a uma chave determinada</td>
    </tr>
    
    <tr>
      <td>isEmpity</td>
      <td>Verifica se o mapeamento esta vazio</td>
    </tr>
    
    <tr>
      <td>kaySet</td>
      <td>Retorna um set contendo as chaves</td>
    </tr>
    
    <tr>
      <td>put</td>
      <td>Adiciona um mapeamento</td>
    </tr>
    
    <tr>
      <td>remove</td>
      <td>Remove um mapeamento</td>
    </tr>
    
    <tr>
      <td>size</td>
      <td>Retorna o número de mapeamentos</td>
    </tr>

    <tr>
      <td>values</td>
      <td>Retorna o número de mapeamentos</td>
    </tr>
    
  </tbody>
</table>
