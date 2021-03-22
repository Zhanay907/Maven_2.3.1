import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void Registredcalculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void Registred1calculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 100_000_60;
        boolean registered = true;
        long expected = 500;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void Registred2calculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 10_000_60;
        boolean registered = true;
        long expected = 300;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void Registred3calculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 5_000_60;
        boolean registered = true;
        long expected = 150;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void DontRegistredcalculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @Test
    void DontRegistred2calculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 10_000_60;
        boolean registered = false;
        long expected = 100;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
    @Test
    void DontRegistred3calculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 2_000_60;
        boolean registered = false;
        long expected = 20;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
    @Test
    void DontRegistred4calculate() {
        BonusService service = new BonusService();

//        подготавливаем данные:
        long amount = 1_000_60;
        boolean registered = false;
        long expected = 10;

//        вызываем целевой метод:
        long actual = service.calculate(registered, amount);


// производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
}
