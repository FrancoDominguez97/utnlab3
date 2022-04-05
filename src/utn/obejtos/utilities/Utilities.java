package utn.obejtos.utilities;

public  class Utilities {

    public static String generateRandomId(int length) {

        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder idRandSb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = (int) (alphaNumericString.length() * Math.random());
            idRandSb.append(alphaNumericString.charAt(index));
        }

        return idRandSb.toString();
    }
}
