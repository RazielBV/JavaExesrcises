import Exercises.*;
import java.util.Arrays;
import java.util.List;

public class TestsAdicionales {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 500.0);
        cuenta.depositar(200.0);
        cuenta.retirar(150.0);
        assert cuenta.getSaldo() == 550.0;

        Figura circulo = new Circulo(2.0);
        Figura rectangulo = new Rectangulo(3.0, 4.0);
        assert circulo.calcularArea() > 12.5 && rectangulo.calcularArea() == 12.0;

        Vehiculo auto = new Automovil("Toyota", "Corolla", 4);
        Vehiculo moto = new Motocicleta("Honda", "CB500", false);
        assert auto.mostrarInformacion().contains("4") && moto.mostrarInformacion().contains("false");

        List<Notificacion> notificaciones = Arrays.asList(
                new NotificacionCorreo("alumno@ejemplo.com"),
                new NotificacionConsola()
        );
        for (Notificacion n : notificaciones) {
            n.enviar("Prueba de polimorfismo");
        }

        Biblioteca biblioteca = new Biblioteca();
        Libro l1 = new Libro("Java Efectivo");
        Libro l2 = new Libro("Clean Code");
        Libro l3 = new Libro("Patrones de Diseño");
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);

        Usuario regular = new UsuarioRegular("Luis");
        biblioteca.prestarLibro(l1, regular);
        biblioteca.prestarLibro(l2, regular);
        biblioteca.devolverLibro(l1, regular);
        biblioteca.prestarLibro(l3, regular);
        assert l3.estaPrestado();

        System.out.println(true);
    }
}