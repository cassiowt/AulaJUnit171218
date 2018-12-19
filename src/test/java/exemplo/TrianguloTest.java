package exemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrianguloTest {

    private Triangulo triangulo;


    @BeforeEach
    public void init() {
        triangulo = new Triangulo(2,2,3);
    }

    @ParameterizedTest
    @EnumSource (TipoTriangulo.class)
    void testTipoTriangulos(TipoTriangulo tipoTriangulo) {
        assertNotNull(tipoTriangulo);
    }



}
