package model;
import model.Status;
import model.Subscriber;
import model.Type;

public class ChannelBlackSnail{

	private String nit;
	private String webAddress;
	private String webSite;
	public Subscriber[] subscriber;
	public Product[] products;
	public Season[] seasons;
	
	//constructor
	public ChannelBlackSnail(String nit, String webAddress, String webSite){
		
		this.nit = nit;
		this.webAddress = webAddress;
		this.webSite = webSite;
		subscriber = new Subscriber[50];
		products = new Product[85];
		seasons = new Season[6];
	}
	
	
	
	/*
	 * 
	 *	@param newId
	 *	@param newAge
	 *	@param newName
	 * 	@param tipon
	 * 
	 */
	public void addSub(String newId, int newAge, String newName, int newHours, int tipon){
		
		Type tipo = Type.NORMAL;
                switch (tipon){
                    case 1:
                        tipo = Type.NORMAL;
                        break;
                    case 2:
                        tipo = Type.GOLD;
                        break;
                    case 3:
                        tipo = Type.PLATINUM;
                        break;
                    case 4:
                        tipo = Type.DIAMOND;
                        break;
                }
		Status newStatus = Status.ACTIVE;
        for (int i = 0; i < subscriber.length; i++) {
			if(subscriber[i] == null){
				Subscriber sub = new Subscriber(newId, newAge, newName, newHours, newStatus, tipo);
			}
			
        }
		
	}
	
	/*
	 *
	 * 	@param newId
	 * 
	 */
	public void disactivateSub(String newId){
		
		for(int i = 0; i < subscriber.length; i++){
			
			if(newId.equals(subscriber[i].getId()) && subscriber[i] != null){
				Status status = Status.INACTIVE;
				Type type = Type.NORMAL;
			}
		}
		
	}
	
	public String count(){
		String types = "";
		int normal = 0;
		int gold = 0;
		int plat = 0;
		int diamond = 0;
		for(int i =0; i < subscriber.length; i++){
			
			if(subscriber[i].getType().equals(Type.NORMAL)) {
				normal ++;
			}else {
				if(subscriber[i].getType().equals(Type.GOLD)) {
					gold ++;
				}else {
					if(subscriber[i].getType().equals(Type.PLATINUM)) {
						plat ++;
					}else {
						if(subscriber[i].getType().equals(Type.DIAMOND)) {
							diamond ++;
						}
					}
				}
			}
		}
		
		types = "Normal: " + normal + "\nGold: " + gold + "\nPlatinum: " + plat + "\nDiamond: " + diamond;
				
				
				
		
		return types;
	}
	
	public String minor() {
		
		String menor = "";
		int horas = 0;
		int pos = 0;
		
		for(int i = 0; i < subscriber.length; i++) {
			
			if(subscriber[i] != null) {
				if(subscriber[i].getAge() < 18) {
					if(horas < subscriber[i].getHoras()) {
						horas = subscriber[i].getHoras();
						pos = i;
					}
					
				}
			}else {
				return "There are no subscribers";
			}
		}
		
		menor = "The underage subscriber thats willing to consume more ahours is" + subscriber[pos].getCompleteName() + "and he is willing to consume" + subscriber[pos].getHoras();
		
		return menor;
	}

	public void addSeries(String seriesName, String seriesDirector, String seriesSinopsis, String seriesTrailer,String mainCh, int seasonNum, int programmedEpisodes, int releasedEpisodes, int sDay, int sMonth, int sYear, int censored, String motive){

		Censored isCensored = Censored.E;
		switch (censored){
			case 1:
				isCensored = Censored.YES;
				break;
			case 2:
				isCensored = Censored.NO;
				break;
		}
		Date launchDate = new Date(sDay,sMonth,sYear);
			Season season = new Season(seasonNum, programmedEpisodes, releasedEpisodes, launchDate);
		seasons[0] = season;


		for (int i = 0; i < products.length; i++) {
			Series serie = new Series(seriesName, seriesDirector, seriesSinopsis, seriesTrailer,mainCh, seasons[], motive,isCensored);
			products[i] = serie;
		}



	}
	
	public void addMovie(String name, String movieDirector, String movieSinopsis, String movieTrailer, int mDay, int mMonth, int mYear, int mPegi, String mProducer, int genren){
		Genre newGenre = Genre.NONE;
		switch (genren){
			case 1:
				newGenre = Genre.HORROR;
				break;
			case 2:
				newGenre = Genre.ROMANCE;
				break;
			case 3:
				newGenre = Genre.COMEDY;
				break;
			case 4:
				newGenre = Genre.ACTION;
				break;
			case 5:
				newGenre = Genre.SUSPENSE;
				break;
		}
		Date premiereDate = new Date(mDay,mMonth,mYear);

		for (int i = 0; i < products.length; i++) {
			if(products[i] == null){
				Movie mov = new Movie(name, movieDirector, movieSinopsis, movieTrailer, mPegi, mProducer, premiereDate, newGenre);
				products[i] = mov;
			}

		}





	}
	public String search(String search){
		for (int i = 0; i < products.length; i++) {
			if(products[i] != null){
				if(products[i].getName().equals(search)){
					return products[i].toString();

				}
			}
		}
		return "";
	}
	
	public void addSeason(String name, int seasonNum, int programmedEpisodes, int releasedEpisodes, int sDay,int sMonth,int sYear){

		for (int i = 0; i < seasons.length; i++) {
			if(seasons[i] == null){
				Date releaseDate = new Date(sDay,sMonth,sYear);
				Season newSeason = new Season(seasonNum, programmedEpisodes, releasedEpisodes,releaseDate);
				seasons[i] = newSeason;
			}
		}
	}
	//getters & setters


	public String getWebAddress() {
		return webAddress;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public Season[] getSeasons() {
		return seasons;
	}
	public void setSeasons(Season[] seasons) {
		this.seasons = seasons;
	}
	public Subscriber[] getSubscriber() {
        return subscriber;
    }
    public void setSubscriber(Subscriber[] subscriber) {
        this.subscriber = subscriber;
    }
	public String getNit() {
        return nit;
    }
	public void setNit(String nit) {
        this.nit = nit;
    }
	public String getwebAddress() {
        return webAddress;
    }
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	public String getWebSite() {
        return webSite;
    }
	public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
	


}