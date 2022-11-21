public class Post {
    private String name;
    private String surname;
    private String patronymic;
    private String passport;
    private String phone;
    private boolean subscription;
    FormDate birthDate = new FormDate();

    public void setFullName(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public void setPassport(String passport) {
        if (passport.length() == 10) {
            this.passport = passport;
        }
    }

    public void setPhone(String phone) {
        if (phone.length() == 8) {
            this.phone = phone;
        }
    }

    public void setSubscription(boolean subscription) {
        this.subscription = subscription;
    }

    public void setBirthDate(int day, int month, int year) {
        if (day > 0 && month > 0 && year > 0) {
            birthDate.setBirthDay(day);
            birthDate.setBirthMonth(month);
            birthDate.setBirthYear(year);
        }
    }
}