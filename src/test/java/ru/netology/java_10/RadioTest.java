package ru.netology.java_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void setCurrentStation_ValidNumber_Success() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStation_InvalidNumber_NoChange() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setVolume_ValidValue_Success() {
        Radio radio = new Radio();
        radio.setVolume(50);
       Assertions.assertEquals(50, radio.getVolume());
    }

    @Test
    public void setVolume_InvalidValue_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(150);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void nextStation_CurrentStationNot9_IncrementStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextStation_CurrentStationIs9_SetTo0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationNot0_DecrementStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void prevStation_CurrentStationIs0_SetTo9() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void increaseVolume_VolumeNotMaxValue_IncrementVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        Assertions.assertEquals(51, radio.getVolume());
    }

    @Test
    public void increaseVolume_VolumeIsMaxValue_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeNotMinValue_DecrementVolume() {
        Radio radio = new Radio();
        radio.setVolume(30);
        radio.decreaseVolume();
        Assertions.assertEquals(29, radio.getVolume());
    }

    @Test
    public void decreaseVolume_VolumeIsMinValue_NoChange() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }


}
