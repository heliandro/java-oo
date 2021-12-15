# POC Java

Estudo da linguagem Java

## Requisitos

* OpenJDK 11+
* Editor de texto

## Pontos abordados

* Composição
* Encapsulamento
* Construtores
* Membros estaticos

## Organização

Os topicos abordados estão comitados em suas respectivas branchs.
Por exemplo, para o tópico de `Composição` temos uma branch chamada `feature/composicao` e assim sucessivamente.

## Rodando o código

para compilar o código

```sh
javac -d bin ./src/**/*.java
```

para executar

```sh
java -cp bin App
```

## Gerando a documentação

```sh
javadoc src/**/*.java -d docs
```

## Trabalhando com jar

[jar file](https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html)

[Criando um jar](https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html)

entre na pasta bin

```sh
cd bin
```

crie o jar

```sh
jar cvfe bytebank.jar "$(find br | grep TesteSaca.class | awk '{gsub("\/", ".", $0); gsub("\.class", "", $0); print}')" ./**/*.class
```

[executando o jar](https://docs.oracle.com/javase/tutorial/deployment/jar/run.html)

```sh
java -jar bytebank.jar
```

[mostra a estrutura de diretorios dentro do jar](https://docs.oracle.com/javase/tutorial/deployment/jar/view.html)

```sh
jar -tf bytebank.jar
```

[descompacta o jar](https://docs.oracle.com/javase/tutorial/deployment/jar/unpack.html)

```sh
jar -xf bytebank.jar
```