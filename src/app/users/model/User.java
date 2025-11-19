package app.users.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String username;
    private String password;

    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public User(int id, String firstName, String lastName, int age, String username, String password){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public User(String text) {
        String [] tokens = text.split(",");
        this.id = Integer.parseInt(tokens[0]);
        this.firstName = tokens[1];
        this.lastName = tokens[2];
        this.age = Integer.parseInt(tokens[3]);
        this.username = tokens[4];
        this.password = tokens[5];
    }

    private User (Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.username = builder.username;
        this.password = builder.password;

    }

    public static class Builder {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String username;
        private String password;

        public Builder id(int id) {
            this.id = id;
            return this;

        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder username(String username) {
            this.username = username;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public User build () {
            return new User(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }


}
