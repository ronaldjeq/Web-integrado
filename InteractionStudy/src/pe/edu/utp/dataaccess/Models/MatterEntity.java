package pe.edu.utp.dataaccess.Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 17/06/2017.
 */
public class MatterEntity extends BaseEntity {

    public MatterEntity(Connection connection) {
        super(connection, "matter");
    }

    public MatterEntity() {
        super();
    }

    List<Matter> findAll() {
        return findByCriteria("");
    }

    public Matter findById(String id) {
        String criteria = " matter_id = " + id;
        return findByCriteria(criteria).get(0);
    }

    public Matter findByName(String name) {
        String criteria = " matter_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Matter> findAllOrderedByName() {
        String criteria = "true ORDER BY matter_name";
        return findByCriteria(criteria);
    }


    public List<Matter> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<Matter> regions = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                regions.add((new Matter())
                        .setId(resultSet.getString("matter_id"))
                        .setName(resultSet.getString("matter_name")));
            }
            return regions;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Matter matter) {
        String sql = "INSERT INTO matters(matter_id, matter_name) " +
                "VALUES(" + matter.getIdAsString() + ", " +
                matter.getNameAsValue() + ")";
        return change(sql);
    }

    public boolean delete(Matter matter) {
        String sql = "DELETE FROM matters WHERE matter_id = " + matter.getIdAsString();
        return change(sql);
    }

    public boolean delete(String name) {
        return change("DELETE FROM matters WHERE matter_name = " +
                "'" + name + "'");
    }

    public boolean update(Matter matter) {
        String sql = "UPDATE regions SET matter_name = " + matter.getNameAsValue() +
                " WHERE matter_id = " + matter.getIdAsString();
        return change(sql);
    }

}
