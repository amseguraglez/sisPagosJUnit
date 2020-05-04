package edd.junit.syspagos;

import edd.junit.syspagos.excepciones.CargoException;
import edd.junit.syspagos.excepciones.MesesTrabajoException;
import edd.junit.syspagos.excepciones.NombreEmpleadoException;
import edd.junit.syspagos.excepciones.NumeroEmpleadoException;
import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class EmpleadoTest {

    @Test @DisplayName("Establecer numero empleado correcto. FALLA")
    public void establecerNumero_empleado_Correcto() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("4");
        } catch (NumeroEmpleadoException ex) {
            Assertions.fail();
        }
        //Assertions.assertEquals(4,e.getNumero_empleado());
    }

    @Test @DisplayName("Establecer numero limite 000. OK")
    public void establecerNumero_empleado_000() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("000");
        });
    }

    @Test @DisplayName("Establecer numero limite 999. FALLA")
    public void establecerNumero_empleado_999() {

        Empleado e = new Empleado();
        Exception exception = Assertions.assertThrows(NumeroEmpleadoException.class, () -> {
            e.establecerNumero_empleado("999");
        });

    }

    @Test @DisplayName("Comprobar empleado 1. OK")
    public void comprobar_empleado1() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("625");
            e.estableceNombre_empleado("Jorge");
            e.establecerMeses_Trabajo("035");
            e.establecerSerDirectivo("+");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 2. FALLA")
    public void comprobar_empleado2() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("-532");
            e.estableceNombre_empleado("Alicia");
            e.establecerMeses_Trabajo("024");
            e.establecerSerDirectivo("-");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 3. FALLA")
    public void comprobar_empleado3() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("321");
            e.estableceNombre_empleado("Juan Antonio");
            e.establecerMeses_Trabajo("002");
            e.establecerSerDirectivo("-");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 4. FALLA")
    public void comprobar_empleado4() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("258");
            e.estableceNombre_empleado("Lucia");
            e.establecerMeses_Trabajo("1785");
            e.establecerSerDirectivo("-");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 5. FALLA")
    public void comprobar_empleado5() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("698");
            e.estableceNombre_empleado("Ana");
            e.establecerMeses_Trabajo("256");
            e.establecerSerDirectivo("?");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 6. OK")
    public void comprobar_empleado6() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("999");
            e.estableceNombre_empleado("Ana");
            e.establecerMeses_Trabajo("256");
            e.establecerSerDirectivo("-");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 7. FALLA")
    public void comprobar_empleado7() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("6529");
            e.estableceNombre_empleado("Ana");
            e.establecerMeses_Trabajo("256");
            e.establecerSerDirectivo("-");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 8. FALLA")
    public void comprobar_empleado8() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("001");
            e.estableceNombre_empleado("Manuela Malasaña");
            e.establecerMeses_Trabajo("256");
            e.establecerSerDirectivo("-");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 9. OK")
    public void comprobar_empleado9() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("001");
            e.estableceNombre_empleado("Manuela");
            e.establecerMeses_Trabajo("000");
            e.establecerSerDirectivo("-");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 10. FALLA")
    public void comprobar_empleado10() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("001");
            e.estableceNombre_empleado("Luis");
            e.establecerMeses_Trabajo("999");
            e.establecerSerDirectivo("--");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 11. FALLA")
    public void comprobar_empleado11() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("001");
            e.estableceNombre_empleado("Luis");
            e.establecerMeses_Trabajo("999");
            e.establecerSerDirectivo("");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 12. FALLA")
    public void comprobar_empleado12() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("001");
            e.estableceNombre_empleado("L");
            e.establecerMeses_Trabajo("999");
            e.establecerSerDirectivo(" ");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Comprobar empleado 13. FALLA")
    public void comprobar_empleado13() {

        Empleado e = new Empleado();
        try {
            e.establecerNumero_empleado("001");
            e.estableceNombre_empleado("L");
            e.establecerMeses_Trabajo("24");
            e.establecerSerDirectivo(" ");
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException | MesesTrabajoException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Calcular prima 1. OK (P4)")
    public void comprobar_prima1() {

        Empleado e = new Empleado();
        try {
            System.out.println(e.calcularPrima("001", "Luis",
                    "002", "-"));
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException |
                MesesTrabajoException | RuntimeException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Calcular prima 2. FALLA")
    public void comprobar_prima2() {

        Empleado e = new Empleado();
        try {
            System.out.println(e.calcularPrima("001", "Luis",
                    "254", "?"));
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException |
                MesesTrabajoException | RuntimeException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Calcular prima 3. OK (P3)")
    public void comprobar_prima3() {

        Empleado e = new Empleado();
        try {
            System.out.println(e.calcularPrima("001", "Luis",
                    "010", "+"));
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException |
                MesesTrabajoException | RuntimeException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Calcular prima 4. OK (P2)")
    public void comprobar_prima4() {

        Empleado e = new Empleado();
        try {
            System.out.println(e.calcularPrima("001", "Luis",
                    "012", "-"));
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException |
                MesesTrabajoException | RuntimeException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Calcular prima 5. FALLA")
    public void comprobar_prima5() {

        Empleado e = new Empleado();
        try {
            System.out.println(e.calcularPrima("001", "Luis",
                    "0052", "++"));
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException |
                MesesTrabajoException | RuntimeException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }

    @Test @DisplayName("Calcular prima 6. OK (P1)")
    public void comprobar_prima6() {

        Empleado e = new Empleado();
        try {
            System.out.println(e.calcularPrima("001", "Luis",
                    "014", "+"));
        } catch (NumeroEmpleadoException | NombreEmpleadoException | CargoException |
                MesesTrabajoException | RuntimeException ex) {
            System.out.println("Excepción: "+ ex.getClass().getSimpleName());
            Assertions.fail();
        }
    }














}
