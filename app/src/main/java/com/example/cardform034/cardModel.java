package com.example.cardform034;

public class cardModel extends ApplicationClass {
    private int nocFormID;

    private String DegreeStatus;
    private String CGPA;
    private String InstituteWhereStudied;
    private String InstituteMigratedTo;
    private String NocDepositedFee;
    private String ChallanNo;
    private String DepositDate;
    private String Address;
    private String MobileNo;
    private String LandlineOrPTCl;
    private String MobileOfGuardian;
    private String ModeOfReceive;

    public int getNocFormID() {
        return nocFormID;
    }

    public void setNocFormID(int nocFormID) {
        this.nocFormID = nocFormID;
    }



    public String getDegreeStatus() {
        return DegreeStatus;
    }

    public void setDegreeStatus(String degreeStatus) {
        DegreeStatus = degreeStatus;
    }

    public String getInstituteWhereStudied() {
        return InstituteWhereStudied;
    }

    public void setInstituteWhereStudied(String instituteWhereStudied) {
        InstituteWhereStudied = instituteWhereStudied;
    }

    public String getInstituteMigratedTo() {
        return InstituteMigratedTo;
    }

    public void setInstituteMigratedTo(String instituteMigratedTo) {
        InstituteMigratedTo = instituteMigratedTo;
    }

    public String getNocDepositedFee() {
        return NocDepositedFee;
    }

    public void setNocDepositedFee(String nocDepositedFee) {
        NocDepositedFee = nocDepositedFee;
    }

    public String getChallanNo() {
        return ChallanNo;
    }

    public void setChallanNo(String challanNo) {
        ChallanNo = challanNo;
    }

    public String getDepositDate() {
        return DepositDate;
    }

    public void setDepositDate(String depositDate) {
        DepositDate = depositDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getLandlineOrPTCl() {
        return LandlineOrPTCl;
    }

    public void setLandlineOrPTCl(String landlineOrPTCl) {
        LandlineOrPTCl = landlineOrPTCl;
    }

    public String getMobileOfGuardian() {
        return MobileOfGuardian;
    }

    public void setMobileOfGuardian(String mobileOfGuardian) {
        MobileOfGuardian = mobileOfGuardian;
    }

    public String getCGPA() {
        return CGPA;
    }

    public void setCGPA(String CGPA) {
        this.CGPA = CGPA;
    }

    public String getModeOfReceive() {
        return ModeOfReceive;
    }

    public void setModeOfReceive(String modeOfReceive) {
        ModeOfReceive = modeOfReceive;
    }

    public cardModel(int FormID, String name, String soORdo, String registrationNo, String rollNo,
                     String department, String program, String degreeStatus, String CGPA , String instituteWhereStudied,
                     String instituteMigratedTo, String nocDepositedFee, String challanNo, String depositDate,
                     String address, String mobileNo, String landlineOrPTCl,
                     String mobileOfGuardian, String modeOfReceive) {
        nocFormID = FormID;
        super.setName(name);
        super.setSoORdo(soORdo);//SoORdo = soORdo;
        super.setRegistrationNo(registrationNo);//RegistrationNo = registrationNo;
        super.setRollNo(rollNo);//RollNo = rollNo;
        super.setDepartment(department);//Department = department;
        super.setProgram(program);//Program = program;
        DegreeStatus = degreeStatus;
        this.CGPA = CGPA;
        InstituteWhereStudied = instituteWhereStudied;
        InstituteMigratedTo = instituteMigratedTo;
        NocDepositedFee = nocDepositedFee;
        ChallanNo = challanNo;
        DepositDate = depositDate;
        Address = address;
        MobileNo = mobileNo;
        LandlineOrPTCl = landlineOrPTCl;
        MobileOfGuardian = mobileOfGuardian;
        ModeOfReceive = modeOfReceive;
    }
    public cardModel(String name, String soORdo, String registrationNo, String rollNo,
                     String department, String program, String degreeStatus, String CGPA , String instituteWhereStudied,
                     String instituteMigratedTo, String nocDepositedFee, String challanNo, String depositDate,
                     String address, String mobileNo, String landlineOrPTCl,
                     String mobileOfGuardian, String modeOfReceive) {

        super.setName(name);
        super.setSoORdo(soORdo);//SoORdo = soORdo;
        super.setRegistrationNo(registrationNo);//RegistrationNo = registrationNo;
        super.setRollNo(rollNo);//RollNo = rollNo;
        super.setDepartment(department);//Department = department;
        super.setProgram(program);//Program = program;
        DegreeStatus = degreeStatus;
        this.CGPA = CGPA;
        InstituteWhereStudied = instituteWhereStudied;
        InstituteMigratedTo = instituteMigratedTo;
        NocDepositedFee = nocDepositedFee;
        ChallanNo = challanNo;
        DepositDate = depositDate;
        Address = address;
        MobileNo = mobileNo;
        LandlineOrPTCl = landlineOrPTCl;
        MobileOfGuardian = mobileOfGuardian;
        ModeOfReceive = modeOfReceive;
    }
    public cardModel(String name, String Regno, String Rollno){
        super.setName(name);
        super.setRollNo(Rollno);//RollNo = rollNo;
        super.setRegistrationNo(Regno);//RegistrationNo = registrationNo;
    }

    @Override
    public String toString() {
        return
                 nocFormID +
                ", " + super.getName() +
                ", " + super.getSoORdo() +
                ", " + super.getRegistrationNo() +
                ", " + super.getRollNo() +
                ", " + super.getDepartment() +
                ", " + super.getProgram() +
                ", " + DegreeStatus +
                ", " + CGPA +
                ", " + InstituteWhereStudied +
                ", " + InstituteMigratedTo +
                ", " + NocDepositedFee +
                ", " + ChallanNo +
                ", " + DepositDate +
                ", " + Address +
                ", " + MobileNo +
                ", " + LandlineOrPTCl +
                ", " + MobileOfGuardian +
                ", " + ModeOfReceive;


    }
    public String forRead() {
        return
                nocFormID +
                        ",Name = " + super.getName() +
                        ", SoORdo = " + super.getSoORdo() +
                        ", RegistrationNo = " + super.getRegistrationNo() +
                        ", RollNo = " + super.getRollNo() +
                        ", Department = " + super.getDepartment() +
                        ", Program = " + super.getProgram() +
                        ", DegreeStatus = " + DegreeStatus +
                        ", CGPA = " + CGPA +
                        ", InstituteWhereStudied = " + InstituteWhereStudied +
                        ", InstituteMigratedTo = " + InstituteMigratedTo +
                        ", NocDepositedFee = " + NocDepositedFee +
                        ", ChallanNo = " + ChallanNo +
                        ", DepositDate = " + DepositDate +
                        ", Address = " + Address +
                        ", MobileNo = " + MobileNo +
                        ", LandlineOrPTCl = " + LandlineOrPTCl +
                        ", MobileOfGuardian = " + MobileOfGuardian +
                        ", ModeOfReceive = " + ModeOfReceive;

    }

}
