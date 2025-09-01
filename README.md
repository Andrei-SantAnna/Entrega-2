# Entrega-2


# Descrição
Este projeto implementa um programa em **Java** para verificar números primos em um arquivo de entrada, gravando os resultados em um arquivo de saída.

O objetivo do projeto é a comapração de desempenho em 3 abordagens diferentes:
 - 1 thread (execução sequencial)
 - 5 threads (execução paralela)
 - 10 threads (execução paralela)
O programa vai medir o tempo de execução de cada abordagem, assim permitindo ao final uma análise em relaçao ao ganho de desempenho utilizando o paralelismo

# Estrutura do Código
# Main 
  - Contém o método `main`, que é o ponto de entrada do programa.  
  - Responsável por:
    - Ler os números do arquivo Entrada_01.txt.
    - Executar os testes sequenciais e paralelos.
    - Medir os tempos de execução.
    - Salvar os primos encontrados em Primos.txt.

- # VerificadorPrimo.java 
  - Classe utilitária com método estático ePrimo(int n).  
  - Implementa a lógica de verificação de primalidade de forma eficiente, evitando cálculos desnecessários (testa apenas até a raiz quadrada do número).

- # TarefaPrimo.java 
  - Classe que implementa `Runnable`.  
  - Representa uma tarefa que processa **um intervalo** de números da lista de entrada.  
  - Para cada número, chama `VerificadorPrimo.ePrimo()`.  
  - Atualiza o vetor de resultados com o uso de `ReentrantLock` para garantir exclusão mútua na escrita.

- # Entrada_01.txt 
  - Arquivo de entrada com os números a serem testados, um por linha.  

- # Primos.txt
  - Arquivo de saída gerado pelo programa, contendo apenas os números primos detectados.  

- # Gráfico.png  
  - Gráfico comparando o tempo médio de execução entre 1, 5 e 10 threads.
 
  
# O que foi utilizado
- Foi utilizado a linguagem de programação Java (biblioteca jdk 24.0.2)
- Linux Ubuntu  24.04.3 LTS
- Utilizado o Visual Studio Code para realização do projeto
- O Microsoft Office Excel para a criação do gráfico comparativo

# Como executar
1. Clone o repositório
git clone 
