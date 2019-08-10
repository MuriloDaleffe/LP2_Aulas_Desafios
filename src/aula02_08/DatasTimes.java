package aula02_08;

import java.time.Duration;
import java.time.Instant;

public class DatasTimes {

    public static void main(String[] args) throws InterruptedException {

        Instant inicio = Instant.now();

        Thread.sleep(1000);

        Instant fim = Instant.now();

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração em ns: " + duracao.toNanos());
        System.out.println("Duração em min: " + duracao.toMinutes());
        System.out.println("Duração em hrs: " + duracao.toHours());
        System.out.println("Duração em ms: " + duracao.toMillis());
        System.out.println("Duração em dias: " + duracao.toDays());

    }

}
