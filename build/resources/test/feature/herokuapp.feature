Feature: Administration hospital system

  @DoctorRegist
  Scenario: register doctor
    Given that the admin needs to entry at platform
    When She does the doctor regist in the administration hospital system
      | name   | last_name | tel_number | id_type              | id_number |
      | Julian | Duque     | 5860017    | Cédula de ciudadanía | 234611    |
    Then She will verify on the screen the message Datos guardados correctamente.

  @PatientRegist
  Scenario: register patient
    Given that the user needs to entry at platform
    When She does the patient regist in the administration hospital system
      | name     | last_name | tel_number | id_type              | id_number |
      | Carolina | Duque     | 5860017    | Cédula de ciudadanía | 876543211 |
    Then She will verify on the screen the message Datos guardados correctamente.

  @DateAppointment
  Scenario: to do hospital appointment
    Given that the user needs to entry at platform
    When  She entries the corresponses data to the appointment
      | date       | id_patient | id_doctor | observations                           |
      | 25/11/1993 | 876543211  | 234611    | y asi se abrira un ventana en el cielo |
    Then She will verify on the screen the message Datos guardados correctamente.








