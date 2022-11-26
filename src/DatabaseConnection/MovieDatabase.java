package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDatabase {


    static Connection connection;
    static Statement statement;

    static String schemaName = "MovieDatabase";
    static String movieTable = "BestMovies";

    public static void main(String[] args) throws Exception {

        Movie obj1 = new Movie(1, "Madmax", 8);
        Movie obj2 = new Movie(2, "Terminator", 7.5);
        Movie obj3 = new Movie(3, "Titanic", 9);
        Movie obj4 = new Movie(4, "Mission Impossible", 8.6);

        ArrayList<Movie> movieList = new ArrayList<>(Arrays.asList(obj1, obj2, obj3, obj4));

        connectToSql();
        writeToSql(movieList);
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

    public static void writeToSql(ArrayList<Movie> movies) throws Exception {

        try {
            statement = connection.createStatement();
            String querry = "";
            int rows = 0;

            for (int i = 0; i < movies.size(); i++) {
                querry = "INSERT INTO "+movieTable+" (ID, Name, Rating) VALUES ('" + i
                        + "','" + movies.get(i).getName() + "','" + movies.get(i).getRating() +"')";

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
            String query = "SELECT * FROM "+schemaName+"."+movieTable;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                // mysql table columns are id and prime.
                System.out.println(resultSet.getString("ID") + "  " + resultSet.getString("Name") +
                        " " + resultSet.getString("Rating"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
