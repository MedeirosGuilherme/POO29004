# Comandos git e linguagem de programação Java

## Linguagem de programação Java
### Tipos primitivos
```java
public static void main(String args[]){

    // Dado do tipo byte:
    byte b;

    // Dado do tipo short:
    short s;

    //dado do tipo int:
    int i;

    //dado do tipo long:
    long l;

    //dado do tipo float:
    float f;

    //dado do tipo double:
    double d;

    //dado do tipo char:
    char c;

    //dado do tipo boolean:
    boolean bo
}
```

### Classe String
```java
public static void main(String args[]){

    //Criando variável do tipo String com   valor nulo:
    String s = null;

    //Verificando se a variável está vazia:
    s.empty() //Retornará true
          
    //Atribuindo valor à variável:
    s = "PoO"; //String s agora contém "PoO"

    //Comparando strings:
    s.equals("PoO"); //Retornara true
    s.equals("Err"); //Retornara false

}

```

### Interação com o usuário
```java
import java.util.Scanner;

public static void main(String args[]){

    //criando dados:
    int t;
    String s;

    //Criando dado do tipo Scanner para ler entradas do teclado:
    Scanner teclado = new Scanner(System.in);

    //Lendo dados do tipo String:
    s = teclado.nextline();

    //Lendo dados do tipo int:
    t = teclado.nextInt();
}
```

## Comandos Git
### Como mesclar ramos
```shell
git checkout master
git merge primitivo
git branch -d primitivo

git merge string
```