import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TemplateMethodTest {
    @Test
    void retornaCarroPopular() {
        AutomovelTemplate carroPopular = new CarroPopular();
        carroPopular.fabricaCarro();


        assertEquals("Carro{base=simples,carcaca=simples,pintura=padrao,interior=padrao}",  carroPopular.toString());

    }
    @Test
    void retornaCarroEsporte() {
        AutomovelTemplate carroEsporte = new CarroEsporte();
        carroEsporte.fabricaCarro();


        assertEquals("Carro{base=tunada,carcaca=tunada,pintura=perolizada,interior=tecnologico}",  carroEsporte.toString());

    }

    @Test
    void retornaFalha() {
        AutomovelTemplate carroEsporte = new CarroEsporte();
        carroEsporte.fabricaCarro();


        assertEquals("Carro{base=tunada,carcaca=tunada,pintura=perolizada,interior=tecnologico}",  carroEsporte.toString());

    }


}