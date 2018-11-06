/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.UsuarioBE;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASER
 */
public class UsuarioDATest {

    public UsuarioDATest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerIdVistaByUsuario method, of class UsuarioDA.
     */
    @Test
    public void testObtenerIdVistaByUsuario() {
        System.out.println("obtenerIdVistaByUsuario");
        UsuarioBE oUsuarioBE = null;
        UsuarioDA instance = new UsuarioDA();
        List<Integer> expResult = null;
        List<Integer> result = instance.obtenerIdVistaByUsuario(oUsuarioBE);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarUsuarioBE method, of class UsuarioDA.
     */
    @Test
    public void testListarUsuarioBE() throws Exception {
        System.out.println("listarUsuarioBE");
        UsuarioBE oUsuarioBE1 = null;
        UsuarioDA instance = new UsuarioDA();
        UsuarioBE expResult = null;
        UsuarioBE result = instance.listarUsuarioBE(oUsuarioBE1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarRegistroUsuarioBE method, of class UsuarioDA.
     */
    @Test
    public void testListarRegistroUsuarioBE() throws Exception {
        System.out.println("listarRegistroUsuarioBE");
        UsuarioBE oUsuarioBE1 = null;
        UsuarioDA instance = new UsuarioDA();
        ArrayList<UsuarioBE> expResult = null;
        ArrayList<UsuarioBE> result = instance.listarRegistroUsuarioBE(oUsuarioBE1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarRegistrosUsuarioBE method, of class UsuarioDA.
     */
    @Test
    public void testInsertarRegistrosUsuarioBE() throws Exception {
        System.out.println("insertarRegistrosUsuarioBE");
        ArrayList<UsuarioBE> oListaUsuarioBE = null;
        UsuarioDA instance = new UsuarioDA();
        int expResult = 0;
        int result = instance.insertarRegistrosUsuarioBE(oListaUsuarioBE);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarUsuarioBE method, of class UsuarioDA.
     */
    @Test
    public void testInsertarUsuarioBE() throws Exception {
        System.out.println("insertarUsuarioBE");
        UsuarioBE oUsuarioBE = null;
        UsuarioDA instance = new UsuarioDA();
        int expResult = 0;
        int result = instance.insertarUsuarioBE(oUsuarioBE);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarUsuarioBE method, of class UsuarioDA.
     */
    @Test
    public void testActualizarUsuarioBE() throws Exception {
        System.out.println("actualizarUsuarioBE");
        UsuarioBE oUsuarioBE = null;
        UsuarioDA instance = new UsuarioDA();
        int expResult = 0;
        int result = instance.actualizarUsuarioBE(oUsuarioBE);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarRS method, of class UsuarioDA.
     */
    @Test
    public void testListarRS() throws Exception {
        System.out.println("listarRS");
        String query = "";
        UsuarioDA instance = new UsuarioDA();
        ResultSet expResult = null;
        ResultSet result = instance.listarRS(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUsuarioByUserAndPass method, of class UsuarioDA.
     */
    @Test
    public void testFindUsuarioByUserAndPass() {
        System.out.println("findUsuarioByUserAndPass");
        String usuario = "mabellanedam";
        String contrasenia = "123456";
        UsuarioDA instance = new UsuarioDA();
        UsuarioBE expResult = new UsuarioBE();
        expResult.setIdusuario(2);
        UsuarioBE result = instance.findUsuarioByUserAndPass(usuario, contrasenia);
        assertEquals(expResult.getIdusuario(), result.getIdusuario());
        // TODO review the generated test code and remove the default call to fail.
        if ((expResult.getNombre().equals("Melvin"))
                || (expResult.getIdusuario() != result.getIdusuario())) {
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test of listarPersonas method, of class UsuarioDA.
     */
    @Test
    public void testListarPersonas() {
        System.out.println("listarPersonas");
        UsuarioDA instance = new UsuarioDA();
        List<UsuarioBE> expResult = null;
        List<UsuarioBE> result = instance.listarPersonas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUsuarioById method, of class UsuarioDA.
     */
    @Test
    public void testFindUsuarioById() {
        System.out.println("findUsuarioById");
        int id = 0;
        UsuarioDA instance = new UsuarioDA();
        UsuarioBE expResult = null;
        UsuarioBE result = instance.findUsuarioById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UsuarioDA.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        UsuarioBE oUsuarioBE = null;
        UsuarioDA instance = new UsuarioDA();
        UsuarioBE expResult = null;
        UsuarioBE result = instance.updateUser(oUsuarioBE);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UsuarioDA.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        UsuarioBE oUsuarioBE = null;
        UsuarioDA instance = new UsuarioDA();
        UsuarioBE expResult = null;
        UsuarioBE result = instance.addUser(oUsuarioBE);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
