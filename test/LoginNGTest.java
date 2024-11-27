/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author S
 */
public class LoginNGTest {
    
    public LoginNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of validation method, of class Login.
     */
    @Test
    public void testValidation() {
        System.out.println("validation");
        String username = "abc";
        String password = "123";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.validation(username, password);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation2() {
        System.out.println("validation");
        String username = "";
        String password = "123";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.validation(username, password);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation3() {
        System.out.println("validation");
        String username = "abc";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.validation(username, password);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation4() {
        System.out.println("validation");
        String username = "";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.validation(username, password);
        assertEquals(result, expResult);
    }
    /**
     * Test of InsertIntoSql method, of class Login.
     */
    @Test
    public void testverificationt() {
        System.out.println("verification");
        String username = "abc";
        String password = "123";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.InsertIntoSql(username, password);
        assertEquals(result, expResult);
    }
    @Test
    public void testverificationt2() {
        System.out.println("verification");
        String username = "abc";
        String password = "xyz";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.InsertIntoSql(username, password);
        assertEquals(result, expResult);
    }
    @Test
    public void testverificationt3() {
        System.out.println("verification");
        String username = "xyz";
        String password = "123";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.InsertIntoSql(username, password);
        assertEquals(result, expResult);
    }
    @Test
    public void testverificationt4() {
        System.out.println("verification");
        String username = "xyz";
        String password = "xyz";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.InsertIntoSql(username, password);
        assertEquals(result, expResult);
    }
    
    /**
     * Test of main method, of class Login.
     */
    
    
}
