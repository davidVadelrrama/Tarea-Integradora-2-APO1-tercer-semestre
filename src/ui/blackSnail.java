package ui;
import java.util.Scanner;

import model.ChannelBlackSnail;
import model.Subscriber;



public class blackSnail {
    
    static Scanner sc = new Scanner(System.in);
    public Subscriber subscriber;
	public static ChannelBlackSnail channel;
	static String nit = "A00372316";
	static String webAddress = "www.icesi.edu.co";
	static String webSite = "BlackSnail Streaming";
    public static void main(String [] args){
	System.out.println("Black Snails info is" + 
			"\n nit: " + nit +  
			"\n web address: " + webAddress + 
			"\n web site: " + webSite);
	channel = new ChannelBlackSnail(nit, webAddress, webSite);
		System.out.println("-----Choose a menu------" +
				"\n 1. Subscribers menu" +
				"\n 2. Products menu");
        int select = sc.nextInt();
		System.out.println(select);

		switch (select){
			case 1:
				subMenu();
				break;
			case 2:
				prodMenu();
				break;
		}






    }

    public static void subMenu(){
		int option = 0;
		do {
			System.out.println("-------SUB_MENU------" +
					"\n 1. Add new subscriber" +
					"\n 2. Disactivate subscriber" +
					"\n 3. Subscribers list by type" +
					"\n 4. Find the underage subscriber that has the most hours willing to consume" +
					"\n 0. To exit");

			option = sc.nextInt();
			switchSubMenu(option);
		}while(option != 0);
	}

	public static void prodMenu(){
    	int prodOption = 0;
    	do{
			System.out.println("-------PRODUCT_MENU------" +
					"\n 1. Add new product" +
					"\n 2. search by tittle" +
					"\n 3. Add new season" +
					"\n 4. List of movies by genre" +
					"\n 5. List of all series and show last season info" +
					"\n 0. To exit");
			prodOption = sc.nextInt();
			switchProdMenu(prodOption);
		}while(prodOption != 0);
	}

	public static void switchProdMenu(int prodOption){
    	switch (prodOption){
			case 1:
				System.out.println("-------------What do you want to add-----------" +
				        "\n 1. Add series" +
                        "\n 2. Add movie");
				int prod = sc.nextInt();
				addProduct(prod);
				break;
			case 2:
				searchProduct();
				break;
			case 3:
				addSeason();
				break;
			case 4:
				listOfMovies();
				break;
			case 5:
				listSeries();
				break;
		}
	}
    /* 
    * Descripcion: Es el menu de opciones del usuario </br>
    * @param option int, es la seleccion de lo que quiere hacer el usuario
    */
    public static void switchSubMenu(int option){
        switch (option){

            case 1:
                addSub();
                
                break;

            case 2:
				disactivateSub();
                break;
                
            case 3: 
            	channel.count();
            	break;
            	
            case 4:
            	channel.minor();
            	break;



        }
    }
	
