/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.LinkedList;
import java.util.List;

public interface Icrud {
    public abstract void incluir(Contato objeto)throws Exception;
    public abstract void excluir(int id)throws Exception;
    public abstract void alterar(Contato objeto)throws Exception;
    public LinkedList<Contato> listar()throws Exception;
}