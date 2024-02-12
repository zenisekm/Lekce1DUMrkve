package com.engeto.ja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate birthdate;
    private int contracts;
    private BigDecimal carrotsWeight;
    private String city;
    private String spzNumber;
    private BigDecimal consumption;
    private int ipAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getContracts() {
        return contracts;
    }

    public void setContracts(int contracts) {
        this.contracts = contracts;
    }

    public BigDecimal getCarrotsWeight() {
        return carrotsWeight;
    }

    public void setCarrotsWeight(BigDecimal carrotsWeight) {
        this.carrotsWeight = carrotsWeight;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpzNumber() {
        return spzNumber;
    }

    public void setSpzNumber(String spzNumber) {
        this.spzNumber = spzNumber;
    }

    public BigDecimal getConsumption() {
        return consumption;
    }

    public void setConsumption(BigDecimal consumption) {
        this.consumption = consumption;
    }

    public int getIpAddress() {
        return ipAddress;
    }

    public Employee(String name, LocalDate birthdate,
                    int contracts, BigDecimal carrotsWeight,
                    String city, String spzNumber,
                    BigDecimal consumption, int ipAddress) {
        this.name = name;
        this.birthdate = birthdate;
        this.contracts = contracts;
        this.carrotsWeight = carrotsWeight;
        this.city = city;
        this.spzNumber = spzNumber;
        this.consumption = consumption;
        this.ipAddress = ipAddress;
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;










    }
}

