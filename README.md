# collections-java-api
#### Autora dos desafios:
[Camila Cavalcante](https://github.com/cami-la)

## Resoluções
### List
* [Lista de Tarefas](https://github.com/brunosouza2/collections-java-api/tree/main/src/br/com/collections/list/lista_tarefas)
* [Carrinho de Compras](https://github.com/brunosouza2/collections-java-api/tree/main/src/br/com/collections/list/carrinho_compra)
* [Catálogo de Livros](https://github.com/brunosouza2/collections-java-api/tree/main/src/br/com/collections/list/catalogo_de_livros)
* [Soma de Números](https://github.com/brunosouza2/collections-java-api/tree/main/src/br/com/collections/list/soma_de_numeros)
* [Ordenação de Pessoas](https://github.com/brunosouza2/collections-java-api/tree/main/src/br/com/collections/list/ordenacoes_de_pessoas)
* [Ordenação de Números](https://github.com/brunosouza2/collections-java-api/blob/main/src/br/com/collections/list/ordenacao_de_numeros/OrdenacaoNumeros.java)

## Exercícios Propostos:

# Utilizando List
## Operações Básicas com List

### 1. Lista de Tarefas
<p>Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.
- `removerTarefa(String descricao)`: Remove uma tarefa da lista com base em sua descrição.
- `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.
- `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas na lista.
</p>

### 2. Carrinho de Compras:

<p>Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- `removerItem(String nome)`: Remove um item do carrinho com base no seu nome.
- `calcularValorTotal()`: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
</p>

----

## Pesquisa em List

### 1. Catálogo de Livros

<p>Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

- `adicionarLivro(String titulo, String autor, int anoPublicacao)`: Adiciona um livro ao catálogo.
- `pesquisarPorAutor(String autor)`: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- `pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- `pesquisarPorTitulo(String titulo)`: Pesquisa livros por título e retorna o primeiro livro encontrado.
</p>

### 2. Soma de Números

<p>Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero)`: Adiciona um número à lista de números.
- `calcularSoma()`: Calcula a soma de todos os números na lista e retorna o resultado.
- `encontrarMaiorNumero()`: Encontra o maior número na lista e retorna o valor.
- `encontrarMenorNumero()`: Encontra o menor número na lista e retorna o valor.
- `exibirNumeros()`: Retorna uma lista contendo todos os números presentes na lista.

-------

## Ordenação em List

### 1. Ordenação de Pessoas

<p>Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

- `adicionarPessoa(String nome, int idade, double altura)`: Adiciona uma pessoa à lista.
- `ordenarPorIdade()`: Ordena as pessoas da lista por idade usando a interface Comparable.
- `ordenarPorAltura()`: Ordena as pessoas da lista por altura usando um Comparator personalizado.
</p>

### 2. Ordenação de Números

<p>Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero)`: Adiciona um número à lista.
- `ordenarAscendente()`: Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
- `ordenarDescendente()`: Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
</p>

# Utilizando Set
## Operações Básicas com Set

### 1. Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.
</p>

### 2. Conjunto de Palavras Únicas

<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>

## Pesquisa em Set

### 1. Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.
</p>

### 2. Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.
</p>
