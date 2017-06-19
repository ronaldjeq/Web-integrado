package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Gustavo Espinoza on 17/06/2017.
 */
public class ResultTopicDetail {
    private String id_resultTopic;
    private ResultQuestion resultQuestion;
    private String result;

    public ResultTopicDetail() {
    }

    public ResultTopicDetail(String id_resultTopic, ResultQuestion resultQuestion, String result) {
        this.id_resultTopic = id_resultTopic;
        this.resultQuestion = resultQuestion;
        this.result = result;
    }

    public String getId_resultTopic() {
        return id_resultTopic;
    }

    public ResultTopicDetail setId_resultTopic(String id_resultTopic) {
        this.id_resultTopic = id_resultTopic;
        return this;
    }

    public ResultQuestion getResultQuestion() {
        return resultQuestion;
    }

    public void setResultQuestion(ResultQuestion resultQuestion) {
        this.resultQuestion = resultQuestion;
    }

    public String getResult() {
        return result;
    }

    public ResultTopicDetail setResult(String result) {
        this.result = result;
        return this;
    }
}
