package edabit_questions;

public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

}

