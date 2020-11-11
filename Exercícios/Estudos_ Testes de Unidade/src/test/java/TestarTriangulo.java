import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestarTriangulo {

    @Test
    public void testarEquilatero(){
                        // Classe sendo testada:

        Triangulo t = new Triangulo();

                        // Fazendo testes com assertEquals:

        // Entradas em zero
        assertEquals("Tamanho A não pode ser Zero", "Não é um triângulo",t.verificarTipo(0,1,1));
        assertEquals("Tamanho C não pode ser Zero", "Não é um triângulo",t.verificarTipo(1,1,0));
        assertEquals("Tamanho B não pode ser Zero", "Não é um triângulo",t.verificarTipo(1,0,1));
        assertEquals("Tamanho B e C não podem ser Zero", "Não é um triângulo",t.verificarTipo(1,0,0));
        assertEquals("Tamanho A e C não podem ser Zero", "Não é um triângulo",t.verificarTipo(0,0,1));
        assertEquals("Tamanho A, B e C não podem ser Zero", "Não é um triângulo",t.verificarTipo(0,0,0));

        // Entradas negativas
        assertEquals("Tamanho A não pode ser negativo", "Não é um triângulo", t.verificarTipo(-1,1,1));
        assertEquals("Tamanho B não pode ser negativo", "Não é um triângulo", t.verificarTipo(1,-1,1));
        assertEquals("Tamanho C não pode ser negativo", "Não é um triângulo", t.verificarTipo(1,1,-1));
        assertEquals("Tamanho A e C não podem ser negativos", "Não é um triângulo", t.verificarTipo(-1,1,-1));
        assertEquals("Tamanho B e C não podem ser negativos", "Não é um triângulo", t.verificarTipo(1,-1,-1));
        assertEquals("Tamanho A, B e C não podem ser negativos", "Não é um triângulo", t.verificarTipo(-1,-1,-1));

        // Equilátero
        assertEquals("Passando tamanhos iguais:", "equilátero", t.verificarTipo(1,1,1));

        // Isósceles
        assertEquals("Passando dois tamanhos iguais: A e B", "isósceles", t.verificarTipo(1,1,2));
        assertEquals("Passando dois tamanhos iguais: A e C", "isósceles", t.verificarTipo(1,2,1));
        assertEquals("Passando dois tamanhos iguais: B e C", "isósceles", t.verificarTipo(2,1,1));

        // Escaleno
        assertEquals("Passando três tamanhos diferentes", "escaleno", t.verificarTipo(2,3,1));

        // Entradas desobedecendo condição de existência
        assertEquals("Passando três tamanhos inválidos", "Não é um triângulo", t.verificarTipo(10,5,1));
        assertEquals("Passando três tamanhos inválidos", "Não é um triângulo", t.verificarTipo(1,5,10));
        assertEquals("Passando três tamanhos inválidos", "Não é um triângulo", t.verificarTipo(5,10,1));
    }
}
