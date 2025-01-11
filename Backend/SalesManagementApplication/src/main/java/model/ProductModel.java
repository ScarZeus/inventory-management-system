package model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ProductModel {
    @Id
    private Long id;
    private String name;
    private int count;
    private long price;
    private String category;
    private String manufacturer;
    private String batchNumber;
    private int quantity;
    private LocalDate expiryDate;
    private double pricePerUnit;
    private String location;
    private boolean criticalItem;
    private LocalDate lastUpdated;


    public ProductModel(Long id, String name,int count,long price , String category, String manufacturer, String batchNumber, int quantity, LocalDate expiryDate, double pricePerUnit, String location, boolean criticalItem, LocalDate lastUpdated) {
        this.id = id;
        this.name = name;
        this.count=count;
        this.price=price;
        this.category = category;
        this.manufacturer = manufacturer;
        this.batchNumber = batchNumber;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.pricePerUnit = pricePerUnit;
        this.location = location;
        this.criticalItem = criticalItem;
        this.lastUpdated = lastUpdated;
    }

    public ProductModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isCriticalItem() {
        return criticalItem;
    }

    public void setCriticalItem(boolean criticalItem) {
        this.criticalItem = criticalItem;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", quantity=" + quantity +
                ", expiryDate=" + expiryDate +
                ", pricePerUnit=" + pricePerUnit +
                ", location='" + location + '\'' +
                ", criticalItem=" + criticalItem +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
