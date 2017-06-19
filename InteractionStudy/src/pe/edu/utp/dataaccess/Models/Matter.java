package pe.edu.utp.dataaccess.Models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Creado por Jherson Aquino on 17/06/2017.
 */
public class Matter {
    private String id;
    private String name;

    public Matter() {
    }

    public Matter(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public String getNameAsValue() {
        return "'" + getName() + "'";
    }

    public String getId() {
        return id;
    }

    public Matter setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Matter setName(String name) {
        this.name = name;
        return this;
    }

    public static Matter build(ResultSet resultSet) {
        try {
            return (new Matter())
                    .setId(resultSet.getString("id_matter"))
                    .setName(resultSet.getString("name_matter"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}


