/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico2;



/**
 *
 * @author vladimir
 */
public class testaZoo {
    
    public static void main(String []args){
        
        Animal camelo = new Animal
        ("camelo","150 cm", 4, "amarelo","terra", 2.0 );
        
        System.out.println("ZOOLOGICO");
        System.out.println("---------------------");
        System.out.println("animal : " + camelo.getNome());
        System.out.println("comprimento : " + camelo.getComprimento());
        System.out.println("patas : " + camelo.getPatas());
        System.out.println("cor : " + camelo.getCor());
        System.out.println("ambiente : " + camelo.getAmbiente());
        System.out.println("velocidade : " + camelo.getVelocidade());
        
        Animal tubarao = new Animal
        ("tubarao", "300 cm", 0, "cinza","agua", 1.5);
        System.out.println("---------------------");
        System.out.println("animal : " + tubarao.getNome());
        System.out.println("comprimento : " + tubarao.getComprimento());
        System.out.println("patas : " + tubarao.getPatas());
        System.out.println("cor : " + tubarao.getCor());
        System.out.println("ambiente : " + tubarao.getAmbiente());
        System.out.println("velocidade : " + tubarao.getVelocidade());
        
        Animal urso = new Animal
        ("urso", "180 cm", 4, "vermelha", "terra", 0.5);
        
        System.out.println("---------------------");
        System.out.println("animal : " + urso.getNome());
        System.out.println("comprimento : " + urso.getComprimento());
        System.out.println("patas : " + urso.getPatas());
        System.out.println("cor : " + urso.getCor());
        System.out.println("ambiente : " + urso.getAmbiente());
        System.out.println("velocidade : " + urso.getVelocidade());
    }
    
}
