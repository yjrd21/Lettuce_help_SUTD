package com.example.loginregisterfirebase;

public class BoxStatusVariables {
    private String RVBoxAddress;
    private String RVPostalCode;
    private String RVBoxStatus;
    private int RVImage;

    public BoxStatusVariables(String RVBoxAddress, String RVPostalCode, String RVBoxStatus, int RVImage) {
        this.RVBoxAddress = RVBoxAddress;
        this.RVPostalCode = RVPostalCode;
        this.RVBoxStatus = RVBoxStatus;
        this.RVImage = RVImage;
    }

    public String getRVBoxAddress() {
        return RVBoxAddress;
    }

    public String getRVPostalCode() {
        return RVPostalCode;
    }

    public String getRVBoxStatus() {
        return RVBoxStatus;
    }

    public int getRVImage() {
        return RVImage;
    }
}
