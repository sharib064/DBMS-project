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
public class AddStudentNGTest {
    
    public AddStudentNGTest() {
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
     * Test of validation method, of class AddStudent.
     */
    @Test
    public void testValidation() {
        System.out.println("validation");
        String n = "";
        String fn = "";
        String nic = "";
        String b = "";
        String d = "";
        String roll = "";
        String pass = "";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation2() {
        System.out.println("validation");
        String n = "sharib";
        String fn = "";
        String nic = "";
        String b = "";
        String d = "";
        String roll = "";
        String pass = "";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation3() {
        System.out.println("validation");
        String n = "sharib";
        String fn = "sharib";
        String nic = "";
        String b = "";
        String d = "";
        String roll = "";
        String pass = "";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation4() {
        System.out.println("validation");
        String n = "sharib";
        String fn = "sharib";
        String nic = "1234";
        String b = "";
        String d = "";
        String roll = "";
        String pass = "";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation5() {
        System.out.println("validation");
        String n = "sharib";
        String fn = "sharib";
        String nic = "1234";
        String b = "23";
        String d = "";
        String roll = "";
        String pass = "";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation6() {
        System.out.println("validation");
        String n = "sharib";
        String fn = "sharib";
        String nic = "1234";
        String b = "23";
        String d = "se";
        String roll = "";
        String pass = "";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation7() {
        System.out.println("validation");
        String n = "sharib";
        String fn = "sharib";
        String nic = "1234";
        String b = "23";
        String d = "se";
        String roll = "2896";
        String pass = "";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }
    @Test
    public void testValidation8() {
        System.out.println("validation");
        String n = "sharib";
        String fn = "sharib";
        String nic = "1234";
        String b = "23";
        String d = "se";
        String roll = "2896";
        String pass = "1234";
        AddStudent instance = new AddStudent();
        boolean expResult = true;
        boolean result = instance.validation(n, fn, nic, b, d, roll, pass);
        assertEquals(result, expResult);
    }

    /**
     * Test of repeat method, of class AddStudent.
     */
    @Test
    public void testRepeat() {
        System.out.println("repeat");
        String name = "abc";
        String nic = "1234";
        String roll = "abc";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.repeat(name, nic);
        assertEquals(result, expResult);
    }
    @Test
    public void testRepeat2() {
        System.out.println("repeat");
        String name = "abc";
        String nic = "1234567";
        String roll = "abc";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.repeat(name, nic);
        assertEquals(result, expResult);
    }
    @Test
    public void testRepeat3() {
        System.out.println("repeat");
        String name = "abc";
        String nic = "1234567";
        String roll = "abc12";
        AddStudent instance = new AddStudent();
        boolean expResult = false;
        boolean result = instance.repeat(name, nic);
        assertEquals(result, expResult);
    }
    @Test
    public void testRepeat4() {
        System.out.println("repeat");
        String name = "abcxyz";
        String nic = "1234567";
        String roll = "abc12";
        AddStudent instance = new AddStudent();
        boolean expResult = true;
        boolean result = instance.repeat(name, nic);
        assertEquals(result, expResult);
    }
    /**
     * Test of InsertIntoSql method, of class AddStudent.
     */
    

    /**
     * Test of main method, of class AddStudent.
     */
    
    
}
