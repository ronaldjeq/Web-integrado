package pe.edu.utp.dataaccess.Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 17/06/2017.
 */
public class UserEntity extends BaseEntity {

    public UserEntity(Connection connection) {
        super (connection, "users" );
    }

    public UserEntity() {
        super();
    }

    List<User> findAll() {
        return findByCriteria("");
    }

    public User findById(String id) {
        String criteria = "WHERE id_user = '" + id + " ' ";
        return findByCriteria(criteria).get(0);
    }

    public User findByName(String name) {
        String criteria = "WHERE name_user = '" + name + "'";
        return findByCriteria(criteria).get(0);
    }


    public List<User> findAllOrderedByName(){
        String criteria = "TRUE ORDER BY region_name";
        return findByCriteria(criteria);
    }



    public List<User> findByCriteria(String criteria){
        String sql = getDefaultQuery() + criteria =="" ? "" : " WHERE " + criteria;
        List<User> users = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()) {

               users.add((new User()).setId(resultSet.getString("id_user")).setNameUser(resultSet.getString("name_user")));

            }
            return users;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
