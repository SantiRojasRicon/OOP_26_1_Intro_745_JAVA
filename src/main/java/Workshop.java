import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class WorkshopTest {

private Workshop workshop;

@BeforeEach
public void setUp() {
    workshop = new Workshop();
}

@Test
public void testSumarDosNumeros() {
    assertEquals(5, workshop.sumarDosNumeros(2, 3));
}

@Test
public void testMayorDeTresNumeros() {
    assertEquals(9, workshop.mayorDeTresNumeros(9, 5, 3));
}

@Test
public void testTablaMultiplicar() {
    int[] esperado = {2,4,6,8,10};
    assertArrayEquals(esperado, workshop.tablaMultiplicar(2, 5));
}

@Test
public void testFactorial() {
    assertEquals(120, workshop.factorial(5));
}

@Test
public void testEsPrimo() {
    assertTrue(workshop.esPrimo(7));
    assertFalse(workshop.esPrimo(4));
}

@Test
public void testSerieFibonacci() {
    int[] esperado = {0,1,1,2,3};
    assertArrayEquals(esperado, workshop.serieFibonacci(5));
}

@Test
public void testSumaElementos() {
    int[] arr = {1,2,3};
    assertEquals(6, workshop.sumaElementos(arr));
}

@Test
public void testPromedioElementos() {
    int[] arr = {2,4,6};
    assertEquals(4.0, workshop.promedioElementos(arr));
}

@Test
public void testEncontrarElementoMayor() {
    int[] arr = {1,9,3};
    assertEquals(9, workshop.encontrarElementoMayor(arr));
}

@Test
public void testEncontrarElementoMenor() {
    int[] arr = {1,9,3};
    assertEquals(1, workshop.encontrarElementoMenor(arr));
}

@Test
public void testBuscarElemento() {
    int[] arr = {1,2,3};
    assertTrue(workshop.buscarElemento(arr, 2));
    assertFalse(workshop.buscarElemento(arr, 5));
}

@Test
public void testInvertirArreglo() {
    int[] arr = {1,2,3};
    int[] esperado = {3,2,1};
    assertArrayEquals(esperado, workshop.invertirArreglo(arr));
}

@Test
public void testOrdenarArreglo() {
    int[] arr = {3,1,2};
    int[] esperado = {1,2,3};
    assertArrayEquals(esperado, workshop.ordenarArreglo(arr));
}

@Test
public void testEliminarDuplicados() {
    int[] arr = {1,1,2,2,3};
    int[] resultado = workshop.eliminarDuplicados(arr);
    assertArrayEquals(new int[]{1,2,3}, resultado);
}

@Test
public void testCombinarArreglos() {
    int[] a = {1,2};
    int[] b = {3,4};
    assertArrayEquals(new int[]{1,2,3,4}, workshop.combinarArreglos(a,b));
}

@Test
public void testRotarArreglo() {
    int[] arr = {1,2,3,4};
    int[] esperado = {3,4,1,2};
    assertArrayEquals(esperado, workshop.rotarArreglo(arr, 2));
}

@Test
public void testContarCaracteres() {
    assertEquals(5, workshop.contarCaracteres("Hola!"));
}

@Test
public void testInvertirCadena() {
    assertEquals("aloH", workshop.invertirCadena("Hola"));
}

@Test
public void testEsPalindromo() {
    assertTrue(workshop.esPalindromo("anita lava la tina"));
}

@Test
public void testContarPalabras() {
    assertEquals(3, workshop.contarPalabras("Hola mundo test"));
}

@Test
public void testConvertirAMayusculas() {
    assertEquals("HOLA", workshop.convertirAMayusculas("hola"));
}

@Test
public void testConvertirAMinusculas() {
    assertEquals("hola", workshop.convertirAMinusculas("HOLA"));
}

@Test
public void testReemplazarSubcadena() {
    assertEquals("Hola Java", workshop.reemplazarSubcadena("Hola Mundo", "Mundo", "Java"));
}

@Test
public void testBuscarSubcadena() {
    assertEquals(5, workshop.buscarSubcadena("Hola Mundo", "Mundo"));
}

@Test
public void testValidarCorreoElectronico() {
    assertTrue(workshop.validarCorreoElectronico("test@gmail.com"));
    assertFalse(workshop.validarCorreoElectronico("correo_invalido"));
}

@Test
public void testPromedioLista() {
    List<Integer> lista = Arrays.asList(2,4,6);
    assertEquals(4.0, workshop.promedioLista(lista));
}

@Test
public void testConvertirABinario() {
    assertEquals("1010", workshop.convertirABinario(10));
}

@Test
public void testConvertirAHexadecimal() {
    assertEquals("A", workshop.convertirAHexadecimal(10));
}

@Test
public void testAreaCirculo() {
    assertEquals(Math.PI * 4, workshop.areaCirculo(2));
}

@Test
public void testZodiaco() {
    assertEquals("Aries", workshop.zoodiac(25, 3));
}

}
