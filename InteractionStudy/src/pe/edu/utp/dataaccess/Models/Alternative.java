package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Walter Vega  on 17/06/2017.
 */
public class Alternative {


    private String id_alternative;
    private Question question;
    private String description;
    public Alternative() {
    }
    public Alternative(String id_alternative, Question question, String description) {
        this.id_alternative = id_alternative;
        this.question = question;
        this.description = description;
    }
    public String getId_alternative() {
        return id_alternative;
    }

    public Alternative setId_alternative(String id_alternative) {
        this.id_alternative = id_alternative;
        return this;
    }

    public Question getQuestion() {
        return question;
    }

    public Alternative setQuestion(Question question) {
        this.question = question;
        return  this;
    }

    public String getDescription() {
        return description;
    }

    public Alternative setDescription(String description) {
        this.description = description;
        return this;
    }
}
