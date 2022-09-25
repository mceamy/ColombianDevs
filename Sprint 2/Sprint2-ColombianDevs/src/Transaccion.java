public class Transaccion {
private Long id;
private String concept;
private Amount float;
private User user;


//CONSTRUCTOR//
    public transaction(long id, String concept, Amount float, User User) {
        this.id = id;
        this.concept = concepto;
        this.float = cantidad;
        this.user = usuario;
    }

//GETTERS Y SETTERS//
public void setId (Long id) {this.id = id;}
public Long getId () {return this.id;} 
public void setConcept (String concept) {this.concept = concepto;}
public Long getConcept () {return this.concept;} 
public void setAmount (Amount float) {this.float = cantidad;}
public Long getAmount () {return this.float;} 
public void setUser (User user) {this.user = usuario;}
public Long getUser () {return this.user;} 
}


   