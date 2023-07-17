package module02;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JdbsApp {
    public static final String getAllProducts = "SELECT * FROM products;";

    public static void main(String[] args) {
        getAllProducts().forEach(System.out::println);
    }
    private static List<Products> getAllProducts() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = conn.prepareStatement(getAllProducts);
            ResultSet resultSet = query.executeQuery();
            List<Products> products = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("productid");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                products.add(new Products(id, name, price));
            }
            return products;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
