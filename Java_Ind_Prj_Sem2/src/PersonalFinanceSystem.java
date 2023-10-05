import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.util.Scanner;

public class PersonalFinanceSystem {

    static FileWriter fw;

    static Scanner scanner = new Scanner(System.in);
    static Connection connection;

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("[yyyy-MM-dd HH:mm:ss]");
    static LocalDateTime now = LocalDateTime.now();

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            File f = new File("Java_Ind_Prj_Sem2/log/log.log");

            if (!f.exists()) {
                System.out.println("Creating Log File...");
                f.createNewFile();
            }
            fw = new FileWriter(f, true);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personalFinanceSystem",
                    "root", "");
            if (connection != null) {
                System.out.println("Connection Success !");
            } else {
                System.out.println("Connection Failed !");
                System.exit(0);
            }

            while (true) {

                try {

                    System.out.println("Personal Finance System");
                    System.out.println("1. Record Expense");
                    System.out.println("2. Record Income");
                    System.out.println("3. View Transactions");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    int choice;
                    while (true) {
                        try {
                            choice = scanner.nextInt();
                            break;
                        } catch (Exception e) {
                            scanner.nextLine();
                        }
                    }

                    switch (choice) {
                        case 1:

                            recordExpense();

                            break;
                        case 2:
                            recordIncome();
                            break;
                        case 3:
                            viewTransactions();
                            break;
                        case 4:
                            System.out.println("Exiting the program.");
                            scanner.close();
                            connection.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                } catch (Exception e) {
                    fw.write("\r\n" + dtf.format(now) + "-->" + e.toString() + "\r\n");
                    System.out.print("Invalid Input.");
                }
            }
        } catch (

        Exception e) {
            System.out.println("Some Error Occured !");
            // e.printStackTrace();

            fw.write("\r\n" + dtf.format(now) + "-->" + e.toString() + "\r\n");

            fw.close();

        }

    }

    static void recordExpense() throws Exception {
        while (true) {
            try {

                String sql = "INSERT INTO Transactions (user_id, category_id, amount, description, date) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                System.out.print("Enter the user ID: ");
                int userId;
                while (true) {
                    try {
                        userId = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");
                        scanner.nextLine();
                    }
                }
                preparedStatement.setInt(1, userId);

                System.out.print("Enter the category ID for the expense: ");
                int categoryId;
                while (true) {
                    try {
                        categoryId = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");
                        scanner.nextLine();
                    }
                }
                preparedStatement.setInt(2, categoryId);

                System.out.print("Enter the expense amount: ");
                double amount;
                while (true) {
                    try {
                        amount = scanner.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");
                        System.out.print("Invalid Input.");
                        scanner.nextLine();
                    }
                }
                preparedStatement.setDouble(3, amount);

                System.out.print("Enter a description for the expense: ");
                String description;
                while (true) {
                    try {
                        description = scanner.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid Input.");

                    }
                }
                preparedStatement.setString(4, description);

                System.out.print("Enter the date (YYYY-MM-DD) of the expense: ");
                String dateStr;
                while (true) {
                    try {
                        dateStr = scanner.nextLine();
                        Date date = Date.valueOf(dateStr);
                        preparedStatement.setDate(5, date);
                        break;
                    } catch (Exception e) {
                    }
                }

                int rowsInserted = preparedStatement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("Expense recorded successfully.");
                } else {
                    System.out.println("Failed to record expense.");
                }
                break;
            } catch (Exception e) {
                // e.printStackTrace();

                System.out.println("Error Occered.");

                fw.write("\r\n" + dtf.format(now) + "-->" + e.toString() + "\r\n");

            }
        }
    }

    static void recordIncome() throws Exception {
        while (true) {
            try {
                System.out.print("Enter the user ID: ");
                int userId = 0;

                while (true) {
                    try {
                        userId = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");
                        scanner.nextLine();
                    }
                }

                System.out.print("Enter the category ID for the income: ");
                int categoryId;
                while (true) {
                    try {
                        categoryId = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");
                        scanner.nextLine();
                    }
                }

                System.out.print("Enter the income amount: ");
                double amount;
                while (true) {
                    try {
                        amount = scanner.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");
                        scanner.nextLine();
                    }
                }

                System.out.print("Enter a description for the income: ");
                String description;
                while (true) {
                    try {
                        description = scanner.nextLine();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");

                    }
                }

                Date date;
                while (true) {
                    try {
                        System.out.print("Enter the date (YYYY-MM-DD) of the income: ");
                        String dateStr = scanner.nextLine();

                        date = Date.valueOf(dateStr);
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");

                        fw.write("\r\n" + dtf.format(now) + "-->" + e.toString() + "\r\n");
                    }
                }

                String insertIncomeQuery = "INSERT INTO Transactions (user_id, category_id, amount, description, date) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertIncomeQuery);
                preparedStatement.setInt(1, userId);
                preparedStatement.setInt(2, categoryId);
                preparedStatement.setDouble(3, amount);
                preparedStatement.setString(4, description);
                preparedStatement.setDate(5, date);

                int rowsInserted = preparedStatement.executeUpdate();

                if (rowsInserted > 0) {
                    System.out.println("Income recorded successfully.");
                } else {
                    System.out.println("Failed to record income.");
                }
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("ERR --> Try Again.");
                fw.write("\r\n" + dtf.format(now) + "-->" + e.toString() + "\r\n");
            }
            break;
        }
    }

    static void viewTransactions() throws Exception {

        while (true) {
            try {
                System.out.print("Enter the user ID to view transactions: ");
                int userId;
                while (true) {
                    try {
                        userId = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.print("Invalid Input.");
                        scanner.nextLine();
                    }
                }

                System.out.println("\n");

                String query = "SELECT * FROM transactions WHERE user_id = ?".toLowerCase();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, userId);

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    int transactionId = resultSet.getInt("transaction_id");
                    int categoryId = resultSet.getInt("category_id");
                    double amount = resultSet.getDouble("amount");
                    String description = resultSet.getString("description");
                    Date date = resultSet.getDate("date");

                    System.out.println("Transaction ID: " + transactionId);
                    System.out.println("Category ID: " + categoryId);
                    System.out.println("Amount: " + amount);
                    System.out.println("Description: " + description);
                    System.out.println("Date: " + date);
                    System.out.println("-----------------------");
                }

                resultSet.close();
                scanner.nextLine();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Something went Horribaly wrong , try again.");

                fw.write("\r\n" + dtf.format(now) + "-->" + e.toString() + "\r\n");
            }
        }

    }

}
