package co.com.choucair.certification.herokuapp.model;

public class Data {
    private String name;
    private String last_name;
    private String tel_number;
    private String id_type;
    private String id_number;
    private String date;
    private String id_patient;
    private String id_doctor;
    private String observations;

    public void setDate(String date) {
        this.date = date;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public void setId_doctor(String id_doctor) {
        this.id_doctor = id_doctor;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }


    public String getDate() {
        return date;
    }

    public String getId_patient() {
        return id_patient;
    }

    public String getId_doctor() {
        return id_doctor;
    }

    public String getObservations() {
        return observations;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
}
