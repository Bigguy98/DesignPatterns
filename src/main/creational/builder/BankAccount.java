package main.creational.builder;

public class BankAccount {
    private String name; // required
    private String address;
    private String email;
    private String mobileBaking;
    private String newletter;
    private Integer age; // required
    private Long initMoney; // required

    private BankAccount(String name, String address, String email, String mobileBaking, String newletter, Integer age, Long initMoney) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileBaking = mobileBaking;
        this.newletter = newletter;
        this.age = age;
        this.initMoney = initMoney;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mobileBaking='" + mobileBaking + '\'' +
                ", newletter='" + newletter + '\'' +
                ", age=" + age +
                ", initMoney=" + initMoney +
                '}';
    }

    public static class BankAccountBuilder {
        private String name; // required
        private String address;
        private String email;
        private String mobileBaking;
        private String newletter;
        private Integer age; // required
        private Long initMoney; // required

        public BankAccountBuilder(String name, Integer age, Long initMoney) {
            this.name = name;
            this.age = age;
            this.initMoney = initMoney;
        }

        public BankAccountBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public BankAccountBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder setMobileBaking(String mobileBaking) {
            this.mobileBaking = mobileBaking;
            return this;
        }

        public BankAccountBuilder setNewletter(String newletter) {
            this.newletter = newletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this.name, this.address, this.email, this.mobileBaking, this.newletter,
                    this.age, this.initMoney);
        }
    }
}
