package br.com.fiap.mayWay.model.testeApp;

import br.com.fiap.mayWay.model.Teste;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {


    public static void main(String[] args) {
        Teste game = new Teste(
                0L,
                "Batman Arkam City",
                199.99,
                "Playstation",
                false,
                LocalDate.of(1992, 7, 1)
        );

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Games");
        EntityManager em = emf.createEntityManager();
    }
}
