package pl.coderslab.app;

public class DBStart {

    private static final String createTableCustomers = "CREATE TABLE Customers (id INT AUTO_INCREMENT, name VARCHAR(60), surname VARCHAR(60), PRIMARY KEY(id));\n";
    private static final String createTableEmployees = "CREATE TABLE Employees (id INT AUTO_INCREMENT, name VARCHAR(60), surname VARCHAR(60), address VARCHAR(60), phone INT(9), note VARCHAR(300), salary DECIMAL(6,2), PRIMARY KEY(id));";
    private static final String createTableOrders = "CREATE TABLE Orders (id INT AUTO_INCREMENT, reception_date VARCHAR(30), planning_repair_date VARCHAR(30), repair_start_date VARCHAR(30), repair_employee VARCHAR(30), problem VARCHAR(300), repair_plan VARCHAR(100), status INT(1), vehicle VARCHAR(60), PRIMARY KEY(id));\n";
    private static final String createTableStatus = "CREATE TABLE Status (id INT AUTO_INCREMENT, repair_status INT(1), repair_cost DECIMAL(6,2), PRIMARY KEY(id));";
    private static final String createTableVehicles = "CREATE TABLE Vehicles (id INT AUTO_INCREMENT, model VARCHAR(30), mark VARCHAR(30), year INT(4), registration_number VARCHAR(10), date_of_next_visit VARCHAR(10), PRIMARY KEY(id));";

}

