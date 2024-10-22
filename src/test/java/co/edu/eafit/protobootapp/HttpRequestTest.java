package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

// Pruebas de integración
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSaludoPorDefecto() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hola",
                String.class)).contains("Hola Mundo!!!");  // Añadido un signo de exclamación extra
    }

    @Test
    public void testCuadradoPorDefecto() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/cuadrado",
                String.class)).containsPattern("El cuadrado de 0[\\.,]000000 es 1[\\.,]000000");  // Cambiado de 0 a 1
    }

    @Test
    public void testCuboPorDefecto() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/cubo",
                String.class)).containsPattern("El cubo de 0[\\.,]000000 es 1[\\.,]000000");  // Cambiado de 0 a 1
    }

    @Test
    public void testCuadradoNumero() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/cuadrado?numero=3",
                String.class)).containsPattern("El cuadrado de 3[\\.,]000000 es 10[\\.,]000000");  // Cambiado de 9 a 10
    }

    @Test
    public void testCuboNumero() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/cubo?numero=3",
                String.class)).containsPattern("El cubo de 3[\\.,]000000 es 28[\\.,]000000");  // Cambiado de 27 a 28
    }
}