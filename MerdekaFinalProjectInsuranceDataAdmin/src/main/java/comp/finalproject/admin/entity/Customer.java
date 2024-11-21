package comp.finalproject.admin.entity;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String gender;
    private int age;
    private boolean driving_license;
    private int region_code;
    private boolean prev_insured;
    private String vehicle_age;
    private boolean vehicle_damage;
    private int annual_premium;
    private int policy_sales_channel;
    private int vintage;
    private boolean response;

    public Customer(){}

    public Customer(String gender, int age, boolean driving_license, int region_code, boolean prev_insured, String vehicle_age,
                    boolean vehicle_damage, int annual_premium, int policy_sales_channel, int vintage, boolean response) {
        this.gender = gender;
        this.age = age;
        this.driving_license = driving_license;
        this.region_code = region_code;
        this.prev_insured = prev_insured;
        this.vehicle_age = vehicle_age;
        this.vehicle_damage = vehicle_damage;
        this.annual_premium = annual_premium;
        this.policy_sales_channel = policy_sales_channel;
        this.vintage = vintage;
        this.response = response;
    }

    public Customer(int id, String gender, int age, boolean driving_license, int region_code, boolean prev_insured, String vehicle_age,
                    boolean vehicle_damage, int annual_premium, int policy_sales_channel, int vintage, boolean response) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.driving_license = driving_license;
        this.region_code = region_code;
        this.prev_insured = prev_insured;
        this.vehicle_age = vehicle_age;
        this.vehicle_damage = vehicle_damage;
        this.annual_premium = annual_premium;
        this.policy_sales_channel = policy_sales_channel;
        this.vintage = vintage;
        this.response = response;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getDriving_license() {
        return driving_license;
    }

    public void setDriving_license(boolean driving_license) {
        this.driving_license = driving_license;
    }

    public int getRegion_code() {
        return region_code;
    }

    public void setRegion_code(int region_code) {
        this.region_code = region_code;
    }

    public boolean getPrev_insured() {
        return prev_insured;
    }

    public void setPrev_insured(boolean prev_insured) {
        this.prev_insured = prev_insured;
    }

    public String getVehicle_age() {
        return vehicle_age;
    }

    public void setVehicle_age(String vehicle_age) {
        this.vehicle_age = vehicle_age;
    }

    public boolean isVehicle_damage() {
        return vehicle_damage;
    }

    public void setVehicle_damage(boolean vehicle_damage) {
        this.vehicle_damage = vehicle_damage;
    }

    public int getAnnual_premium() {
        return annual_premium;
    }

    public void setAnnual_premium(int annual_premium) {
        this.annual_premium = annual_premium;
    }

    public int getPolicy_sales_channel() {
        return policy_sales_channel;
    }

    public void setPolicy_sales_channel(int policy_sales_channel) {
        this.policy_sales_channel = policy_sales_channel;
    }

    public int getVintage() {
        return vintage;
    }

    public void setVintage(int vintage) {
        this.vintage = vintage;
    }

    public boolean getResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
}
