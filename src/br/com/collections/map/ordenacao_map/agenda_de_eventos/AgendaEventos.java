package br.com.collections.map.ordenacao_map.agenda_de_eventos;

import br.com.collections.map.ordenacao_map.agenda_de_eventos.exception.EventoNaoEncontradoException;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private final Map<LocalDate, Evento> eventosMap;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy",
            new Locale("pt", "BR"));

    public AgendaEventos() {
        this.eventosMap = new TreeMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String atracao) {
        eventosMap.put(data, new Evento(nomeEvento, atracao));
    }

    public void exibirAgenda() {
        eventosMap.forEach((date, event) -> System.out.printf("date: %s -> event{nome: %s, atração: %s}%n",
                date.format(formatter), event.getNome(), event.getAtracao()));
    }

    public Evento obterProximoEvento() {
        return eventosMap.entrySet().stream()
                .filter(entry -> entry.getKey().isAfter(LocalDate.now()))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElseThrow(EventoNaoEncontradoException::new);
    }


    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, Month.JUNE, 05), "Show de Música",
                "Drake");
        agenda.adicionarEvento(LocalDate.now(), "Aula de Dança", "Professora Aline");
        agenda.adicionarEvento(LocalDate.now().plusDays(1), "Campeonato de fifa",
                "Julio Cocielo");

        agenda.exibirAgenda();

        System.out.println("Data hoje: " + LocalDate.now().format(formatter) + ", Proximo evento: " +
                agenda.obterProximoEvento());


    }




}
