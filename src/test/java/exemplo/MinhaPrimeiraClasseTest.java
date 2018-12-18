package exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinhaPrimeiraClasseTest {

    @Test
    public void testRetornaData() {
    }

    @Test
    public void testRetornaIdade() {
       //assertTrue(false);
    }

    @Test
    public void validaSaldo() {
        Conta conta = new Conta();
        assertTrue(conta.isSaldoPositivo(), "Saldo insufuciente");
    }
}