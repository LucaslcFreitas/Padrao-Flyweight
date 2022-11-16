import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TremTest {

    @Test
    void deveRetornarVagoes() {
        Trem trem = new Trem();
        trem.adicionarVagao("GBT1905", "GONDOLA", 100000.0);
        trem.adicionarVagao("JKW7619", "PRANCHA", 30000.0);
        trem.adicionarVagao("PMJ4481", "HOPPER", 60000.0);
        trem.adicionarVagao("AKB1271", "GONDOLA", 100000.0);
        trem.adicionarVagao("NNT6592", "GONDOLA", 100000.0);

        List<String> saida = Arrays.asList(
                "Vagao{prefixo='GBT1905', nome='GONDOLA', capacidade='100000.0'}",
                "Vagao{prefixo='JKW7619', nome='PRANCHA', capacidade='30000.0'}",
                "Vagao{prefixo='PMJ4481', nome='HOPPER', capacidade='60000.0'}",
                "Vagao{prefixo='AKB1271', nome='GONDOLA', capacidade='100000.0'}",
                "Vagao{prefixo='NNT6592', nome='GONDOLA', capacidade='100000.0'}"
                );

        assertEquals(saida, trem.obterVagoes());
    }

    @Test
    void deveRetornarTotalModelos() {
        Trem trem = new Trem();
        trem.adicionarVagao("GBT1905", "GONDOLA", 100000.0);
        trem.adicionarVagao("JKW7619", "PRANCHA", 30000.0);
        trem.adicionarVagao("PMJ4481", "HOPPER", 60000.0);
        trem.adicionarVagao("AKB1271", "GONDOLA", 100000.0);
        trem.adicionarVagao("NNT6592", "GONDOLA", 100000.0);

        assertEquals(3, ModeloFactory.getTotalModelos());
    }
}