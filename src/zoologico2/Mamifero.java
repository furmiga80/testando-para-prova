/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico2;

public class Mamifero extends Animal {
   private String ambiente;

    public Mamifero(String nome, String comprimento, int patas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.ambiente = "terrestre";
    }

    public String getAmbiente() {
        return ambiente;
    }
   
   
}
