public class LoginDao
{
    public Login()
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:")
        }
    }
}