package p06_TirePressureMonitoringSystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AlarmTest {

    @Test
    public void testGetAlarmOnWithOverHighPressure() {
        Sensor mockedSensor = mock(Sensor.class);
        when(mockedSensor.popNextPressurePsiValue()).thenReturn(21.12);
        Alarm alarm = new Alarm(mockedSensor);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testGetAlarmOnWithOverLowPressure() {
        Sensor mockedSensor = mock(Sensor.class);
        when(mockedSensor.popNextPressurePsiValue()).thenReturn(15.90);
        Alarm alarm = new Alarm(mockedSensor);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testGetAlarmNotOnWithNormalPressure() {
        Sensor mockedSensor = mock(Sensor.class);
        when(mockedSensor.popNextPressurePsiValue()).thenReturn(18.12);
        Alarm alarm = new Alarm(mockedSensor);
        alarm.check();
        assertFalse(alarm.getAlarmOn());
    }
}