package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class FriendsDatabase {


        static Connection connection;
        static Statement statement;

        static String schemaName = "Friends Info";
        static String friends = "Information";

        public static void main(String[] args) throws Exception {
            Friends obj1 = new Friends(1, "Rafique", "01759999");
            Friends obj2 = new Friends(2, "Salam", "01758888");
            Friends obj3 = new Friends(3, "Sobuj", "01754444");
            Friends obj4 = new Friends(4, "Torun", "01751111");

            ArrayList<Friends> friendList = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4));

            connectToSql();
            writeToSql(friendList);
            readToSql();

        }

        public static void connectToSql() throws Exception {
            try {
                String driver = "com.mysql.cj.jdbc.Driver"; // Driver
                String url = "jdbc:mysql://localhost:3306/"+schemaName; // Location
                String userName = "root"; // UserName
                String password = "Fahima#3";
                Class.forName(driver);

                connection = DriverManager.getConnection(url, userName, password);
                System.out.println("Database connected...");
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        public static void writeToSql(ArrayList<Friends> friendList) throws Exception {

            try {
                statement = connection.createStatement();
                String querry = "";
                int rows = 0;

                for (int i = 0; i < friendList.size(); i++) {
                    querry = "INSERT INTO "+friends+" (ID, Name, Phone) VALUES ('" + i
                            + "','" + friendList.get(i).getName() + "','" + friendList.get(i).getPhone() +"')";

                    rows += statement.executeUpdate(querry);
                }

                if (rows > 0) {
                    System.out.println(rows + "rows has been updated..");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        public static void readToSql() throws Exception {
            try {
                statement = connection.createStatement();
                // sql query to get data from table
                String query = "SELECT * FROM "+schemaName+"."+friends;
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    // mysql table columns are id and prime.
                    System.out.println(resultSet.getString("ID") + "  " + resultSet.getString("Name") +
                            " " + resultSet.getString("Phone"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

