package com.mx.Telefonos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Implementacion implements Metodos  {

	
	
	HashMap<Integer, Telefonos> has = new HashMap<Integer, Telefonos>();
	
	
	@Override
	public void guardar(Telefonos telefono) {
		// TODO Auto-generated method stub
		has.put(telefono.getClave(),telefono);
	
	}

	@Override
	public Telefonos buscar(Telefonos telefono) {
		// TODO Auto-generated method stub
		return has.get(telefono.getClave());
	}

	@Override
	public void editar(Telefonos telefono) {
		// TODO Auto-generated method stub
		has.replace(telefono.getClave(), telefono);
	}

	@Override
	public void eliminar(Telefonos telefono) {
		// TODO Auto-generated method stub
		has.remove(telefono.getClave());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		List<Telefonos> list = new ArrayList<>(has.values());
		
		list.sort((t1,t2) -> {
			int colorCompare = t1.getColor().compareTo(t2.getColor());
			if(colorCompare != 0) {
				return colorCompare;
			}
			return Double.compare(t2.getPrecio(), t1.getPrecio());
		});
		
		String currentColor = "";
		System.out.println("LOS TELEFONOS SE ORDENARON POR COLOR HURRRAAAAAA");
		for(Telefonos telefono : list) {
			
			 if (!telefono.getColor().equals(currentColor)) {
	                currentColor = telefono.getColor();
	                System.out.println("Color: " + currentColor);
	            }
	            System.out.println(telefono);
	            
	        }
	    }
	
	public void conar() {
		System.out.println("Contiene " + has.size() + "telefonos" );
	}

}
