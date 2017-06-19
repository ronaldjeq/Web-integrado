package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Gustavo Espinoza on 17/06/2017.
 */
public class ResultSimulacrumDetail {
    private String id_resultSimulacrum;
    private ResultQuestion resultQuestion;
    private String result;

    public ResultSimulacrumDetail() {
    }

    public ResultSimulacrumDetail(String id_resultSimulacrum, ResultQuestion resultQuestion, String result) {
        this.id_resultSimulacrum = id_resultSimulacrum;
        this.resultQuestion = resultQuestion;
        this.result = result;
    }

    public String getId_resultSimulacrum() {
        return id_resultSimulacrum;
    }

    public ResultSimulacrumDetail setId_resultSimulacrum(String id_resultSimulacrum) {
        this.id_resultSimulacrum = id_resultSimulacrum;
        return this;
    }

    public ResultQuestion getResultQuestion() {
        return resultQuestion;
    }

    public ResultSimulacrumDetail setResultQuestion(ResultQuestion resultQuestion) {
        this.resultQuestion = resultQuestion;
        return this;
    }

    public String getResult() {
        return result;
    }

    public ResultSimulacrumDetail setResult(String result) {
        this.result = result;
        return this;
    }
}
