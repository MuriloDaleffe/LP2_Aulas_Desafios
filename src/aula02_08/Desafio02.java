package aula02_08;

import java.time.*;
import java.time.temporal.ChronoUnit;

// calcule a diferença entre fusohorarios diferentes (diferenca de tempo em hrs e segundos)
// fuso do brasil e outro lugar na europa

public class Desafio02 {

    public static void main(String[] args) {

//		LocalTime horaAgora = LocalTime.now();
//
//		LocalDate dataHoje = LocalDate.now();
//
//		LocalDateTime dataHoraAgora = LocalDateTime.now();
//
//		Instant momentoAgora = Instant.now();
//
//		ZonedDateTime dataHoraZonaAgora = ZonedDateTime.now();
//
//		ZonedDateTime horaSP = ZonedDateTime.of(dataHoraAgora, ZoneId.of("America/Sao_Paulo"));

        LocalDateTime dataHoraMS = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Manaus"));
        LocalDateTime dataHoraParis = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Paris"));
        LocalTime ms = dataHoraMS.toLocalTime();
        LocalTime pa = dataHoraParis.toLocalTime();

        long intervaloHr = ChronoUnit.HOURS.between(pa, ms);
        long intervaloSec = ChronoUnit.SECONDS.between(ms, pa);


        System.out.println(dataHoraMS);
        System.out.println(dataHoraParis);

        System.out.println(ms);
        System.out.println(pa);


        System.out.println("A diferença do fuso entre Paris/FR e Três Lagoas/BR é de "
                + intervaloHr + " horas");

        System.out.println("A diferença do fuso entre Três Lagoas/BR e Paris/FR é de "
                + intervaloSec + " segundos");

    }
}