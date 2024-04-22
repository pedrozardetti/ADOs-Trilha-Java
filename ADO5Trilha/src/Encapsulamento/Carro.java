package Encapsulamento;

public class Carro {

  public String marca;
  String modelo;
  int numPassageiros;
  double capCombustivel;
  private double consumoCombustivel;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getNumPassageiros() {
    return numPassageiros;
  }

  public void setNumPassageiros(int numPassageiros) {
    this.numPassageiros = numPassageiros;
  }

  public double getCapCombustivel() {
    return capCombustivel;
  }

  public void setCapCombustivel(double capCombustivel) {
    this.capCombustivel = capCombustivel;
  }

  public double getConsumoCombustivel() {
    return consumoCombustivel;
  }

  public void setConsumoCombustivel(double consumoCombustivel) {
    this.consumoCombustivel = consumoCombustivel;
  }

}
