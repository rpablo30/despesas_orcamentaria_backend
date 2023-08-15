package com.api.nyx.gastosrecife;

import com.api.nyx.gastosrecife.controllers.DespesasController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GastosRecifeApplicationTests {

	@Autowired
	private DespesasController controller;
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
