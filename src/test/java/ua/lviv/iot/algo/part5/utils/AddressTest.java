package ua.lviv.iot.algo.part5.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class AddressTest {
    private Address address;
    private final String expected = "Mr and Mrs Dursley,ADDRESS, were proud to say that they were perfectly normal," +
            " thank you very much. They were the last people you’d expect to be involved in anything" +
            " strange or mysterious, because they just didn’t hold with such nonsense.";
    private final String address1 = "Mr and Mrs Dursley,London, str. Privet Drive, 4 were proud to say that they were perfectly" +
            " normal, thank you very much. They were the last people you’d expect to be involved in anything" +
            " strange or mysterious, because they just didn’t hold with such nonsense.";
    private final String address2 = "Mr and Mrs Dursley, were proud to say that they were perfectly normal, thank you very much." +
            " They were the last people you’d expect to be involved in anything strange or mysterious," +
            " because they just didn’t hold with such nonsense.";
    private final String address3 = "Mr and Mrs Dursley,London, str. Drive, 4 were proud to say that they were perfectly normal," +
            " thank you very much. They were the last people you’d expect to be involved in anything strange" +
            " or mysterious, because they just didn’t hold with such nonsense.";
    private final String address4 = "Mr and Mrs Dursley,London, str. Privet Drive, 4b were proud to say that they were" +
            " perfectly normal, thank you very much. They were the last people you’d expect to be involved" +
            " in anything strange or mysterious, because they just didn’t hold with such nonsense.";

    @BeforeEach
    void setUp() {
        address = new Address();
    }

    @Test
    void findAddress() {
        InputStream inputStream1 = new ByteArrayInputStream(address1.getBytes());
        Assertions.assertEquals(expected, address.findAddress(expected));
        address.findAddress(expected);
        System.setIn(inputStream1);
    }
}