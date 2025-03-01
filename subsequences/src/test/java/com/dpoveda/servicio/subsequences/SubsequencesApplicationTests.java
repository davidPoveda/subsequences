package com.dpoveda.servicio.subsequences;

import com.dpoveda.servicio.subsequences.service.SubsequencesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Clase de prueba para la aplicación de subsecuencias.
 */
@SpringBootTest
class SubsequencesApplicationTests {

	@Autowired
	public SubsequencesService subsequencesService;
	/**
	 * Prueba para verificar que la aplicación carga el contexto correctamente.
	 */
	@Test
	void contextLoads() {
		int valorTotal = subsequencesService.cantidadSubsequences("babgbag","bag");
		Assertions.assertEquals(valorTotal, 5);
	}
	/**
	 * Prueba para verificar que la aplicación maneja una cadena vacía como subsecuencia.
	 */
	@Test
	void contextLoads2() {
		int valorTotal = subsequencesService.cantidadSubsequences("","bag");
		Assertions.assertEquals(valorTotal, 0);
	}
	/**
	 * Prueba para verificar que la aplicación maneja una subsecuencia vacía.
	 */
	@Test
	void contextLoads3() {
		int valorTotal = subsequencesService.cantidadSubsequences("babgbag","");
		Assertions.assertEquals(valorTotal, 0);
	}
	/**
	 * Prueba para verificar que la aplicación maneja una cadena nula como subsecuencia.
	 */
	@Test
	void contextLoads4() {
		int valorTotal = subsequencesService.cantidadSubsequences(null,"bag");
		Assertions.assertEquals(valorTotal, 0);
	}
	/**
	 * Prueba para verificar que la aplicación maneja una subsecuencia nula.
	 */
	@Test
	void contextLoads5() {
		int valorTotal = subsequencesService.cantidadSubsequences("babgbag",null);
		Assertions.assertEquals(valorTotal, 0);
	}
}
