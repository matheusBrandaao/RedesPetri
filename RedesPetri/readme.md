##Gestão Bibliotecas

Pequeno sistema de gestão de bibliotecas onde é possível receber livros, organiza-los e exibir o resultado do mesmo.

#### Configuração
- Baixar e instalar o Java Development Kit, após isso abrir a pasta do projeto, acessar a pasta dist e executar o arquivo GestaoBibliotecas.jar.

#### Tipos de Ordenação
- **Ordenação Simples** - Ordena os livros da forma que desejar por titulo, autor ou ano, tanto ascendente como descendente. 
- **Ordenação Dupla** -  Realiza a ordenação de forma que, se temos um atributo igual, ele realiza o ordenação pelo outro atributo selecionado. 

**Exemplo:**
Autor ascendente, titudo descendente.

Título  | Autor | Ano
------------- | -------------
Java How To Program| Deitel & Deitel | 2007
Patterns of Enterprise Application Architecture| Martin Fowler | 2002
Head First Design Patterns | Elisabeth Freeman | 2004
Internet & World Wide Web: How to Program | Deitel & Deitel | 2007

**Resultado**

Título  | Autor | Ano
------------- | -------------
Java How To Program| Deitel & Deitel | 2007
Internet & World Wide Web: How to Program | Deitel & Deitel | 2007
Head First Design Patterns | Elisabeth Freeman | 2004
Patterns of Enterprise Application Architecture| Martin Fowler | 2002


- **Ordenação Tripla** - Funciona da mesma forma que a ordenação dupla, se fois atributos selecionados forem iguais, será ordenado pelo atributo selecionado que é diferente, caso apenas um seja diferente, é ordenado pelo ultimo selecionado e caso nenhum seja igual é ordenado pelo ano.

**Exemplo:**
Edição descendente, Autor descendente, Título ascendente

**Resultado**

Título  | Autor | Ano
------------- | -------------
Internet & World Wide Web: How to Program | Deitel & Deitel | 2007
Java How To Program| Deitel & Deitel | 2007
Head First Design Patterns | Elisabeth Freeman | 2004
Patterns of Enterprise Application Architecture| Martin Fowler | 2002



##Classe GestaoBiblioteca
Classe utilizada para cuidar da parte visual, realizando a configuração e logica da interface gráfica e chamando seus devidos para que a aplicação funcione.

###Métodos da classe GestaoBiblioteca

Nome dos Métodos  | Descrição
------------- | -------------
`readFile()`  | Método para manipulação do arquivo texto "livro.txt".
`orderBook()` | Método para ordenação, existe mais dois metodos orderBook() porém cada um com uma assinatura diferente, o primeiro para ordenação com apenas um atributo, segundo com dois e terceiro com três.
`btmOrderActionPerformed()` | Método para validação de qual atributo será utilizado e qual sera sua direção de ordenação.

##Classe Livro e Comparators
Nessa classe é encontrada toda a lógica de criação de objeto e métodos de ordenação dos livros.

###Métodos da classe Livros

Nome dos Métodos  | Descrição
------------- | -------------
`orderAttribute()`  | Define a partir do atributo a sua ordem de ordenação.
`orderTitle()` | Método para ordenação do atributo titulo.
`orderAuthor()` | Método para ordenação do atributo Autor.
`orderYear()` | Método para ordenação do atributo ano.
`doubleOrder()` | Método para realizar ordenação com dois atributos.
`tripleOrder()` | Método para realizar ordenação com três atributos.
`showValues()` | Retorna uma String com todos os dados do objeto em questão.

###Métodos da classe Comparators 

Nome dos Métodos  | Descrição
------------- | -------------
`Comparator<Livro> TITLE`  | Realizada a comparação de dois objetos livro, em relação ao título.
`Comparator<Livro> AUTHOR` | Realizada a comparação de dois objetos livro, em relação ao autor.
`Comparator<Livro> YEAR` | Realizada a comparação de dois objetos livro, em relação ao ano.
`Comparator<Livro> DOUBLE_COMPARATOR` | Realiza as comparações seguindo a regra da ordenação dupla.
`Comparator<Livro> TITULO_AUTOR_ANO` | Realiza as comparações seguindo a regra da ordenação tripla.

###Técnologias
- Java
- Biblioteca Gráfica Swing

###Suporte
- Sistemas com Java Development Kit


