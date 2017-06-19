package pe.edu.utp.dataaccess.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Creado por Ronald Estela on 17/06/2017.
 */
public class Topic {
    private String id;
    private Matter matter;
    private String name;

    public Topic() {
    }

    public Topic(String id, Matter matter, String name) {
        this.id = id;
        this.matter = matter;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Topic setId(String id) {
        this.id = id;
        return this;
    }

    public Matter getMatter() {
        return matter;
    }

    public Topic setMatter(Matter matter) {
        this.matter = matter;
        return this;
    }

    public String getName() {
        return name;
    }

    public Topic setName(String name) {
        this.name = name;
        return this;
    }
    public static Topic build(ResultSet rs, MatterEntity matterEntity) {
        try {
            return (new Topic())
                    .setId(rs.getString("id_topics"))
                    .setName(rs.getString("name_topic"))
                    .setMatter(matterEntity.findById(rs.getString("id_matter")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}