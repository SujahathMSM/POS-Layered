/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao;

import java.util.ArrayList;

/**
 *
 * @author sujah
 * @param <T>
 * @param <ID>
 */
public interface CrudDao<T, ID> extends SuperDao{
    boolean add(T t) throws Exception;
    boolean Update(T t) throws Exception;
    boolean delete(ID id) throws Exception;
    Object get(ID id) throws Exception;
    ArrayList<Object> getAll() throws Exception;   
}
