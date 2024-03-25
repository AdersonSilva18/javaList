package com.company;

import com.company.model.Fruta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fruta> frutasList = new ArrayList<Fruta>();

        frutasList.add(new Fruta("Banana"));
        frutasList.add(new Fruta("Maça"));
        frutasList.add(new Fruta("Lixia"));
        frutasList.add(new Fruta("kiwi"));
        frutasList.add(new Fruta("Manga"));

        System.out.println("Fruta 2 " + frutasList.get(2).getNome());

        frutasList.get(1).setNome("Pera");

        frutasList.remove(3);

        System.out.println("Tamanho " + frutasList.size());

        if (frutasList.isEmpty()) {
            System.out.println("Lista vazia");
        }

        if (frutasList.stream().anyMatch(f -> f.getNome().equals("Banana"))) {
            System.out.println("Tem banana na lista");
        }

        frutasList.sort(new Comparator<Fruta>() {
            public int compare(Fruta f1, Fruta f2) {
                return f1.getNome().compareTo(f2.getNome());
            }
        });

        frutasList.forEach(fruta -> {
            if (fruta.getNome().contains("M")) {
                System.out.println("Fruta com M: "+ fruta.getNome());
            }
        });

        frutasList.clear();
    }
}
