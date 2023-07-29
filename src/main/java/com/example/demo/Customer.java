package com.example.demo;

import java.util.Objects;

public class Customer {
        private Integer id;
        private String email;
        private String username;
        private String password;
        private float balance;
        private int id_user;

        public Customer(Integer id, String email, String username, String password, float balance, Integer id_user) {
            this.id = id;
            this.email = email;
            this.username = username;
            this.password = password;
            this.balance = balance;
            this.id_user = id_user;
        }

        public Customer() {
        }
        public void setId(Integer id) {
            this.id = id;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

        public void setId_user(int id_user) {
            this.id_user = id_user;
        }

        public Integer getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public float getBalance() {
            return balance;
        }

        public Integer getId_user() {
            return id_user;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return id == customer.id && Float.compare(customer.balance, balance) == 0 && id_user == customer.id_user && Objects.equals(email, customer.email) && Objects.equals(username, customer.username) && Objects.equals(password, customer.password);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, email, username, password, balance, id_user);
        }

        @Override
        public String toString() {
            return "users{" +
                    "id=" + id +
                    ", email='" + email + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", balance=" + balance +
                    ", id_user=" + id_user +
                    '}';
        }

    }
