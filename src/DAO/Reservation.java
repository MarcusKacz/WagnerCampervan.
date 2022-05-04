package DAO;

import java.time.LocalDate;

public class Reservation {


    private int reservationID, week, camperID, customerID, insuranceID, drivenKM;
    private boolean depositPaid;
    private LocalDate reservationDate;



    public Reservation(int Week, int CamperID, int CustomerID, int InsuranceID, int DrivenKM, boolean DepositPaid, LocalDate ReservationDate) {
        week = Week;
        camperID = CamperID;
        customerID = CustomerID;
        insuranceID = InsuranceID;
        drivenKM = DrivenKM;
        depositPaid = DepositPaid;
        reservationDate = ReservationDate;
    }








    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getCamperID() {
        return camperID;
    }

    public void setCamperID(int camperID) {
        this.camperID = camperID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
    }

    public int getDrivenKM() {
        return drivenKM;
    }

    public void setDrivenKM(int drivenKM) {
        this.drivenKM = drivenKM;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }
}
