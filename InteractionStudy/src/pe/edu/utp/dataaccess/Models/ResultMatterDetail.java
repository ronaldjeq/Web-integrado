package pe.edu.utp.dataaccess.Models;

/**
 * Creado por Jherson Aquino on 17/06/2017.
 */
public class ResultMatterDetail {
    private String id_resultMatter;
    private ResultQuestion resultQuestio;
    private String result;

    public ResultMatterDetail(String id_resultMatter, ResultQuestion resultQuestio, String result) {
        this.id_resultMatter = id_resultMatter;
        this.resultQuestio = resultQuestio;
        this.result = result;
    }

    public ResultMatterDetail() {
    }

    public String getId_resultMatter() {
        return id_resultMatter;
    }

    public ResultMatterDetail setId_resultMatter(String id_resultMatter) {
        this.id_resultMatter = id_resultMatter;
        return  this;
    }

    public ResultQuestion getResultQuestio() {
        return resultQuestio;
    }

    public ResultMatterDetail setResultQuestio(ResultQuestion resultQuestio) {
        this.resultQuestio = resultQuestio;
        return this;
    }

    public String getResult() {
        return result;
    }

    public ResultMatterDetail setResult(String result) {
        this.result = result;
        return this;
    }
}
