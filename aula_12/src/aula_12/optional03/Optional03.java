package aula_12.optional03;

import aula_12.optional03.model.Colaborador;

import java.util.Optional;

public class Optional03 {

    public static void main(String[] args) {

        Colaborador c1 = new Colaborador(1L, "James Bond", 1000.0f);

        Optional<Colaborador> colaboradorOptional = Optional.of(c1);

        colaboradorOptional.map(resposta -> resposta.getNome())
                .filter(colaboradorNome -> colaboradorNome.startsWith("J"))
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado!"));

        System.out.println("\nNome do Colaborador: " + colaboradorOptional.get().getNome());

    }
}
