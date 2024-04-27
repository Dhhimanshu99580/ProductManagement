package com.himanshu.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//public class productDb {
//
//    Connection conn = null;
//    public productDb() throws SQLException {
//        try {
//            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/productManagement","postgres","1397");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void save(Product p) throws SQLException {
//        String query = "insert into product(name,type,place,warranty) values(?,?,?,?)";
//        PreparedStatement st = conn.prepareStatement(query);
//        st.setString(1,p.getName());
//        st.setString(2,p.getType());
//        st.setString(3,p.getPlace());
//        st.setInt(4,p.getWarranty());
//        st.execute();
//    }
//
//    public List<Product> getAll() throws SQLException {
//        List<Product> products = new ArrayList<>();
//        String query = "select name,type,place,warranty from product";
//        PreparedStatement st = conn.prepareStatement(query);
//        ResultSet rs = st.executeQuery();
//        while(rs.next()) {
//            Product p = new Product();
//            p.setName(rs.getString(1));
//            p.setType(rs.getString(2));
//            p.setPlace(rs.getString(3));
//            p.setWarranty(rs.getInt(4));
//            products.add(p);
//        }
//        return products;
//    }
//}

@Repository
public interface productDb extends JpaRepository<Product,Integer> {

}
