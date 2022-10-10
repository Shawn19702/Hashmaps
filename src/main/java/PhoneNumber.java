public class PhoneNumber {
    private Integer PhoneNUmberss;

    public PhoneNumber(Integer phoneNUmberss) {
        PhoneNUmberss = phoneNUmberss;
    }

    public Integer getPhoneNUmberss() {
        return PhoneNUmberss;
    }

    public void setPhoneNUmberss(Integer phoneNUmberss) {
        PhoneNUmberss = phoneNUmberss;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "PhoneNUmberss=" + PhoneNUmberss +
                '}';
    }
}
