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
- Foi foi os testes em um notebook da Lenovo 30 Gamming com processador i5-11300H com 16 Gb de memória RAM

# Como executar
1. Clone o repositório
git clone https://github.com/Andrei-SantAnna/Entrega-2.git
2. Prepare o arquivo de entrada:
Não é necessário utilizar o arquivo Entrega_01.txt, se quiser testar com seus próprios dados pode criar utilizando o notepad para ser lido, lembrando que deve alterar no código o nome do arquivo a ser lido
3. Compilando e Executando
Depois de clonado no terminal bash escreva e execute o comando
javac *.java
Depois o comando:
java Main
Depois de executado será exibido no console o tempo das três abordagens como no exemplo abaixo:
Tempo (1 thread): 78 ms
Tempo (5 threads): 52 ms
Tempo (10 threads): 57 ms
E cria o arquivo Primos.txt, onde contém somente os números primos do arquivo de entrada
4. Comprovando se os números são realmente primos
Utilize o site: https://pt.numberempire.com/primenumbers.php , ele verifica se o número no arquivo é realmente um primo, para comprovação da eficiência do código
# Análise de Desempenho
<img width="1653" height="993" alt="Gráfico" src="https://github.com/user-attachments/assets/83b4a782-267b-46d4-926e-7093991f85e4" />
Analisando o gráfico acima podemos ter uma ideia sobre o desempenho do paralelismo
- Para esse estudo, foi executado o código 31 vezes para ser possível tirar uma média mais precisa
- Com isso foi possível verificar que o processo paralelo com 5 threads teve uma apresentação melhor entre os 3
- O uso de 10 threads acabou não trazendo necessáriamente um ganho adicional
- Isso mostra que há um excelente ponto na quantidade de threads, porém também deve se levar em consideração o tamanho da quantidade do arquivo de entrada e da arquitetura da máquina onde está ocorrendo os testes
