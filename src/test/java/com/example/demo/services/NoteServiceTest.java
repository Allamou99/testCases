package com.example.demo.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import org.mockito.Mockito;

class NoteServiceTest {
    //on moque etudiantsService pour ne pas instancier la classe pendant la phase des tests , ainsi on economise nos ressources
    private EtudiantsService etudiantsService = Mockito.mock(EtudiantsService.class);

    NoteService noteService;
    //avant chaque test, on instancie noteService
    @BeforeEach
    public void init(){
        this.noteService = new NoteService(etudiantsService);
    }
    //on test si la note est supérieur à 19, le resultat doit etre : tres bien
    @Test
    void mention() {
        assertThat(this.noteService.mention(19)).isEqualTo("Tres bien");
    }
    //on verifie si le tableau contient Ayoub ou non
    @Test
    void elements(){
        assertThat(this.noteService.listEtudiant()).contains("Ayoub");
    }
}