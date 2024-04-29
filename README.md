## 🎶 Desafio - Aplicação para cadastrar músicas, podcasts e áudiobooks preferidos.

### Tecnologias Utilizadas:

-   Java.

### Conceitos trabalhados::

-   Orientação a objetos:
    - abstração;
    - herança;
    - encapsulamento;
    - polimorfismo.

### Objetivos do projeto:
1. Organizar o código em pacotes.
2. Criar uma classe Audio com os atributos (titulo, totalReproducoes, totalCurtidas e classificacao).
3. Utilizar encapsulamento, deixando os atributos privados e criando os getters e setters para acessar e modificar os atributos.
4. Criar dois métodos sem retorno: curte() e reproduz(), que irão incrementar as variáveis totalCurtidas e totalReproducoes, respectivamente.
5. Criar uma classe Musica estendendo de Audio, com os atributos adicionais album, cantor e genero.
6. Criar uma classe Podcast estendendo de Audio, com os atributos adicionais apresentador e descricao.
7. Criar uma classe Principal e instanciar um objeto do tipo Musica e outro do tipo Podcast, preenchendo seus atributos;
8. Criar um loop para chamar os métodos curte() e reproduz() a fim de simular um número grande de reproduções e curtidas.
9. Fazer uma sobrescrita do método getClassificacao na classe Musica, definindo que se a mesma tiver mais de 2000 reproduções a classificação será 10 e para valores inferiores a classificação será 8.
10. Fazer uma sobrescrita do método getClassificacao na classe Podcast, definindo que se o mesmo tiver mais de 500 curtidas a classificação será 10 e para valores inferiores, a classificação será 7.
11. Criar uma classe chamada MusicasPreferidas ou apenas Preferencias, com um método sem retorno (void) chamado inclui, que receberá como parâmetro um Audio.
12. No método inclui, trabalharemos o polimorfismo, onde iremos utilizar o getClassificacao (de acordo com a subclasse que for passada aqui como parâmetro) para exibir alguma mensagem.
13. Finalizar instanciando um objeto do tipo MusicasPreferidas ou Preferencias e incluindo a música e podcast instanciados anteriormente.

### Extra

Para além do desafio proposto, criei uma classe chamada AudioBook que estende de Audio, com atributo adicional de duracaoEmMinutos; e criei uma interface chamada Avaliavel, onde declarei o método getClassificação, de modo que as classes Musica, Podcast e AudioBook implementaram essa interface!



----------

Lembre-se de conferir o repositório original  [aqui](https://github.com/alura-cursos/2887-java-desafio/blob/main/README.md)!
