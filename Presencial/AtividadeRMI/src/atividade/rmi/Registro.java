package atividade.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Registro extends Remote{
    
    public Resposta insert(Aluno aluno) throws RemoteException;
}