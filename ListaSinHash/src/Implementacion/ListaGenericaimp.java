package Implementacion;

import java.util.ArrayList;
import java.util.List;
import Principal.Metodos;

public class ListaGenericaimp implements Metodos {
    
    
    protected List<Object[]> lisG = new ArrayList<Object[]>();

    @Override
    public void guardar(Object key, Object value) {
        lisG.add(new Object[] { key, value });
    }

    @Override
    public void editar(Object key, Object value) {
        
        for (Object[] par : lisG) {
            if (par[0].equals(key)) {
                par[1] = value;  
                return;
            }
        }
    }

    @Override
    public void eliminar(Object key) {
        lisG.removeIf(par -> par[0].equals(key));
    }

    @Override
    public Object buscar(Object key) {
        for (Object[] par : lisG) {
            if (par[0].equals(key)) {
                return par[1];  
            }
        }
        return null; 
    }

    @Override
    public void mostrar() {

        for (Object[] par : lisG) {
            System.out.println("Clave: " + par[0] + ", Valor: " + par[1]);
        }
    }
}