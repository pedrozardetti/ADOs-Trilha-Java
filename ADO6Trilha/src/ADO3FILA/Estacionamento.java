package ADO3FILA;

import java.util.ArrayDeque;
import java.util.Queue;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Estacionamento {

    private Queue<Carros> garagem = new ArrayDeque<>();
    private LocalTime horaUltimaSaida;

    public void entradaVeiculo(Carros carros) {
        garagem.offer(carros);
        System.out.println("\nO seu veículo foi estacionado com sucesso!");
        System.out.println("Dados do veículo estacionado:");
        System.out.println("------------------------------");
        System.out.println("Tipo de Veículo: " + carros.getTipoCarro());
        System.out.println("Placa: " + carros.getPlaca());
        System.out.println("Ano do Veículo: " + carros.getAno());
    }
    

    public void saidaVeiculo() {
        if (!garagem.isEmpty()) {
            Carros prox = garagem.poll();
            System.out.println("O carro com a placa" + prox.getPlaca() + "foi autorizado para sair!");
            System.out.println("O veículo com a placa" + prox.getPlaca() + "pode prosseguir!");

            horaUltimaSaida = LocalTime.now();
        } else {
            System.out.println("Não há mais carros na fila de espera!");
        }

    }

    public void listarVagas() {
        if (garagem.isEmpty()) {
            System.out.println("Não há mais carros na lista de espera!");
        } else {
            System.out.println("\nLista de carros aguardando:");
            System.out.println("----------------------------------------------");
            System.out.printf("| %-15s | %-10s | %-15s |\n", "Veículo", "Placa", "Ano do veículo");
            System.out.println("----------------------------------------------");
            for (Carros carros : garagem) {
                System.out.printf("| %-15s | %-10s | %-15d |\n", carros.getTipoCarro(), carros.getPlaca(), carros.getAno());
            }
            System.out.println("----------------------------------------------");
        }
    }
    

    public void verTempoEspera() {
        if (horaUltimaSaida != null) {
            
            LocalTime agora = LocalTime.now();
            long minutos = ChronoUnit.MINUTES.between(horaUltimaSaida, agora);
            
            if (minutos >= 3) {
                System.out.println("Você excedeu o tempo máximo na garagem. Chamando próximo veículo da fila!");
            } else {
                System.out.println("Tempo de espera: " + minutos + " minutos.");
            }
        } else {
            System.out.println("Nenhum veículo saiu ainda.");
        }
    }
}
