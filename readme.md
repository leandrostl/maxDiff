# Max diff

Essa é uma aplicação java para console que permite achar a maior diferença entre elementos de um array de inteiros.

Devem ser consideradas apenas diferenças entre um elemento de maior índice e outro de menor índice e também apenas diferenças positivas. Assim, dado `{i, j | 0 <= i < j < n e a[i] < a[j]}, 
então max(a[j]-a[i])`.

## Execução
Para baixar o projeto basta cloná-lo desse repositório. Uma vez baixado e com o Maven rodando, na pasta do projeto, executar o comando `mvn install exec:java`. Após inserir os inteiros, o programa retornará em seguida o resultado.

## Entrada dos inteiros
O primeiro inteiro a ser fornecido pelo usuário deve ser o tamanho do array. Os demais inteiros devem ser os elementos do array a ser diferenciado.

## Algoritmo
O algoritmo utilizado é bastante simples e tem complexidade O(n).