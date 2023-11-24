package homework_nr_21;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String connectionString = "jdbc:postgresql://localhost/students?user=postgres&password=postgres";

    public static void main(String[] args) {

        addNewStudent();
        update();
        delete();
        infoTable();

    }

    public static void addNewStudent() {

        try (Connection connection = DriverManager.getConnection(connectionString)) {

            PreparedStatement preparedStatement = connection.prepareStatement(queriesSQL.INSERT_NEW_STUDENT.query);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter students Name");
            String name = scanner.nextLine();
            System.out.println("Enter new students age");
            int age = scanner.nextInt();
            System.out.println("Enter new students grade");
            int grade = scanner.nextInt();
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, grade);
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update() {

        try (Connection connection = DriverManager.getConnection(connectionString)) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter students Id");
            int id = scanner.nextInt();
            System.out.println("Enter new students grade");
            int grade = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement(queriesSQL.UPDATE_GRADE_STUDENT.query);
            preparedStatement.setInt(2, id);
            preparedStatement.setInt(1, grade);
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void infoTable() {
        try (Connection connection = DriverManager.getConnection(connectionString)) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(queriesSQL.INFO_TABLE.query);
            while (resultSet.next()) {
                System.out.print(resultSet.getString("name " + "|"));
                System.out.print(resultSet.getString("age  " + "|"));
                System.out.print(resultSet.getString("grade" + "|"));

                System.out.println();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete() {
        try (Connection connection = DriverManager.getConnection(connectionString)) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter students Id");
            int id = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement(queriesSQL.DELETE_STUDENT.query);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
