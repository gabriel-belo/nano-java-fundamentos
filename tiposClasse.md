<table border="1" cellspacing="0" cellpadding="8">
  <thead>
    <tr>
      <th>Tipo de Classe</th>
      <th>Palavra-chave</th>
      <th>Pode ser instanciada?</th>
      <th>Pode ser herdada?</th>
      <th>Pode ter métodos abstratos?</th>
      <th>Exemplo de uso</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Classe concreta</td>
      <td>(nenhuma)</td>
      <td>✅ Sim</td>
      <td>✅ Sim</td>
      <td>❌ Não</td>
      <td>Classes comuns do dia a dia (Carro, Pessoa, etc.)</td>
    </tr>
    <tr>
      <td>Classe final</td>
      <td>final</td>
      <td>✅ Sim</td>
      <td>❌ Não</td>
      <td>❌ Não</td>
      <td>Classe String, classes imutáveis ou seguras</td>
    </tr>
    <tr>
      <td>Classe abstrata</td>
      <td>abstract</td>
      <td>❌ Não</td>
      <td>✅ Sim</td>
      <td>✅ Sim ou ❌ Não</td>
      <td>Modelos genéricos como Animal, Forma, etc.</td>
    </tr>
    <tr>
      <td>Classe interna</td>
      <td>(dentro de outra)</td>
      <td>✅ Sim</td>
      <td>✅ Depende</td>
      <td>✅/❌ Sim ou não</td>
      <td>Organizar lógica relacionada dentro de outra classe</td>
    </tr>
    <tr>
      <td>Classe anônima</td>
      <td>(sem nome)</td>
      <td>✅ Sim</td>
      <td>❌ Não</td>
      <td>✅ Sim</td>
      <td>Listeners, threads rápidas, callbacks</td>
    </tr>
    <tr>
      <td>Classe utilitária</td>
      <td>(com static)</td>
      <td>❌ (construtor privado)</td>
      <td>❌ Não</td>
      <td>❌ Não</td>
      <td>Classes com funções auxiliares, como Math, Collections</td>
    </tr>
    <tr>
      <td>Enum</td>
      <td>enum</td>
      <td>✅ Sim (valores fixos)</td>
      <td>❌ Não</td>
      <td>❌ Não</td>
      <td>Dias da semana, estados de um processo</td>
    </tr>
  </tbody>
</table>
