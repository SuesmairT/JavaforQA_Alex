package Telran.HW020524;

import java.util.*;

public class Ticket implements Comparable<Ticket> {
    private String fullName;
    private int ticketNumber;
    private String doctorName;

    public Ticket(String fullName, int ticketNumber, String doctorName) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.doctorName = doctorName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    @Override
    public int compareTo(Ticket other) {
        return Integer.compare(this.ticketNumber, other.ticketNumber);
    }

    public static void main(String[] args) {
        // Создание множества для хранения талонов
        Set<Ticket> queue = new TreeSet<>();

        // Симуляция выдачи талонов и построения очереди
        Ticket ticket1 = new Ticket("Иванов Иван Иванович", 101, "Терапевт");
        Ticket ticket2 = new Ticket("Петров Петр Петрович", 102, "Офтальмолог");
        Ticket ticket3 = new Ticket("Сидоров Сидор Сидорович", 103, "Лор");
        Ticket ticket4 = new Ticket("Козлов Козел Козлович", 104, "Хирург");

        queue.add(ticket1);
        queue.add(ticket3);
        queue.add(ticket4);
        queue.add(ticket2);

        // Симуляция обслуживания по номеру талона
        System.out.println("Обслуживание ведется по номеру талона:");
        for (Ticket ticket : queue) {
            System.out.println(ticket.getFullName() + " (" + ticket.getDoctorName() + ")");
        }
    }
}