    /* 
     * Descripci???n: crea un objeto subscriptor</br> 
     */
	public static void addSub(){
	 System.out.println("-------Add new subscriber-------" +
                        "\n 1. Enter subscriber id");
                String newId = sc.nextLine();
				newId = sc.nextLine();
                System.out.println("2. Enter subscriber???s age");
                int newAge =sc.nextInt();
				newAge =sc.nextInt();
                System.out.println("3. Enter subscriber name");
                String newName = sc.nextLine();
				newName = sc.nextLine();
				System.out.println("4. Hours subscriber is willing to consume black snail");
				int newHours = sc.nextInt();
				newHours = sc.nextInt();
				System.out.println("5.???What type of subscriber is?" +
                        "\n 1. for NORMAL" +
                        "\n 2. for ORO" +
                        "\n 3. for PLATINO" +
                        "\n 4. for DAIMANTE");
                int tipon = sc.nextInt();
                System.out.println("Subscriber???s new status is Active");
				
				channel.addSub(newId, newAge, newName, newHours, tipon);
				
              
	}
	/* 
	* Descripci???n: cambia el status del objeto subscriptor a incativo y el tipo a normal </br> 
	*/
	public static void disactivateSub(){
		
		System.out.println("Ingrese el id del suscriptor a desactivar");
		String newId = sc.nextLine();
		newId = sc.nextLine();
		channel.disactivateSub(newId);
		
	}
	
	
	/*
	*
	* Descripcion: a??ade un producto nuevo ya sea serie o pelicula </br>
	* @param : prod int, es una variable que selecciona si el usuario ingresa una serie o una pelicula
	*
	*/
	public static void addProduct(int prod){
		switch(prod){
			case 1:
				System.out.println("---------Add new series---------");
				System.out.println("Series Name");
				String seriesName = sc.nextLine();
				seriesName = sc.nextLine();	
				System.out.println("Series director");
				String seriesDirector = sc.nextLine();				
				System.out.println("Series sinopsis");
				String seriesSinopsis = sc.nextLine();				
				System.out.println("Series trailer link");
				String seriesTrailer = sc.nextLine();				
				System.out.println("main characters");
				String mainCh = sc.nextLine();				
				System.out.println("1st season of the series");
				int seasonNum = 1;
				System.out.println("programmed episodes");
				int programmedEpisodes = 0;
				programmedEpisodes = sc.nextInt();
				System.out.println("released episodes");
				int releasedEpisodes = 0;
				releasedEpisodes = sc.nextInt();
				System.out.println("Season release date");
				System.out.println("Day");
				int sDay = sc.nextInt();				
				System.out.println("Month");
				int sMonth = sc.nextInt();				
				System.out.println("Year");
				int sYear = sc.nextInt();				
				System.out.println("Is this series censored?"+
						"\n 1. Yes" +
						"\n 2. No");
				int censored = sc.nextInt();				
				sc.nextLine();
				String motive = "";
				if(censored == 1){
					System.out.println("why is it censored?");
					motive = sc.nextLine();
				}
				channel.addSeries(seriesName, seriesDirector, seriesSinopsis, seriesTrailer, mainCh, seasonNum, programmedEpisodes, releasedEpisodes, sDay, sMonth, sYear, censored, motive);
			break;
			case 2:
				System.out.println("---------Add new movie---------");
				System.out.println("Movie name");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.println("Movie director");
				String movieDirector = sc.nextLine();
				System.out.println("Movie sinopsis");
				String movieSinopsis = sc.nextLine();
				System.out.println("Movie trailer link");
				String movieTrailer = sc.nextLine();
				System.out.println("Movie release date");
				System.out.println("Day");
				int mDay = sc.nextInt();
				System.out.println("Month");
				int mMonth = sc.nextInt();
				System.out.println("Year");
				int mYear = sc.nextInt();
				System.out.println("What is the pegi of this movie");
				int mPegi = sc.nextInt();
				System.out.println("Movie producer");
				String mProducer = sc.nextLine();
				mProducer = sc.nextLine();
				System.out.println("Movie genre" +
						"\n 1. Horror" +
						"\n 2. Romance" +
						"\n 3. Comedy" +
						"\n 4. Action" +
						"\n 5. Suspense");
				int genren = sc.nextInt();
						channel.addMovie(name, movieDirector, movieSinopsis, movieTrailer, mDay, mMonth, mYear, mPegi, mProducer, genren);

			break;
		}
	}
	/*
	 * Descripci???n: El usuario ingresa un nombre y el metodo lo busca y despliega la info del objeto buscado </br>
	 */
	public static void searchProduct(){
		System.out.println("search:");
		String search = sc.nextLine();
		search = sc.nextLine();
		System.out.println(channel.search(search));
	}


	/*
	 * Descripci???n: a??ade una nueva temporada al arreglo seasons creado en el objeto serie si y solo si el objeto serie ya esta creado </br>
	 */
	public static void addSeason(){
		System.out.println("-----Add new season-----");
		System.out.println("Series name");
		String name =sc.nextLine();
		name =sc.nextLine();
		System.out.println("Season number");
		int seasonNum = 0;
		seasonNum = sc.nextInt();
		System.out.println("programmed episodes");
		int programmedEpisodes = 0;
		programmedEpisodes = sc.nextInt();
		System.out.println("released episodes");
		int releasedEpisodes = 0;
		releasedEpisodes = sc.nextInt();
		System.out.println("-------release date-------");
		System.out.println("day");
		int sDay = sc.nextInt();
		System.out.println("month");
		int sMonth = sc.nextInt();
		System.out.println("year");
		int sYear= sc.nextInt();
		System.out.println(channel.addSeason(name, seasonNum, programmedEpisodes, releasedEpisodes, sDay, sMonth, sYear));

	}


	/*
	 * Descripci???n: lista todas la peliculas que coincidan con el genero ingresado por el usuario</br>
	 */
	public static void listOfMovies(){
		System.out.println("-------Enter movie genre---------" +
				"\n 1. Action" +
				"\n 2. Comedy" +
				"\n 3. Romance" +
				"\n 4. Horror" +
				"\n 5. Suspense");
		int genre = sc.nextInt();
		System.out.println(channel.listOfMoviesByGenre(genre));
	}

	public static void listSeries(){
		System.out.println(channel.listSeries());

	}


	
	
	





}
