package Principal;

import Serie.Serie;
import VideoJuego.VideoJuego;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie[] serie = new Serie[5];
		VideoJuego[] videojuegos = new VideoJuego[5];
		
		serie[0] = new Serie("Stranger Things",1,"miedo","steve");
        serie[1] = new Serie("Breaking Bad",2,"suspenso","marc" );
        serie[2] = new Serie("The Witcher",3,"accion","joel" );
        serie[3] = new Serie("The Office",4,"comedia","porte" );
        serie[4] = new Serie("Narcos",5,"suspenso","gabriel" );

        videojuegos[0] = new VideoJuego("The Last of Us", 15, "Aventura", "Naughty Dog");
        videojuegos[1] = new VideoJuego("Cyberpunk 2077", 30, "RPG", "CD Projekt");
        videojuegos[2] = new VideoJuego("Minecraft", 100, "Supervivencia", "Mojang");
        videojuegos[3] = new VideoJuego("GTA V", 50, "Acción", "Rockstar Games");
        videojuegos[4] = new VideoJuego("The Witcher 3", 120, "RPG", "CD Projekt");
		
		
		serie[2].entregar();
		serie[1].entregar();
		serie[3].entregar();
		videojuegos[0].entregar();
		videojuegos[1].entregar();
		videojuegos[3].entregar();
		
		
		//contar los entregados 
		int entregadosSeries = 0;
		int entregadosVideojuegos = 0;
		
		for(Serie s : serie) {
			if(s.isEntregado()) {
				entregadosSeries++;
			}
		}
			
		for(VideoJuego v : videojuegos) {
			if(v.isEntregado()) {
				entregadosVideojuegos++;
			}
		}	
		
        System.out.println("Series Entregas : " + entregadosSeries);
        System.out.println("Los juegos entregados son: "+ entregadosVideojuegos);
        
        
        VideoJuego maxHorasVideojuegos = videojuegos[0];
        for(VideoJuego v : videojuegos) {
        	if(v.getHorasEstimadas() > maxHorasVideojuegos.getHorasEstimadas()) {
        		maxHorasVideojuegos = v;
        	}
        }
        
        Serie maxTemporadaSerie = serie[0];
        for(Serie se : serie) {
        	if(se.getNoTemporada() > maxTemporadaSerie.getNoTemporada()) {
        		maxTemporadaSerie = se;
        	}
        }
        
        
        System.out.println("\nVideo Juegos con mas horas estimdas: ");
        System.out.println(maxHorasVideojuegos.toString());
        
        System.out.println("\nSeries con mas Temporadas: ");
        System.out.println(maxTemporadaSerie.toString());
        
        
		
	}

}
