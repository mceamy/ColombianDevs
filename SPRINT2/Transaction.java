/// código  creado por la integrante Diana Carolina Gómez Zúñiga
/// cargado por el usuario scrum master, ya que dicha compañera
/// tenía problemas de conexión


public class transaction {
    private long transactionId;
    private String concept;
    private float Amount ;
    public User User;
    public Empresa Empresa;


    //CONSTRUCTOR//
    public transaction(long transactionId, String concept, Amount float, User User, Empresa Empresa) {
        this.transactionId = transactionId;
        this.concept = concept;
        this.Amount = Amount;
        this.user = User;
        this.Empresa = Empresa;
    }

//GETTERS Y SETTERS//

    // transactionId
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    // concept


    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getConcept() {
        return concept;
    }

    //Amount

    public void setAmount(float amount) {
        Amount = amount;
    }

    public float getAmount() {
        return Amount;
    }

    //user
    public void setUser(User user) {
        User = user;
    }

    public User getUser() {
        return User;
    }

    //empresa

    public void setEmpresa(Empresa empresa) {
        Empresa = empresa;
    }

    public Empresa getEmpresa() {
        return Empresa;
    }
}