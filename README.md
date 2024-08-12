# Comparator vs CompareTO

## Comparator 
Pertence a Interface comparable, permite a comparação de objetos de múltiplas maneiras diferentes, não precisa necessariamente seguir a ordem natural.
### Como Funciona?
A assinatura se escreve dessa maneira: 
`` int compare(T o1, T o2) ``
Você cria uma classe separada que implementa Comparator e define o método compare, que compara dois objetos do mesmo tipo.

* Retorna um valor negativo se o primeiro objeto é menor que o segundo.
* Retorna zero se o primeiro objeto é igual ao segundo.
* Retorna um valor positivo se o primeiro objeto é maior que o segundo.

#CompareTo
Um objeto de uma classe que implementa o método compareble pode ser comparado com outro objeto do mesmo tipo. É usado para definir a ordem natural de uma classe.
###Como Funciona?
A assinatura se escreve dessa maneira: 
`` int compareTo(T o)``
Quando uma classe implementa Comparable, ela define uma ordem natural para os seus objetos. O método compareTo deve ser implementado para especificar como essa ordem é determinada.

* Retorna um valor negativo se o objeto atual é menor que o objeto passado como parâmetro.
* Retorna zero se o objeto atual é igual ao objeto passado como parâmetro.
* Retorna um valor positivo se o objeto atual é maior que o objeto passado como parâmetro.

  ## Referências
  [Método compareTo](https://javarush.com/pt/groups/posts/pt.1885.mtodo-compareto)
  
  [Interface Comparable](https://leandersonandre.medium.com/interface-comparable-como-comparar-objetos-na-linguagem-de-programa%C3%A7%C3%A3o-java-d08deb842cc9)
  
  [Como comparar objetos](https://www.javaprogressivo.net/2012/11/Comparando-objetos-Classe-abstrata-Comparable-metodo-compareTo.html)
