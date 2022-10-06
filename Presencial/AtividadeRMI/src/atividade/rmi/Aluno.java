package atividade.rmi;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class Aluno implements Serializable{
    private String nome;
    private String ra;
    private InetAddress addr;
    private Date date;
    
    public Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
        try {
            addr = InetAddress.getLocalHost();
            date = new Date(System.currentTimeMillis());

        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public InetAddress getAddr() {
        return addr;
    }

    public Date getDate() {
        return date;
    }
}