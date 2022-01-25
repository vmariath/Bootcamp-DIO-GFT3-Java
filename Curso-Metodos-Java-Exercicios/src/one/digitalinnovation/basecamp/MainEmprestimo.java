package one.digitalinnovation.basecamp;

import javax.sound.midi.SysexMessage;

public class MainEmprestimo {

    public static void main(String[] args) {

        System.out.println("Exercicio Calculo de emprestimo com Juros");
        Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(4000, 2);
    }


}
