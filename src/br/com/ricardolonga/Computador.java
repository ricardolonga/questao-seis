package br.com.ricardolonga;

import java.util.List;

/**
 * Created by longa on 23/02/15.
 */
public class Computador {
    
    private Cpu cpu;
    
    private List<HardDisk> hds;
    
    private List<Memoria> memorias;
    
    private PlacaMae placaMae;
    
    private PlacaVideo placaVideo;
    
    public double getPrecoCusto() {
        double preco = 0;
        
        preco += cpu.getPrecoCusto();
        preco += placaMae.getPrecoCusto();
        preco += placaVideo.getPrecoCusto();
        
        for(HardDisk hd : hds)
            preco += hd.getPrecoCusto();

        for(Memoria memoria : memorias)
            preco += memoria.getPrecoCusto();
        
        return preco;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setHds(List<HardDisk> hds) {
        this.hds = hds;
    }

    public void setMemorias(List<Memoria> memorias) {
        this.memorias = memorias;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public void setPlacaVideo(PlacaVideo placaVideo) {
        this.placaVideo = placaVideo;
    }
    
}
