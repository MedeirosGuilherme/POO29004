1. Java é uma linguagem interpretada ou compilada?

    - **Resposta:** é uma linguagem de programação compilada.

2. O que necessário para executar uma aplicação desenvolvida em Java?

    - **Resposta:** O usuário precisa ter instalada a Java Virtual Machine em sua máquina. Assim como estar de posse do arquivo da aplicação compilado.

3. O que significa o conceito: write once, run anywhere?

    - **Resposta:** Este era o slogan que a empresa *Sun*, criadora da linguagem, usava para o Java. A grande ideia foi a de fazer com que qualquer aplicação fosse executada em uma máquina virtual Java rodando no sistema operacional. Isso faz com que um programa não precise ser reescrito para cada arquitetura, facilitando a execução das aplicações. 

4. Qual a atual versão do JDK Java? Como você faz para instalar o JDK no sistema operacional de sua preferência?

    - **Resposta:** A atual versão do *Java Development Kit* é a 12.0.2.
    Para instalar, deve-se acessar o site da Oracle e escolher o sistema operacional de sua preferência. Está disponível em distribuições do Linux, no Mac e no Windows.
    No Linux, após o download do arquivo .tar.gz, basta executar o comando:
    ```Bash
    $ tar zxvf jdk-12.interim.update.patch_linux-x64_bin.tar.gz
    ```
    [Oracle](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html) - Download do JDK Java.

5. Abaixo é apresentado o conteúdo do arquivo Exemplo.java e o mesmo apresenta erro ao
ser compilado com o comando javac Exemplo.java. Faça as devidas correções para que o arquivo seja compilado sem problemas.

    ```Java
    public class OlaMundo{
    public static void main(String args[]){
        int i = 10.0;
        System.out.print("Olá mundo")

        double j = 2;

        j+=i;
        System.out.print("Valor de j ´e: " j);
        }
    }
    ```

    - **Resposta:**

    ```Java
    public class Exemplo{
    public static void main(String args[]){
        int i = 10;
        System.out.print("Olá mundo");

        double j = 2;

        j+=i;
        System.out.print("Valor de j é: " + j);
        }
    }
    ```

    


