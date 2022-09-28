/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package MenuResponsivo;

/**
 *
 * @author Leonardo
 */
public class Principal {

    public static void main(String[] args) {
        Carregar JanCarregar = new Carregar();
        
        Entrar JanLogin = new Entrar();
        
        JanLogin.setVisible(false);
        
        JanCarregar.setVisible(true);
        
        try{
            for(int i = 0; i <= 100; i++){
                Thread.sleep(60);
                JanCarregar.BarraCarrregando.setValue(i);
            }
        }
        catch(Exception e){
            System.out.println("Erro: " + e);
        }
        JanCarregar.dispose();
        
        
        JanLogin.setVisible(true);
    }
}
