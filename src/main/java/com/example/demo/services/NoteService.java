package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NoteService {
    @Autowired
    private EtudiantsService etudiantsService;
    public NoteService(EtudiantsService etudiantsService){
        this.etudiantsService = etudiantsService;
    }
    public String mention(float note){
        if(note>=18){
            return "Tres bien";
        }
        else if(note<18 && note>=14){
            return "Bien";
        }
        else if(note<14 && note>=12){
            return "A.Bien";
        }
        else{
            return "Passable";
        }
    }

    public List<String> listEtudiant(){
        this.etudiantsService.listEtudiant();
        return Arrays.asList("Ayoub","Nihal");

    }

}
