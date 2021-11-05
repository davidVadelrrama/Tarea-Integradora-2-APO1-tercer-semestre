package model;

public class Subscriber {

    

    private int age;
    private String id;
    private String completeName;
	private int horas;
    private Status status;
    Type type;

    //constructor
    public Subscriber(String completeName, int age, String id,int horas ,Status status, Type type) {
        this.age = age;
        this.id = id;
        this.completeName = completeName;
        this.horas = horas;
        this.status = status;
        this.type = type;
    }


   
    //getters & setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public int getHoras() {
    	return horas;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
