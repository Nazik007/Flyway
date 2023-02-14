import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Database database = Database.getInstance();
        new DatabaseInitService().initDb();
        ClientService clientService = new ClientService(database.getConnection());
        List<Client> res = clientService.listAll();
        System.out.println("res = " + res);

    }
}
