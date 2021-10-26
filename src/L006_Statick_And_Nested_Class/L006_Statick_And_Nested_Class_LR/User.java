package L006_Statick_And_Nested_Class.L006_Statick_And_Nested_Class_LR;

public class User {

    private String login;
    private String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {

        class Query {

            void printToLog() {

                System.out.println("User: ( Login: " + login + "; Password: " + password + "; ) sent request.");

            }

        }
    new Query().printToLog();

    }
}