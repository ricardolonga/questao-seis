package br.com.ricardolonga;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {
        Computador computador = new Computador();
        
        Cpu cpu = new Cpu();
        Memoria memoria1 = new Memoria();
        Memoria memoria2 = new Memoria();
        HardDisk hardDisk1 = new HardDisk();
        HardDisk hardDisk2 = new HardDisk();
        PlacaMae placaMae = new PlacaMae();
        PlacaVideo placaVideo = new PlacaVideo();
        
        computador.setCpu(cpu);
        computador.setPlacaMae(placaMae);
        computador.setPlacaVideo(placaVideo);
        computador.setMemorias(Arrays.asList(memoria1, memoria2));
        computador.setHds(Arrays.asList(hardDisk1, hardDisk2));

        System.out.println("Preço de custo: " + computador.getPrecoCusto());
    }

}


