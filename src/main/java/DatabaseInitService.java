import org.flywaydb.core.Flyway;



public class DatabaseInitService {
    public void initDb() {
        String connectionUrl = new Preferences().getPref(Preferences.DB_JDBC_CONNECTION_URL);
        Flyway flyway = Flyway
                .configure()
                .dataSource(connectionUrl, null, null)
                .load();
        flyway.migrate();
    }

}
