/**
 * Lê e escreve no arquivo config
 * @author Hover-Inc
 */
package core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RWConfig {
    public RWConfig(){
        if(!arquivo.exists()){
            try {
                arquivo.createNewFile();
                FileWriter fw = new FileWriter(arquivo);
                BufferedWriter bw = new BufferedWriter(fw);
            
                bw.write(Criptography.enc("User"));
                bw.newLine();
                bw.write(Criptography.enc("senha1234"));
                bw.newLine();
                bw.write(Criptography.enc("localhost"));
                bw.newLine();
                bw.write(Criptography.enc("3306"));
                
                bw.close();
                fw.close();
                this.statusc = true;
            } catch (IOException ex) {
                Logger.getLogger(RWConfig.class.getName()).log(Level.SEVERE, null, ex);
                this.statusc = false;
            }
        }else{
            this.statusc = true;
        }
    }
    
    public String[] read(){
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            try {
                while(br.ready()){
                    data[i] = Criptography.dec(br.readLine());
                    i++;
                }
            } catch (IOException ex) {
                Logger.getLogger(RWConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(RWConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(RWConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.statusr = true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RWConfig.class.getName()).log(Level.SEVERE, null, ex);
            this.statusr = false;
        }
        return data;
    }
    
    public void write(String[] inf){
        try {
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int j=0;j<4;j++){
                bw.write(Criptography.enc(inf[j]));
                bw.newLine();
            }
            bw.close();
            fw.close();
            this.statusw = true;
        } catch (IOException ex) {
            Logger.getLogger(RWConfig.class.getName()).log(Level.SEVERE, null, ex);
            this.statusw = false;
        }
    }
    
    public boolean getStatusc(){
        return statusc;
    }
    
    public boolean getStatusr(){
        return statusr;
    }
    
    public boolean getStatusw(){
        return statusw;
    }
    
    private File arquivo = new File("config.ini");
    private String[] data = new String[4];
    private boolean statusc;
    private boolean statusr;
    private boolean statusw;
    
}
