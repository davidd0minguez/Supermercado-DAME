/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja.registradora;

import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class Caja_principalTest {
    
    public Caja_principalTest() {
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
    @Test
    public void ElValorDeLaCompraNoDaNegativo() {
        String producto,itemfactu;
        int jugo=0,cafe=0,leche=0,pan=0,cereal=0,compra=0,tomate=0,manzana=0,lechuga=0,naranja=0,maiz=0,aceite=0,coca=0,arroz=0,ketchup=0,queso=0,cepillo=0,copitos=0,alcohol=0,colgate=0,papel=0;
        jugo = 1;
        cafe = 2;
        pan = 3;
        compra = (jugo*50)+(cafe*72)+(leche*30)+(pan*90)+(cereal*101)+(tomate*80)+(manzana*72)+(lechuga*76)+(naranja*90)+(maiz*52)+(aceite*110)+(coca*86)+(arroz*15)+(ketchup*120)+(queso*150)+(cepillo*100)+(copitos*210)+(alcohol*300)+(colgate*102)+(papel*400);
        if(compra < 0){ fail("The test case is a prototype."); }
     }

    
    @Test
    public void SiNoSeDigitanProductosLuegoSeBorranTodosElValorDeLaCompraEsCero() {
        String producto,itemfactu;
        int jugo=0,cafe=0,leche=0,pan=0,cereal=0,compra=0,tomate=0,manzana=0,lechuga=0,naranja=0,maiz=0,aceite=0,coca=0,arroz=0,ketchup=0,queso=0,cepillo=0,copitos=0,alcohol=0,colgate=0,papel=0;
        compra = (jugo*50)+(cafe*72)+(leche*30)+(pan*90)+(cereal*101)+(tomate*80)+(manzana*72)+(lechuga*76)+(naranja*90)+(maiz*52)+(aceite*110)+(coca*86)+(arroz*15)+(ketchup*120)+(queso*150)+(cepillo*100)+(copitos*210)+(alcohol*300)+(colgate*102)+(papel*400);
        if(compra != 0){ fail("The test case is a prototype."); }

}
    @Test
    public void AlDigitarProductoQueNoEsteEstablecidoNoSeDejaIngresar() {
        //RECURRIR A MAQUINA
        //RECURRIR A MAQUINA
        //RECURRIR A MAQUINA
        //RECURRIR A MAQUINA
        //RECURRIR A MAQUINA
        int compra = 0;
        if(compra != 0){ fail("The test case is a prototype.");}
    
}
    
}
