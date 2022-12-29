package MathProblems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {

	static Connection connection;
	static Statement statement;

	static String schemaName = "PrimeNumberMidTerm";
	static String primeTable = "primes";

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		// 2,3,5,7,11,13.......


		connectToSql();
		List<Integer> primes = sieveOfEratosthenes(100);
		writeToSql(primes);
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

	public static void writeToSql(List<Integer> numbers) throws Exception {

		try {
			statement = connection.createStatement();
			String querry = "";
			int rows = 0;

			for (int i = 0; i < numbers.size(); i++) {
				querry = "INSERT INTO "+primeTable+" (id, prime) VALUES ('" + i
						+ "','" + numbers.get(i) + "')";

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
			String query = "SELECT * FROM "+schemaName+"."+primeTable;
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				// mysql table columns are id and prime.
				System.out.println(resultSet.getString("id") + "  " + resultSet.getString("prime"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}

