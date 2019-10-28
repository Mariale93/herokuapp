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


    public String getLast_name() {
        return last_name;
    }


    public String getTel_number() {
        return tel_number;
    }


    public String getId_type() {
        return id_type;
    }


    public String getId_number() {
        return id_number;
    }

}
