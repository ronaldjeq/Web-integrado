package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Walter Vega on 17/06/2017.
 */
public class Answer {
    private String id_answwer;
    private Question question;
    private String answer_description;

    public Answer() {
    }

    public Answer(String id_answwer, Question question, String answer_description) {
        this.id_answwer = id_answwer;
        this.question = question;
        this.answer_description = answer_description;
    }

    public String getId_answwer() {
        return id_answwer;
    }

    public Answer setId_answwer(String id_answwer) {
        this.id_answwer = id_answwer;
        return  this;
    }

    public Question getQuestion() {
        return question;
    }

    public Answer setQuestion(Question question) {
        this.question = question;
        return this;
    }

    public String getAnswer_description() {
        return answer_description;
    }

    public Answer setAnswer_description(String answer_description) {
        this.answer_description = answer_description;
        return this;
    }
}
