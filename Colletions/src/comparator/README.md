# Exercício: Ordenando uma Lista de Livros
## Objetivo:
Implementar uma classe Livro que pode ser comparada por título usando Comparable e, adicionalmente, criar comparadores (Comparator) para comparar livros por preço e por ano de publicação.

### Instruções:
1 .Criar a classe Livro:

* A classe deve ter os seguintes atributos:
* String titulo
* double preco
* int anoPublicacao
* Implemente a interface Comparable<Livro> para comparar livros pela ordem alfabética dos títulos.

2. Criar comparadores:

* Crie dois comparadores usando a interface Comparator<Livro>:
* LivroComparatorPorPreco: compara livros pelo preço (ordem crescente).
* LivroComparatorPorAnoPublicacao: compara livros pelo ano de publicação (ordem decrescente).

3. Implementar o método main:

* No método main, crie uma lista de livros.
* Ordene a lista usando:
* A ordem natural (título) com Collections.sort().
* O comparador por preço com Collections.sort() e LivroComparatorPorPreco.
* O comparador por ano de publicação com Collections.sort() e LivroComparatorPorAnoPublicacao.
* Exiba a lista de livros ordenada em cada caso.