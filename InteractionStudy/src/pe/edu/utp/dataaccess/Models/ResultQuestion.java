package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Gustavo Espinoza on 17/06/2017.
 */
public class ResultQuestion {
    private String id_resultQuestion;
    private Question question;
    private String option;

    public ResultQuestion(String id_resultQuestion, Question question, String option) {
        this.id_resultQuestion = id_resultQuestion;
        this.question = question;
        this.option = option;
    }

    public ResultQuestion() {
    }

    public String getId_resultQuestion() {
        return id_resultQuestion;
    }

    public ResultQuestion setId_resultQuestion(String id_resultQuestion) {
        this.id_resultQuestion = id_resultQuestion;
        return this;
    }

    public Question getQuestion() {
        return question;
    }

    public ResultQuestion setQuestion(Question question) {
        this.question = question;
        return this;
    }

    public String getOption() {
        return option;
    }

    public ResultQuestion setOption(String option) {
        this.option = option;
        return this;
    }
}
