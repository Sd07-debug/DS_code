import java.util.ArrayList;
import java.util.List;

class Machine {
    private String name;
    private int localTime;

    public Machine(String name, int localTime) {
        this.name = name;
        this.localTime = localTime;
    }

    public int getLocalTime() {
        return localTime;
    }

    public void setLocalTime(int localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString() {
        return "Machine: " + name + ", Local Time: " + localTime;
    }
}

public class BerkeleyAlgorithm {
    public static void main(String[] args) {
        // Create machines with predefined date and time values
        List<Machine> machines = new ArrayList<>();
        machines.add(new Machine("A", 10)); // Predefined local time for machine A
        machines.add(new Machine("B", 15)); // Predefined local time for machine B
        machines.add(new Machine("C", 20)); // Predefined local time for machine C

        // Calculate average local time
        int sum = 0;
        for (Machine machine : machines) {
            sum += machine.getLocalTime();
        }
        int avgLocalTime = sum / machines.size();

        // Adjust local times
        for (Machine machine : machines) {
            int adjustment = avgLocalTime - machine.getLocalTime();
            if (adjustment != 0) { // Adjust only if necessary
                machine.setLocalTime(machine.getLocalTime() + adjustment);
            }
        }

        // Display adjusted times
        System.out.println("Adjusted Local Times:");
        for (Machine machine : machines) {
            System.out.println(machine);
        }
    }
}
