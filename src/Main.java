import java.util.Arrays;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {


        class Currency {
            private String code;
            private double exchangeRate;

            public Currency(String code, double exchangeRate) {
                this.code = code;
                this.exchangeRate = exchangeRate;
            }


        }

        class User {
            private String firstName;
            private String lastName;
            private String email;

            public User(String firstName, String lastName, String email) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
            }


        }
        interface UserType {
            String value();
        }


        class RegularUser extends User {
            private int activityLevel;

            public RegularUser(String firstName, String lastName, String email, int activityLevel) {
                super(firstName, lastName, email);
                this.activityLevel = activityLevel;
            }


        }

        class PremiumUser extends User {
            private boolean isPremium;

            public PremiumUser(String firstName, String lastName, String email, boolean isPremium) {
                super(firstName, lastName, email);
                this.isPremium = isPremium;
            }

        }

        class BankAccount {
            private User owner;
            private Currency currency;
            private double balance;

            public BankAccount(User owner, Currency currency, double balance) {
                this.owner = owner;
                this.currency = currency;
                this.balance = balance;
            }

            public double convertBalanceToCurrency(Currency targetCurrency) {
                return balance * targetCurrency.getExchangeRate() / currency.getExchangeRate();
            }

            public void printAccountInfo() {
                System.out.println("Account owner: " + owner.getFirstName() + " " + owner.getLastName());
                System.out.println("Email: " + owner.getEmail());
                System.out.println("Currency: " + currency.getCode());
                System.out.println("Balance: " + balance);
            }
        }

        class Main2 {
            public static void main(String[] args) {
                Currency usd = new Currency("USD", 1.0);
                Currency eur = new Currency("EUR", 0.85);

                User user1 = new RegularUser("John", "Doe", "john@example.com", 3);
                User user2 = new PremiumUser("Alice", "Smith", "alice@example.com", true);

                BankAccount account1 = new BankAccount(user1, usd, 1000.0);
                BankAccount account2 = new BankAccount(user2, eur, 2000.0);

                account1.printAccountInfo();
                System.out.println("Converted balance to EUR: " + account1.convertBalanceToCurrency(eur));

                account2.printAccountInfo();
                System.out.println("Converted balance to USD: " + account2.convertBalanceToCurrency(usd));
            }
        }
        }
    }
