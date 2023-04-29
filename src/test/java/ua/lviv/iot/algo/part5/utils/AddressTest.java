package ua.lviv.iot.algo.part5.utils;

import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

class AddressTest {

    @BeforeEach
    void setUp() {
        Address address = new Address();
        String expected = "Mr and Mrs Dursley,ADDRESS, were proud to say that they were perfectly normal," +
                " thank you very much. They were the last people you’d expect to be involved in anything" +
                " strange or mysterious, because they just didn’t hold with such nonsense.";
        String address1 = "Mr and Mrs Dursley,London, str. Privet Drive, 4 were proud to say that they were perfectly" +
                " normal, thank you very much. They were the last people you’d expect to be involved in anything" +
                " strange or mysterious, because they just didn’t hold with such nonsense.";
        String address2 = "Mr and Mrs Dursley, were proud to say that they were perfectly normal, thank you very much." +
                " They were the last people you’d expect to be involved in anything strange or mysterious," +
                " because they just didn’t hold with such nonsense.";
        String address3 = "Mr and Mrs Dursley,London, str. Drive, 4 were proud to say that they were perfectly normal," +
                " thank you very much. They were the last people you’d expect to be involved in anything strange" +
                " or mysterious, because they just didn’t hold with such nonsense.";
        String address4 = "Mr and Mrs Dursley,London, str. Privet Drive, 4b were proud to say that they were" +
                " perfectly normal, thank you very much. They were the last people you’d expect to be involved" +
                " in anything strange or mysterious, because they just didn’t hold with such nonsense.";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAddress() {
        assertEquals();
    }
}