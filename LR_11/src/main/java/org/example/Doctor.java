package org.example;

public class Doctor extends Professional {
    private String specialization;

    public Doctor(String name, int experience, double salary, String specialization) {
        super(name, experience, salary);
        this.specialization = specialization;
    }

    @Override
    public String getResponsibility() {
        return "Здоровье пациентов";
    }

    public void work(String patient, int hours) {
        System.out.println("Лечу пациента " + patient + " в течение " + hours + " часов");
    }

    public void work(int patients, boolean surgery) {
        System.out.println(surgery ? "Провожу операции: " + patients : "Принимаю пациентов: " + patients);
    }

    @Override
    public String toString() {
        return super.toString() + " специализация: " + specialization;
    }
}
