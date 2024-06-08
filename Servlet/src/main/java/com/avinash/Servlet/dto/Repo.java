package com.avinash.Servlet.dto;

//step 1 - importing the package
import com.avinash.Servlet.model.Student;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//loading the driver

@Repository
public class Repo {
    private String jdbcURL = "jdbc:mysql://localhost:3306/jdbc";
    private String jdbcUsername = "root";
    private String jdbcPassword = "1234";
    private Connection jdbcConnection;

    //constructor
//    public Repo() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        jdbcConnection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
//    }

    //getdata
    public Student getData(int sid) throws SQLException, ClassNotFoundException {

        //list to store Student objects
//        List<Student> students = new ArrayList<>();

        Class.forName("com.mysql.cj.jdbc.Driver");
        jdbcConnection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        //sql query
        String sql = "Select * from students where sid = "+sid+";";

        //Statement
        PreparedStatement preparedStatement = jdbcConnection.prepareStatement(sql);

        //Execution
        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();
        int id = resultSet.getInt("sid");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        int marks = resultSet.getInt("marks");
        Student s = new Student();
        s.setSid(id);
        s.setFirst_name(firstName);
        s.setLast_name(lastName);
        s.setMarks(marks);
        System.out.println(s);
        jdbcConnection.close();
        return s;
    }

    //addData
    public String addData(Student student) throws ClassNotFoundException, SQLException {
        //loading class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //creating connection
        jdbcConnection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);

        //sql query
        String sql = "insert into students values(?,?,?,?)";

        //Prepared Statement
        PreparedStatement preparedStatement = jdbcConnection.prepareStatement(sql);
        preparedStatement.setInt(1, student.getSid());
        preparedStatement.setString(2, student.getFirst_name());
        preparedStatement.setString(3, student.getLast_name());
        preparedStatement.setInt(4, student.getMarks());

        //inserting the values
        int rowsInserted = preparedStatement.executeUpdate();

        jdbcConnection.close();;
        if(rowsInserted>0){
            return "Success!";
        }else{
            return "Failed!";
        }
    }

}
