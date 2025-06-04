package it.S5D1.S5D1;

import it.S5D1.S5D1.beans.*;
import it.S5D1.S5D1.configuration.CopertoConfig;
import it.S5D1.S5D1.enumerating.StatoOrdine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class S5D1ApplicationTests {

	@Autowired
	private CopertoConfig copertoConfig;

	private Tavolo tavolo;
	private Pizza margherita;
	private Drink cola;

	@BeforeEach
	void setup() {
		tavolo = new Tavolo(1, 4, copertoConfig.getCosto());

		margherita = new Pizza();
		margherita.setNome("Margherita");
		margherita.setPrezzo(5.0);

		cola = new Drink();
		cola.setNome("Coca-Cola");
		cola.setPrezzo(2.5);
	}

	@Test
	void testCreazioneOrdine() {
		Ordine ordine = new Ordine(2, tavolo);
		assertEquals(2, ordine.getCoperti());
		assertTrue(ordine.getOraAcquisizione().isBefore(LocalTime.now().plusSeconds(1)));
		assertEquals(StatoOrdine.IN_CORSO, ordine.getStato());
	}

	@Test
	void testAggiuntaElemento() {
		Ordine ordine = new Ordine(1, tavolo);
		ordine.aggiungiElemento(margherita);
		assertEquals(1, ordine.getElementi().size());
		assertEquals("Margherita", ordine.getElementi().get(0).getNome());
	}

	@Test
	void testCalcoloTotale() {
		Ordine ordine = new Ordine(2, tavolo);
		ordine.aggiungiElemento(margherita);
		ordine.aggiungiElemento(cola);
		double expected = 5.0 + 2 * copertoConfig.getCosto() + 2.5;
		assertEquals(expected, ordine.getTotale(), 0.01);
	}

	@Test
	void testCambioStato() {
		Ordine ordine = new Ordine(1, tavolo);
		ordine.setStato(StatoOrdine.PRONTO);
		assertEquals(StatoOrdine.PRONTO, ordine.getStato());
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	void testTotaleConVariCoperti(int coperti) {
		Ordine ordine = new Ordine(coperti, tavolo);
		ordine.aggiungiElemento(margherita);
		double expected = 5.0 + coperti * copertoConfig.getCosto();
		assertEquals(expected, ordine.getTotale(), 0.01);
	}
}
