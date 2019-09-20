package methods;

import org.apache.commons.lang.RandomStringUtils;

public class RandomString {
    public String generateRandomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public String generateRandomAddressMethod(int length) {
        return "Str" + " " + "Preciziei" + RandomStringUtils.randomAlphabetic(length);

    }

}
