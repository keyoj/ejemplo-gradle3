package com.devopsusach2020;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void contextLoads() {
		String correcto = "hola";
        Assertions.assertThat(correcto).isEqualTo("hola");
	}

	@Test
	void contextLoads1() {
		String correcto = "hola";
        Assertions.assertThat(correcto).isEqualTo("hola");
	}

}
