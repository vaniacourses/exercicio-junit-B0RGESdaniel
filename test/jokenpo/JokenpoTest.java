package jokenpo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JokenpoTest {
	private Jokenpo jokenpo;
	
	@BeforeEach
	void inicializa() {
		jokenpo = new Jokenpo();
	}
	
	@Test
	void testRetornaEmpateQuandoEscolhemIgual() {
		assertEquals(0, jokenpo.jogar(1, 1));
		assertEquals(0, jokenpo.jogar(2, 2));
		assertEquals(0, jokenpo.jogar(3, 3));
	}
	
    @Test
    void testValidaVitoriaJogador1() {
        assertEquals(1, jokenpo.jogar(1, 2));
        assertEquals(1, jokenpo.jogar(2, 3));
        assertEquals(1, jokenpo.jogar(3, 1));
    }

    @Test
    void deveValidaVitoriaJogador2() {
        assertEquals(2, jokenpo.jogar(2, 1));
        assertEquals(2, jokenpo.jogar(3, 2));
        assertEquals(2, jokenpo.jogar(1, 3));
    }

	
	@Test
	void testRetornaMenosUmQuandoEntradaInvalida() {
		assertEquals(-1, jokenpo.jogar(1, -5));
		assertEquals(-1, jokenpo.jogar(7, 1));
		assertEquals(-1, jokenpo.jogar(6, 8));
	}
}
